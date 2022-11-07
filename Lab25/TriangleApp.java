import java.text.DecimalFormat;
import javax.swing.*;
public class TriangleApp{
   public static void main(String[] args){
     JFrame frame = new JFrame ("Lab 25 Triangles");
    frame.getContentPane().add(new TrianglePanel());//make a new content pane that adds an instance of table panel
    frame.setDefaultCloseOperation (WindowConstants.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
   }

}