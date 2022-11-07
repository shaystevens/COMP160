//stesh969
package shapes;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class ShapePanel extends JPanel{
  //declare data fields
  private JPanel controlPanel;
  private JButton addShape = new JButton("Add Shape");
  private JTextField showNum;
  private JLabel countLabel = new JLabel("Count");
  private DrawingPanel drawPanel;
  private Shape[] shapes = new Shape[20];
  private int count;
  
  /**Constructor method of class ShapePanel*/
  public ShapePanel(){
    showNum = new JTextField(2); //set showNum data field to new JTextField which can hold two characters
    
    controlPanel = new JPanel();
    controlPanel.setPreferredSize(new Dimension(100, 400)); //set controlPanel size
    controlPanel.setBackground(Color.white); //set controlPanel colour
    controlPanel.add(addShape); //add addShape button to controlPanel
    controlPanel.add(countLabel); //add countLabel to controlPanel
    controlPanel.add(showNum); //add showNum text field to controlPanel
    
    ButtonListener listener = new ButtonListener(); //initialise new ButtonListener 
    addShape.addActionListener(listener); //add addShape data field to ButtonListener
    
    drawPanel = new DrawingPanel(); //set drawPanel data field to new DrawingPanel
    
    add(controlPanel); //add controlPanel to ShapePanel
    add(drawPanel); //add drawPanel to ShapePanel
  }//end constructor
  
  private class ButtonListener implements ActionListener {
    public void actionPerformed (ActionEvent event) {
      if (event.getSource() == addShape && count < shapes.length){ //if addShape button is pressed and count is less than shape array length
        shapes[count] = new Shape(); //shape array at index of count is a new shape
        count ++; //update count 
        showNum.setText( Integer.toString(count)); //set JTextField to string of count     
      }//end if statement
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
      for (int x = 0; x < count; x++){
        shapes[x].display(page);
      }//end for-loop
    }//end method 
  }//end class
}//end class