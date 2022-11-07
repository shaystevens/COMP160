//stesh969
package shapes;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
public class ShapePanel extends JPanel{
  //declare data fields
  Timer timer;
  private final int DELAY = 10;
  private JPanel controlPanel;
  private JTextField showNum;
  private JLabel countLabel = new JLabel("Remove which?");
  private DrawingPanel drawPanel;
  private ArrayList<Shape> shapes = new ArrayList<Shape>();
  private JButton [] buttons = {new JButton("Circle"), new JButton("Square"), new JButton("Smiley"), new JButton("Oval"), new JButton("Swirl"), new JButton("Start"), new JButton("Stop"), new JButton("Remove")};
  
  /**Constructor method of class ShapePanel*/
  public ShapePanel(){
    showNum = new JTextField(2); //set showNum data field to new JTextField which can hold two characters
    controlPanel = new JPanel();
    ButtonListener listener = new ButtonListener(); //initialise new ButtonListener 
    timer = new Timer(DELAY, listener);
    
    //for each Jbutton in array add a listener method and add to control panel
    for (JButton button: buttons){
      button.addActionListener(listener);
      controlPanel.add(button);
    }//end for-each loop   
    
    controlPanel.setPreferredSize(new Dimension(100, 400)); //set controlPanel size
    controlPanel.setBackground(Color.white); //set controlPanel colour
    controlPanel.add(countLabel); //add countLabel to controlPanel
    controlPanel.add(showNum); //add showNum text field to controlPanel
    
    drawPanel = new DrawingPanel(); //set drawPanel data field to new DrawingPanel
    
    add(controlPanel); //add controlPanel to ShapePanel
    add(drawPanel); //add drawPanel to ShapePanel
  }//end constructor
  
  private class ButtonListener implements ActionListener {
    public void actionPerformed (ActionEvent event) {
      if (event.getSource() == timer){
        for (int x = 0; x < (shapes.size()); x++){
          shapes.get(x). move();
        }//end for-loop
      }//end if statement
      
      else{
        JButton button = (JButton) event.getSource();
        
        if (button.getText().equals("Start")){ //if start button is pressed start timer
          timer.start();     
        }//end if statement
        
        if (button.getText().equals("Stop")){ //if stop button is pressed stop timer
          timer.stop();
        }//end if statement
        
        if (button.getText().equals("Circle")){ //if Circle button is pressed and count is less than shape array length
          shapes.add(new Circle()); //shape array at index of count is a new circle
          
          showNum.setText(Integer.toString(shapes.size()-1)); //set JTextField to string of count     
        }//end if statement
        
        if (button.getText().equals("Square")){ //if square button is pressed and count is less than shape array length
          shapes.add(new Square()); //shape array at index of count is a new square
          
          showNum.setText(Integer.toString(shapes.size()-1)); //set JTextField to string of count     
        }//end if statement
        
        if (button.getText().equals("Smiley")){ //if Smiley button is pressed and count is less than shape array length
          shapes.add(new Smiley()); //shape array at index of count is a new Smiley
          showNum.setText(Integer.toString(shapes.size()-1)); //set JTextField to string of count     
        }//end if statement
        
        if (button.getText().equals("Oval")){ //if Oval button is pressed and count is less than shape array length
          shapes.add(new Oval()); //shape array at index of count is a new oval 
          showNum.setText(Integer.toString(shapes.size()-1)); //set JTextField to string of count     
        }//end if statement
        
        if (button.getText().equals("Swirl")){ //if Swirl is pressed and count is less than shape array length
          shapes.add(new Swirl()); //shape array at index of count is a new swirl
          showNum.setText(Integer.toString(shapes.size()-1)); //set JTextField to string of count     
        }//end if statement
        
        if (button.getText().equals("Remove")){
          if (shapes.size() < 1) showNum.setText("");
          else{
          int removeNum = Integer.parseInt(showNum.getText());
          shapes.remove(removeNum);
          }
        }
        
      }//end else block    
      
      repaint(); //repaint JPanel
    }//end method 
  }//end class
  
  private class DrawingPanel extends JPanel{
    public DrawingPanel(){
      setPreferredSize(new Dimension(400,400)); //set DrawingPanel size
      setBackground(Color.lightGray); //set DrawingPanel colour
    }//end method
    
    public void paintComponent(Graphics page){
      super.paintComponent(page);
      // for 0-count draw a shape
      for (Shape shape: shapes){
        shape.display(page);
        shape.showIndex(page, shapes.indexOf(shape));
      }//end for-loop
    }//end method 
  }//end class
}//end class