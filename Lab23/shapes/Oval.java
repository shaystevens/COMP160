package shapes;
import java.awt.*;
public class Oval extends Shape{
  /**Constructor method of Oval class*/
  public Oval(){
    height = 4 * width; //set height equal to 4 times the width
    y = randomRange(0, (400-height)); //set new y variable
  }//end constructror
  
  public void display(Graphics page){
    page.setColor (colour); //set page Color to colour data field
    page.fillOval (x, y, width, height); //draw oval at using data field values
  }//end method
}//end class