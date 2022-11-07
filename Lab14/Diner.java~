//stesh969@student.otago.ac.nz
import java.awt.*;
public class Diner {
  //declare each data field
  private int x;
  private int y;
  private String name;
  private int seatNum;
  private Color colour;
  private final int DIAMETER = 50;
  
  /*Constructor method for Diner class that takes three ints and a String as parameters and uses them to set data fields*/
  public Diner(int xIn, int yIn, String nameIn, int seatNumIn){
    x = xIn;
    y = yIn;
    name = nameIn;
    seatNum = seatNumIn;
    if (seatNumIn % 2 == 0) colour = Color.gray; //if seat number is even set to gray or if odd set to white
    else colour = Color.white;
  }
  
  public void draw(Graphics g){
    g.setColor (colour); //use colour data field to set colour
    g.fillOval (x, y, DIAMETER, DIAMETER); //draw an oval at x,y position and with Diameter of data field
    g.setFont (new Font("Courier", Font.PLAIN, 14)); //sets the font 
    g.setColor (Color.black); //set the colour to black
    g.drawString (name, x+5, y+30);//draw the name at in the middle of oval
    g.setFont (new Font("Bold", Font.PLAIN, 12)); //sets the font
    Integer s = new Integer(seatNum); //change seatNumber to a string
    g.drawString (s.toString(), x+21, y+12); //draw the number string at the top of the oval
  }
}
