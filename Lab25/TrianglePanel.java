import java.awt.*;
import javax.swing.*;

public class TrianglePanel extends JPanel{
  private final int DIMENSIONS = 475;
  private final int ORIGIN = 40;
  
  public TrianglePanel(){
    setPreferredSize(new Dimension(DIMENSIONS,DIMENSIONS));
    setBackground (Color.white);
  }
  
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    g.setColor(Color.black);
    
    int row = 0;
    int col = 1;
    //draw grid
    for (int x = 40; x <= 450; x += 40){
      g.drawLine(x, 40, x, 440);
      g.drawLine(40, x, 440, x);
      g.drawString(Integer.toString(row), x-5, 35);
      if (x >= 80){
      g.drawString(Integer.toString(col), 20, x+5);
      col ++;
      }
      row ++;
    }//end for-loop
    
    g.setColor(Color.red);
    g.drawLine(ORIGIN, ORIGIN*4, ORIGIN*4, ORIGIN*5);
    g.drawLine(ORIGIN*4, ORIGIN*5, ORIGIN*2, ORIGIN*10);
    g.drawLine(ORIGIN*2, ORIGIN*10, ORIGIN, ORIGIN*4);
    g.drawString("A", ORIGIN*2-15, ORIGIN*10-5);
    
    g.setColor(Color.blue);
    g.drawLine(ORIGIN, ORIGIN, ORIGIN*4, ORIGIN);
    g.drawLine(ORIGIN*4, ORIGIN, ORIGIN*4, ORIGIN*5);
    g.drawLine(ORIGIN*4, ORIGIN*5, ORIGIN, ORIGIN);
    g.drawString("TEST", ORIGIN*3, ORIGIN*3-10);
    
    g.setColor(Color.green);
    g.drawLine(ORIGIN*5, ORIGIN*3, ORIGIN*10, ORIGIN*5);
    g.drawLine(ORIGIN*10, ORIGIN*5, ORIGIN*7, ORIGIN*8);
    g.drawLine(ORIGIN*7, ORIGIN*8, ORIGIN*5, ORIGIN*3);
    g.drawString("B", ORIGIN*7-25, ORIGIN*8-15);
     
    
  }
}

/*Former app 
 * Triangle x = new Triangle(); //creates test triangle object using default constructor
    System.out.println(x);//calls toString method to print object perimeter
    
    Triangle a = new Triangle(0,3,3,4,1,9,"A");//creates triangle a object using constructor method
    System.out.println(a.toString());//calls toString method to print object perimeter
    
    Triangle b = new Triangle(5,6,3,7,1,8,"B");//creates triangle b object using constructor method
    System.out.println(b.toString());//calls toString method to print object perimeter
      
  }//end method  
*/ 