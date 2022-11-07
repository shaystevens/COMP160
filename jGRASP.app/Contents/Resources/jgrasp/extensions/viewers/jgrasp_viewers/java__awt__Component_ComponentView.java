package jgrasp_viewers;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.InputEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import jgrasp.tool.BasicToolUtil;
import jgrasp.tool.URTextArea;
import jgrasp.Colors;
import jgrasp.Drawing;
import jgrasp.viewer.*;
import jgrasp.viewer.gui.SubViewer;
import jgrasp.viewer.gui.ValueDragData;
import jgrasp.viewer.gui.ValueDragger;
import jgrasp.viewer.jgrdi.DebugContext;
import jgrasp.viewer.jgrdi.Method;
import jgrasp.viewer.jgrdi.Value;
import org.w3c.dom.Element;


/** A viewer that shows relative component positions and sizes. **/
public class java__awt__Component_ComponentView extends ViewerRoot {

   /** A component boundary description. **/
   private static class Bounds {
   
      /** The bounds. **/
      private Rectangle bounds = new Rectangle();
   
      /** Bounds of all the children. **/
      private Bounds[] children;
   
      /** The component class name. **/
      private String type;
   
      /** The component value. **/
      private Value value;
   
      /** The component value id. **/
      private long id;
   
   
      /** {@inheritDoc} **/
      @Override
      public String toString() {
         StringBuilder sb = new StringBuilder();
         getDescription(sb, "");
         return sb.toString();
      }
   
   
      private void getDescription(final StringBuilder sb,
            final String indent) {
         sb.append(indent);
         sb.append(type);
         sb.append(" (");
         sb.append(bounds.x);
         sb.append(", ");
         sb.append(bounds.y);
         sb.append(") ");
         sb.append(bounds.width);
         sb.append("x");
         sb.append(bounds.height);
         sb.append("\n");
         if (children != null) {
            for (Bounds cb : children) {
               cb.getDescription(sb, indent + "   ");
            }
         }
      }
   }

   /** The gui root panel. **/
   private JPanel outerPanel;

   /** The bounds display panel. **/
   private JPanel displayPanel;

   /** Text display (shows types of components under mouse). **/
   private JTextArea textArea;

   /** The boundary hierarchy. This will be accessed by both the debugger and
    * gui threads, so it should be read only once wherever the value must
    * remain consistent. **/
   private Bounds topBounds;

   /** True if the mouse is outside the component display, false otherwise. **/
   private boolean mouseOut = true;

   /** The subviewer. **/
   private SubViewer selectionViewer;

   /** The currently selected component, or null if none is selected. **/
   private Value selComponent;

   /** The id of the currently selected component, or -1 if none is
    * selected. **/
   private long selId = -1;

   /** The new selected value, or null if none was selected. **/
   private Value newSelComponent;

   /** Creation data. **/
   private ViewerCreateData createData;


   /** Creates a new component viewer.
    *
    * @param vcd viewer creation data. **/
   public java__awt__Component_ComponentView(final ViewerCreateData vcd) {
      super(false, EnumSet.of(CreationFlags.STANDARD_BORDER));
      createData = vcd;
   }


   /** {@inheritDoc} **/
   @Override
   public void build(final ViewerInitData vid, final Element initDataIn) {
      super.build(vid, initDataIn);
      vid.setAutoUpdate(true);
      if (createData.supportsSubViewers()) {
         selectionViewer = SubViewer.createSubViewer(this, vid);
      }
   }


   /** {@inheritDoc} **/
   @Override
   public void buildGui(final JPanel mainPanel) {
      buildPanel();
      mainPanel.setLayout(new BorderLayout());
      mainPanel.add(outerPanel, "Center");
   }


   /** {@inheritDoc} **/
   @Override
   public void destroy() {
      selComponent = null;
      newSelComponent = null;
   }


   /** Finds the component at a certain position.
    *
    * @param pos the position to be searched.
    *
    * @param old if this is non-negative and a component with this id is found,
    * select the component found after it, if any. Using this repeatedly will
    * cycle through all the components at a certain position.
    *
    * @param keep if this is non-negative and <code>old</code> is negative,
    * choose the component with this id if it is one of the ones found.
    *
    * @return the a component found at the specified position, or null if none
    * was found. **/
   public Value findComponent(final Point pos, final long old,
         final long keep) {
      int width = displayPanel.getWidth() - 1;
      int height = displayPanel.getHeight() - 1;
      Bounds bounds = topBounds;
      if (bounds == null) {
         return null;
      }
      Rectangle b = bounds.bounds;
      double scale =
            Math.min(width / (double) b.width, height / (double) b.height);
      double xOffs = (width - b.width * scale) / 2.0;
      double yOffs = (height - b.height * scale) / 2.0;
   
      List<Bounds> result = new ArrayList<>();
      findComponents(pos.x, pos.y, xOffs, yOffs, scale, bounds, 0, result);
      if (result.size() == 0) {
         return null;
      }
      if (old < 0) {
         if (keep >= 0) {
            for (Bounds bounds1 : result) {
               if (bounds1.id == keep) {
                  return bounds1.value;
               }
            }
         }
         return result.get(result.size() - 1).value;
      }
      for (int i = 0; i < result.size(); i++) {
         if (result.get(i).id == old) {
            return i > 0 ? result.get(i - 1).value
                  : result.get(result.size() - 1).value;
         }
      }
      return result.get(result.size() - 1).value;
   }


   /** {@inheritDoc} **/
   @Override
   public void getInfo(final ViewerInfo vi) {
      vi.setShortDescription("Detail viewer for components");
      vi.setLongDescription("This viewer displays the component shape "
            + "and the shapes of its descendants. Clicking on the viewer "
            + "repeatedly will cycle the selection through all components "
            + "under the cursor. Hold down the shift key to click and "
            + "drag out a component without cycling to the next component.");
   }


   /** {@inheritDoc} **/
   @Override
   public Dimension getMainSize() {
      Font f = outerPanel.getFont();
      if (f != null) {
         FontMetrics fm = outerPanel.getFontMetrics(f);
         int ht = fm.getHeight();
         return new Dimension(ht * 15, ht * 7);
      }
      return new Dimension(210, 100);
   }


   /** {@inheritDoc} **/
   @Override
   public int getPriority(final ViewerPriorityData vpd) {
      return 10;
   }


   /** {@inheritDoc} **/
   @Override
   public String getViewName() {
      return "Component";
   }


   /** Responds to mouse motion.
    *
    * @param x mouse x position.
    *
    * @param y mouse y position. **/
   public void handleMouseMove(final int x, final int y) {
      int width = displayPanel.getWidth() - 1;
      int height = displayPanel.getHeight() - 1;
      Bounds bounds = topBounds;
      if (bounds == null) {
         mouseOut = true;
         setTextAreaText("");
         return;
      }
   
      Rectangle b = bounds.bounds;
      double scale =
            Math.min(width / (double) b.width, height / (double) b.height);
      double xOffs = (width - b.width * scale) / 2.0;
      double yOffs = (height - b.height * scale) / 2.0;
   
      StringBuilder result = new StringBuilder();
      findComponents(x, y, xOffs, yOffs, scale, bounds, 0, result);
      String resultStr = result.toString();
      if (resultStr.length() > 0) {
         mouseOut = false;
         setTextAreaText(resultStr);
      }
      else {
         mouseOut = true;
         setTextAreaText(bounds.toString());
      }
   }


   /** Paints the bounds rectangles on the display panel.
    *
    * @param g graphics on which the rendering will be performed. **/
   public void paintDisplay(final Graphics g) {
      int width = displayPanel.getWidth() - 1;
      int height = displayPanel.getHeight() - 1;
      g.setColor(outerPanel.getBackground());
      g.fillRect(0, 0, width + 1, height + 1);
      Bounds bounds = topBounds;
      if (bounds == null) {
         return;
      }
   
      Rectangle b = bounds.bounds;
      double scale =
            Math.min(width / (double) b.width, height / (double) b.height);
      double xOffs = (width - b.width * scale) / 2.0;
      double yOffs = (height - b.height * scale) / 2.0;
   
      FontMetrics fm = g.getFontMetrics();
      int fontHeight = fm.getHeight();
      int l = Sizes.getVeryThinEdge(fontHeight);
   
      paintBounds(g, xOffs, yOffs, scale, bounds, 0, l);
   }


   /** Changes the value in the selection viewer based on the current selected
    * value.
    *
    * @param context the current debug context.
    *
    * @param isReset true if the current value should be considered a "new"
    * value, false otherwise. **/
   public void setSelectionViewValue(final DebugContext context,
         final boolean isReset) {
   
      if (selectionViewer == null) {
         return;
      }
      final Value v;
      v = newSelComponent;
      if (v == null && selComponent == null) {
         return;
      }
      if (v != null && selComponent != null && v.isSameNaN(selComponent)) {
         return;
      }
   
      final boolean prevNullSubviewVal = selComponent == null;
      selComponent = v;
      selId = v == null ? -1 : v.getUniqueID();
      selectionViewer.setValue(v, context, "", " ", isReset);
      SwingUtilities.invokeLater(
         ()-> {
            if (v == null != prevNullSubviewVal) {
               getVIData().setSubviewPanel(
                  v == null ? null : selectionViewer.getComponent(),
                  SubviewerPosition.BOTTOM);
            }
         });
   }


   /** {@inheritDoc} **/
   @Override
   public void updateGui() {
      Bounds b = topBounds;
      if (b == null) {
         return;
      }
      if (mouseOut) {
         setTextAreaText(b.toString());
      }
      if (displayPanel != null) {
         displayPanel.repaint();
      }
   }


   /** {@inheritDoc} **/
   @Override
   public void updateState(final ViewerValueData valueData,
         final ViewerUpdateData data, final DebugContext context)
         throws ViewerException {
      Value value = valueData.getValue();
      topBounds = getBounds(value, context);
      setSelectionViewValue(context, data.isReset());
   }


   /** Builds the view panel. **/
   private void buildPanel() {
      outerPanel = 
         new JPanel(new BorderLayout()) {
         
            @Override
            public void updateUI() {
               super.updateUI();
               BorderLayout layout = (BorderLayout) getLayout();
               int gap = 1 + getFont().getSize() / 2;
               layout.setHgap(gap);
               layout.setVgap(gap);
               setBorder(BorderFactory.createEmptyBorder(gap, gap, gap, gap));
            }
            
            
            public Color getBackground() {
               return Drawing.getColor(Colors.BG);
            }
            
            
            public Color getForeground() {
               return Drawing.getColor(Colors.FG);
            }
         };
      displayPanel = 
         new JPanel() {
         
            @Override
            public Dimension getPreferredSize() {
               return new Dimension(0, 0);
            }
         
         
            @Override
            public void paintComponent(final Graphics g) {
               paintDisplay(g);
            }
            
            
            public Color getBackground() {
               return Drawing.getColor(Colors.BG);
            }
            
            
            public Color getForeground() {
               return Drawing.getColor(Colors.FG);
            }
         };
      displayPanel.addMouseMotionListener(
         new MouseMotionAdapter() {
         
            @Override
            public void mouseMoved(final MouseEvent e) {
               handleMouseMove(e.getX(), e.getY());
            }
         });
      displayPanel.addMouseListener(
         new MouseAdapter() {
         
            @Override
            public void mouseExited(final MouseEvent e) {
               mouseOut = true;
               Bounds b = topBounds;
               if (b == null) {
                  setTextAreaText("");
               }
               else {
                  setTextAreaText(b.toString());
               }
            }
         
         
            @Override
            public void mousePressed(final MouseEvent e) {
               if ((e.getModifiersEx()
                  & BasicToolUtil.getMenuShortcutKeyMaskEx()) != 0) {
                  newSelComponent = null;
               }
               else {
                  long id = (e.getModifiersEx() & InputEvent.SHIFT_DOWN_MASK) == 0
                     ? selId : -1;
                  long keep =
                     (e.getModifiersEx() & InputEvent.SHIFT_DOWN_MASK) == 0
                           ? -1 : selId;
                  newSelComponent = findComponent(e.getPoint(), id, keep);
               }
               getVIData().update();
            }
         });
      ValueDragger.createValueDragger(displayPanel, getVIData(), 
         (pos)-> {
            if (selComponent == null) {
               return null;
            }
            return new ValueDragData(null, selComponent, null,
               getVIData().getScope(),
               java__awt__Component_ComponentView.this.getClass().getName());
         });
      JSplitPane splitPane = 
         new JSplitPane() {
                     
            
            public Color getBackground() {
               return Drawing.getColor(Colors.BG);
            }
            
            
            public Color getForeground() {
               return Drawing.getColor(Colors.FG);
            }
         };
      splitPane.setResizeWeight(.5);
      outerPanel.add(splitPane, "Center");
      splitPane.setTopComponent(displayPanel);
      textArea = new URTextArea("Component Hierarchy");
      textArea.setEditable(false);
      splitPane.setBottomComponent(
         new JScrollPane(textArea) {
         
            @Override
            public Dimension getPreferredSize() {
               return new Dimension(0, 0);
            }
         });
   
      GridBagConstraints constraints = new GridBagConstraints();
      Insets insets = constraints.insets;
      int spacing = 4;
      constraints.weightx = .001;
      constraints.weighty = .001;
      insets.top = spacing;
      insets.bottom = spacing;
      insets.right = spacing;
      insets.left = spacing;
      constraints.gridwidth = GridBagConstraints.REMAINDER;
      constraints.fill = GridBagConstraints.NONE;
      // constraints.anchor = GridBagConstraints.WEST;
   
      Bounds b = topBounds;
      if (b != null) {
         setTextAreaText(b.toString());
      }
   }


   /** Finds the components at a certain position.
    *
    * @param x x position of mouse.
    *
    * @param y y position of mouse.
    *
    * @param xOffset x offset from parent position.
    *
    * @param yOffset y offset from parent position.
    *
    * @param scale scale multiplier from bounds units to graphics units.
    *
    * @param bounds bounds of the component that is being searched.
    *
    * @param level the depth in the hierarchy.
    *
    * @param out list for holding the found components. **/
   private void findComponents(final int x, final int y, final double xOffset,
         final double yOffset, final double scale, final Bounds bounds,
         final int level, final List<Bounds> out) {
      Rectangle b = bounds.bounds;
   
      double xOffs = xOffset;
      double yOffs = yOffset;
      if (level > 0) {
         xOffs += b.x * scale;
         yOffs += b.y * scale;
      }
   
      Rectangle rect = new Rectangle((int) xOffs, (int) yOffs,
            (int) (xOffs + b.width * scale) - (int) xOffs,
            (int) (yOffs + b.height * scale) - (int) yOffs);
      if (!rect.contains(x, y)) {
         return;
      }
      out.add(bounds);
      for (Bounds element : bounds.children) {
         findComponents(x, y, xOffs, yOffs, scale, element, level + 1, out);
      }
   }


   /** Gets a text description of the components at a certain position.
    *
    * @param x x position of mouse.
    *
    * @param y y position of mouse.
    *
    * @param xOffset x offset from parent position.
    *
    * @param yOffset y offset from parent position.
    *
    * @param scale scale multiplier from bounds units to graphics units.
    *
    * @param bounds bounds of the component that is being searched.
    *
    * @param level the depth in the hierarchy.
    *
    * @param textOut the text result. **/
   private void findComponents(final int x, final int y, final double xOffset,
         final double yOffset, final double scale, final Bounds bounds,
         final int level, final StringBuilder textOut) {
      Rectangle b = bounds.bounds;
   
      double xOffs = xOffset;
      double yOffs = yOffset;
      if (level > 0) {
         xOffs += b.x * scale;
         yOffs += b.y * scale;
      }
   
      Rectangle rect = new Rectangle((int) xOffs, (int) yOffs,
            (int) (xOffs + b.width * scale) - (int) xOffs,
            (int) (yOffs + b.height * scale) - (int) yOffs);
      if (!rect.contains(x, y)) {
         return;
      }
      for (int l = 0; l < level; l++) {
         textOut.append(" ");
      }
      textOut.append(bounds.type);
      textOut.append(" (");
      textOut.append(b.x);
      textOut.append(", ");
      textOut.append(b.y);
      textOut.append(") ");
      textOut.append(b.width);
      textOut.append("x");
      textOut.append(b.height);
      textOut.append("\n");
      for (Bounds element : bounds.children) {
         findComponents(x, y, xOffs, yOffs, scale, element, level + 1,
               textOut);
      }
   }


   /** Gets component boundary information.
    *
    * @param value the component.
    *
    * @param context the current debugger context.
    *
    * @return boundary information for the component.
    *
    * @throws ViewerException if an error occurs while retrieving the
    * bounds. **/
   private Bounds getBounds(final Value value, final DebugContext context)
         throws ViewerException {
      Bounds b = new Bounds();
      Method getBoundsMethod =
            value.getMethod(context, "getBounds", "java.awt.Rectangle", null);
      Value bounds = value.invokeMethod(context, getBoundsMethod, null);
      String type = value.getType(context).getName(context);
      int dot = type.lastIndexOf('.');
      if (dot >= 0) {
         type = type.substring(dot + 1);
      }
      b.type = type;
      b.value = value;
      b.id = value.getUniqueID();
   
      try {
         Method getTextMethod =
               value.getMethod(context, "getText", "java.lang.String", null);
         Value result = value.invokeMethod(context, getTextMethod, null);
         if (!result.isNull()) {
            String str = result.toString(context);
            if (str.length() > 10) {
               str = str.substring(0, 7) + "...";
            }
            b.type += " \"" + str + "\"";
         }
      }
      catch (ViewerException ignored) {
      }
   
      b.bounds.x = bounds.getFieldValue(context, "x").toInt(context);
      b.bounds.y = bounds.getFieldValue(context, "y").toInt(context);
      b.bounds.width = bounds.getFieldValue(context, "width").toInt(context);
      b.bounds.height = bounds.getFieldValue(context, "height").toInt(context);
      if (value.isInstanceOf(context, "java.awt.Container")) {
         Method getComponentsMethod = value.getMethod(context, "getComponents",
               "java.awt.Component[]", null);
         Value children;
         try {
            children = value.invokeMethod(context, getComponentsMethod, null);
         }
         catch (ViewerException e) {
            b.children = new Bounds[0];
            return b;
         }
         b.children = new Bounds[children.getArrayLength(context)];
         for (int c = 0; c < b.children.length; c++) {
            b.children[c] =
                  getBounds(children.getArrayElement(context, c), context);
         }
      }
      return b;
   }


   /** Paints the bounds of a component and its children.
    *
    * @param g graphics on which the rendering will be performed.
    *
    * @param xOffset x offset of the parent.
    *
    * @param yOffset y offset of the parent.
    *
    * @param scale scale multiplier from bounds units to graphics units.
    *
    * @param bounds bounds of the component that is being painted.
    *
    * @param level the depth in the hierarchy.
    *
    * @param l line thickness for painting. **/
   private void paintBounds(final Graphics g, final double xOffset,
         final double yOffset, final double scale, final Bounds bounds,
         final int level, final int l) {
      Rectangle b = bounds.bounds;
   
      double xOffs = xOffset;
      double yOffs = yOffset;
      if (level > 0) {
         xOffs += b.x * scale;
         yOffs += b.y * scale;
      }
   
      g.setColor(Drawing.getColor(Colors.BLACK));
      g.fillRect((int) xOffs, (int) yOffs,
            (int) (xOffs + b.width * scale) - (int) xOffs,
            (int) (yOffs + b.height * scale) - (int) yOffs);
      if ((int) (xOffs + b.width * scale) - (int) xOffs > l + l
            && (int) (yOffs + b.height * scale) - (int) yOffs > l + l) {
         double shade = Math.max(0, 1 - .05 * level);
         int rMin = 100;
         int rMax = 200;
         int i = (int) (rMin + shade * (rMax - rMin));
         Color c;
         if (bounds.id == selId) {
            c = new Color(255, i, i);
         }
         else {
            c = new Color(i, i, 255);
         }
         g.setColor(Drawing.convertForTheme(c));
         g.fillRect((int) xOffs + l, (int) yOffs + l,
               (int) (xOffs + b.width * scale) - (int) xOffs - l - l,
               (int) (yOffs + b.height * scale) - (int) yOffs - l - l);
         for (Bounds element : bounds.children) {
            paintBounds(g, xOffs, yOffs, scale, element, level + 1, l);
         }
      }
   }


   /** Sets the text.
    *
    * @param text the new text. **/
   private void setTextAreaText(final String text) {
      if (text.equals(textArea.getText())) {
         return;
      }
      textArea.setText(text);
   }
}
