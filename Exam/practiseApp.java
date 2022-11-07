import javax.swing.JFrame;
public class practiseApp{
  public static void main(String[] args){
    JFrame frame = new JFrame("Exam"); //set text to Lab 24
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closes application
    frame.getContentPane().add(new MyFrame()); //add new instance of ShapePanel
    frame.pack();
    frame.setVisible(true);
  }
}