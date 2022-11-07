//stesh969
import javax.swing.JFrame;
public class TrafficLightApp {
  public static void main(String[] args){
    JFrame frame = new JFrame("Traffic Light Panel"); //set text to Traffic Light Panel
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closes application
    frame.getContentPane().add(new TrafficLightPanel()); //add new instance of TrafficLightPanel
    frame.pack();
    frame.setVisible(true);
  }
}