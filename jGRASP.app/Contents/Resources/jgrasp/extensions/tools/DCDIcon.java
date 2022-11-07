
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics2D;
import jgrasp.AutosizedIcon;
import jgrasp.Colors;
import jgrasp.Drawing;


/** The DCD action icon. **/
public class DCDIcon extends AutosizedIcon {
      
   
   /** {@inheritDoc} **/
   public void paintImage(final Graphics2D g, final int w, final int h) {
      int sz = Math.min(w, h);
      if (sz < 3) {
         return;
      }
      int xoffs = (w - sz) / 2;
      int yoffs = (h - sz) / 2;
      Drawing.drawLinedPage(g, xoffs, yoffs, sz, sz,
            Drawing.getColor(Colors.WHITE), false,
            new Color [] { Drawing.getColor(Colors.BLACK),
            Drawing.getColor(Colors.HL_RED),
            Drawing.getColor(Colors.HL_RED), Drawing.getColor(Colors.BLACK) },
            0, false, !Drawing.drawOutlines());
   }
}
