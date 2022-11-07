//stesh969
import java.awt.*;

/** Rectangle.java
  * Lab 20, COMP160,  2020
  *
  * graphical representation of a rectangle
  * with a fill, colour, x, y, width, height
  */
public class Rectangle{
  private int x;  // x location;
  private int y;  // y location;
  private Color shade;  // colour of Rectangle
  private int width; //width of Rectangle
  private int height;//height of Rectangle
  private boolean fill; //drawRect false or fillRect true
  private static int totalCount; //static total count variable
  private int thisCount; //thisCount variable
  
  
  /**constructor for Rectangle*/
  public Rectangle(boolean fill, Color shade,int x, int y , int width, int height){
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
    this.shade = shade;
    this.fill=fill;
    totalCount ++;
    thisCount = totalCount;
  }
  
  /**draw this rectangle*/
  public void draw(Graphics g){
    g.setColor(shade);
    g.drawString(thisCount + " of " + totalCount, x, y); //draw count and total count at the rectangle position
    if (fill ){
      g.fillRect(x, y, width, height);
    } else  {
      g.drawRect(x, y, width, height);
    }
  }
  
}