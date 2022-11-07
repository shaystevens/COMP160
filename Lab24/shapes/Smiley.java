package shapes;
import java.awt.*;
public class Smiley extends Shape{
  /**Constructor method of Smiley*/
  public Smiley() {
    height = 30;
    width = 30;
    x = randomRange(0, (400-width)); //set x data field to a random value between 0-400 
    y = randomRange(0, (400-height)); //set y data field to a random value between 0-400
  }//end constructor method
  
  public void display(Graphics page){
    page.setColor (Color.black);//set Color to black
    page.fillOval (x-1, y-1, width+2, height+2);//draw black circle 
    page.setColor (Color.yellow);//set Color to yellow
    page.fillOval (x, y, width, height);//draw yellow circle, face
    
    page.setColor (Color.black); //set Color to black
    page.fillOval (x+7, y+8, 4, 4);//draw left eye
    page.fillOval (x+20, y+8, 4, 4);//draw right eye
    if (moveY == -1){ //if smiley face is moving up 
      page.drawArc (x+8, y+10, 15, 13, 190, 160);//smiley face
    }//end if statement
    
    else if (moveY == 1){//else if face is moving down
      page.drawArc (x+8, y+15, 15, 13, 0, 180);//frowny face
    }//end else if statement
  }//end method
}//end class