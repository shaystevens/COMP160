import java.awt.*;
import javax.swing.*;

public class TrianglePanel extends JPanel{
  private final int DIMENSIONS = 500;
  
  public TrianglePanel(){
    setPreferredSize(new Dimension(DIMENSIONS,DIMENSIONS));
    setBackground (Color.white);
  }
  
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    g.setColor(Color.black);
    for (int x = 50; x <= 450; x += 40){
      g.drawLine(x, 50, x, 450);
      g.drawLine(50, x, 450, x);
    }
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