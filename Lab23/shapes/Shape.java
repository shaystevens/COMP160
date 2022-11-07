//stesh969
package shapes;
import java.awt.*; 
import java.util.*;
public abstract class Shape{
  protected int moveX = 1;
  protected int moveY = 1; 
  protected int x; //declare private int data field
  protected int y; //declare private int data field
  protected int width; //declare private int data field
  protected int height; //declare private int data field
  protected Color colour; //declare private Color data field
  
  public void move(){
    x += moveX;
    y += moveY;
    
    if (x <= 0 || x >= 400-width){ 
      moveX = moveX * -1;
    }
    
    if (y <= 0 || y >= 400- height){
      moveY = moveY * -1;
    }  
  }
  
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
    /*  
     if (width <= 15){
     moveX = 3;
     moveY = 3;
     }
     
     if (width >15 && width <25){
     moveX = 2;
     moveY = 2;
     }*/
  }//end constructor
  
  /**Takes two ints a high value and a low value and generate a random variable between the two values*/
  public int randomRange(int low, int high){
    Random generator = new Random();
    return generator.nextInt(high-low+1) + low;
  }//end method
  
  /**abstract display method in Shape class*/
  public abstract void display(Graphics page); 
 
}//end class
