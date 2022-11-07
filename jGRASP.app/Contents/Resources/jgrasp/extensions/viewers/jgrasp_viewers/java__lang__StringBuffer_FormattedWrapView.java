package jgrasp_viewers;


import jgrasp.viewer.ViewerCreateData;
import jgrasp.viewer.ViewerException;
import jgrasp.viewer.ViewerInfo;
import jgrasp.viewer.ViewerPriorityData;
import jgrasp.viewer.jgrdi.DebugContext;
import jgrasp.viewer.jgrdi.Value;
import jgrasp.viewer.text.TextAreaView;


/** A viewer that displays the text of a java.lang.StringBuffer. **/
public class java__lang__StringBuffer_FormattedWrapView extends TextAreaView {

   /** Creates a new StringBuffer formatted text viewer.
    *
    * @param vcd creation data. **/
   public java__lang__StringBuffer_FormattedWrapView(
         final ViewerCreateData vcd) {
      super(true);
   }


   /** {@inheritDoc} **/
   @Override
   public String getDisplayText(final Value value, final DebugContext context)
         throws ViewerException {
      return value.toString(context);
   }


   /** {@inheritDoc} **/
   @Override
   public void getInfo(final ViewerInfo vi) {
      vi.setShortDescription("Formatted StringBuffer wrapping viewer");
      vi.setLongDescription("This viewer displays a the String "
            + "value of a StringBuffer as it would be displayed "
            + "in a wrapped text window.");
   }


   /** {@inheritDoc} **/
   @Override
   public int getPriority(final ViewerPriorityData vpd) {
      return 9;
   }


   /** {@inheritDoc} **/
   @Override
   public String getViewName() {
      return "Formatted Wrapping";
   }
}
