package shapes;
import java.awt.*;
public class Square extends Shape{
  public void display(Graphics page){
    page.setColor (colour); //set page Color to colour data field
    page.fillRect (x, y, width, height); //draw square using data field values
  }//end method
}//end class