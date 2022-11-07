//stesh969
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;

/** FilePanel.java
  * Lab 20, COMP160,  2020
  *
  * a JPanel which creates 2 instances of Rectangle objects,
  * stores them in an array, and draws them
  */
public class FilePanel extends JPanel{
  private Rectangle[] drawObjects = new Rectangle [10];
  private int count;
  
  
  /**constructor instantiates Rectangle objects and
    * stores references to them in the array
    */
  public FilePanel(){
    /* drawObjects[count] = new Rectangle(true,Color.red, 0, 0,30,30);
     count++;
     drawObjects[count] = new Rectangle(false,Color.blue, 50, 50,30,30);
     count++;*/
    String fileName = "LongBadData.txt"; //declare variable for name of file
    setPreferredSize(new Dimension(300,300));
    setBackground(Color.yellow);
    
    try {
      Scanner fileScan = new Scanner(new File(fileName)); //create fileScan variable to scan variables
      while (fileScan.hasNextLine() && count < 10){  //while the file has another line and while count is less then 10
        String inputLine = fileScan.nextLine();
        
        if (inputLine.matches("\\d+ [1-3] \\d+ \\d+ \\d+ \\d+")){ //if the line in the file matches this layout
          Scanner intScan = new Scanner(inputLine); //create new scanner object
          
          int fill = intScan.nextInt(); //create fill int and set it to the first int in the line in file
          boolean draw = false; //declare boolean variable and set to false 
          
          //if fill is a 1, draw is true
          if (fill == 1){
            draw = true;
          }
          
          int colour = intScan.nextInt(); //declare int variable which is set to 2nd int in the line in file
          Color rectColor = Color.black; //set default colour to black
          
          if (colour == 1) rectColor = Color.red; //if colour is 1 set rectColor to red
          
          else if (colour == 2) rectColor = Color.blue;//else if colour is 2 set rectColor to blue
          
          else if (colour == 3) rectColor = Color.green;//else if colour is 3 set rectColor to green
          
          int x = intScan.nextInt(); //int variable x is the fourth int in the line in file
          
          int y = intScan.nextInt(); //int variable y is the fifth int in the line in file
          
          int width = intScan.nextInt(); //int variable width is the sixith int in the line in file
          
          int height = intScan.nextInt(); //int variable height is the seventh int in the line in file
          
          drawObjects[count] = new Rectangle(draw, rectColor, x, y, width, height); //create new rectangle object and  set it to array variable with index of count
          count ++; //update count variable
        }
      }//end while
      
    } catch (FileNotFoundException e){
      System.out.println("File not found. Check file name and location.");
      System.exit(1);
    }//catch
  }
  
  /**each Rectangle will draw itself*/
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    for(int i = 0; i < count; i++){
      drawObjects[i].draw(g);
    }
  }
}