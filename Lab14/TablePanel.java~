//stesh969@student.otago.ac.nz
import java.awt.*;
import javax.swing.*;
public class TablePanel extends JPanel {
  //declare Diner data fields
  private Diner diner1, diner2, diner3, diner4, diner5, diner6;
  
  /*Constructor method for TablePanel that sets each diner data field to a Diner(x,y,String,seatNum)*/
  public TablePanel() {
    diner1 = new Diner (125, 40, "Yoda", 1);
    diner2 = new Diner (180, 110, "Luke", 2);
    diner3 = new Diner (180, 170, "Han", 3);
    diner4 = new Diner (125, 230, "Darth", 4);
    diner5 = new Diner (70, 170, "Leia", 5);
    diner6 = new Diner (70, 110, "Chewy", 6);
    setPreferredSize (new Dimension(300,300));//set panel size
    setBackground (Color.cyan); //set panel colour to cyan
  }
  
  public void paintComponent (Graphics g) {
    super.paintComponent(g);//draw panel
    //draw each diner
    diner1.draw(g);
    diner2.draw(g);
    diner3.draw(g);
    diner4.draw(g);
    diner5.draw(g);
    diner6.draw(g);
    g.fillRect(125, 100, 50, 125); //draw diner table
  }
}
