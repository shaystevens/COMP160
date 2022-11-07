//stesh969
import java.awt.*;
import java.util.*;
public class Shape{
  private int x; //declare private int data field
  private int y; //declare private int data field
  private int width; //declare private int data field
  private int height; //declare private int data field
  private Color colour; //declare private Color data field
  
  /**Constructor method of Shape class */
  public Shape(){
    width = randomRange(10,30); //set data field width to a random value between 10-30
    height = width; //set height data field to width's value
    x = randomRange(0, (400-width)); //set x data field to a random value between 0-400 
    y = randomRange(0, (400-height)); //set y data field to a random value between 0-400
    int red = randomRange(0, 255); //initialise local variable of type int and set to random value between 0-225
    int green = randomRange(0, 255); //initialise local variable of type int and set to random value between 0-225
    int blue = randomRange(0, 255); //initialise local variable of type int and set to random value between 0-225
    colour = new Color(red, green, blue); //set colour data field to RGB colour
  }//end constructor
  
  //Takes two ints a high value and a low value and generate a random variable between the two values
  public int randomRange(int low, int high){
    Random generator = new Random();
    return generator.nextInt(high-low+1) + low;
  }//end method
  
  public void display(Graphics page){
    page.setColor (colour); //set page Color to colour data field
    page.fillOval (x, y, width, height); //draw oval at using data field values
  }//end method
}//end class
