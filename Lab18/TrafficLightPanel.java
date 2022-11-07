//stesh969
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TrafficLightPanel extends JPanel {
  //declare data fields 
  private JButton redButton;
  private JButton greenButton;
  private JButton amberButton;
  private JLabel lastPressedLabel;
  private JPanel buttonPanel;
  
  /**Constructor method of TrafficLightPanel*/
  public TrafficLightPanel() {
    //creating new instances of JButton data fields
    redButton = new JButton("Red");
    greenButton = new JButton("Green");
    amberButton = new JButton("Amber");
    
    ButtonListener listener = new ButtonListener(); //create a new object of type ButtonListener 
    //add each button to action listener
    redButton.addActionListener(listener);
    greenButton.addActionListener(listener);
    amberButton.addActionListener(listener);
    
    lastPressedLabel = new JLabel("last pressed"); //create a new instance of lastPressedLabel
    
    //creating new buttonPanel
    buttonPanel = new JPanel();
    buttonPanel.setPreferredSize(new Dimension(80, 290)); //set dimensions of buttonPanel
    buttonPanel.setBackground(Color.white);//set background colour to white
    //add each button to buttonPanel
    buttonPanel.add(redButton);
    buttonPanel.add(amberButton);
    buttonPanel.add(greenButton);
    
    LightPanel lightPanel = new LightPanel(); //create a new instance of lightPanel
    
    setPreferredSize(new Dimension(200,300));//set dimensions of trafficLightPanel
    setBackground(Color.blue); //set background colour to blue
    //add each panel to trafficLightPanel
    add(buttonPanel); 
    add(lightPanel);  
  }//end contructor method
  
  private class ButtonListener implements ActionListener {
    public void actionPerformed (ActionEvent event) {
      //if redButton is pressed set lastPressedLabel to "red"
      if (event.getSource() == redButton){
        lastPressedLabel.setText("red");
      }//end if statement
      
      //else if amberButton is pressed set lastPressedLabel to "amber"
      else if (event.getSource() == amberButton){
        lastPressedLabel.setText("amber");
      }//end else if statement
      
      //else if greenButton is pressed set lastPressedLabel to "green"
      else if (event.getSource() == greenButton){
        lastPressedLabel.setText("green");
      }//end else if statement
      
      repaint(); //refresh panel
      
    }//end method
  }//end class
  
  private class LightPanel extends JPanel {
    /**Constuctor method of class LightPanel*/
    public LightPanel() {
      setPreferredSize(new Dimension(80,290)); //set dimensions of LightPanel
      setBackground(Color.cyan); //set background colour to cyan
      
    }//end constructor method
    
    public void paintComponent(Graphics page){
      super.paintComponent(page);
      //draw the intial black circles
      page.setColor (Color.black);
      page.fillOval(20,30,40,40);
      page.fillOval(20,90,40,40);
      page.fillOval(20,150,40,40);
      
      //if lastPressedLabel text is "red" draw red circle at top
      if ((lastPressedLabel.getText()).equals("red")){
        page.setColor (Color.red);
        page.fillOval(20,30,40,40);
      }//end if statement
      
      //if lastPressedLabel text is "amber" draw amber circle at middle
      else if ((lastPressedLabel.getText()).equals("amber")){
        page.setColor (Color.orange);
        page.fillOval(20,90,40,40);
      }//end else if statement
      
      //if lastPressedLabel text is "green" draw green circle at bottom
      else if ((lastPressedLabel.getText()).equals("green")){
        page.setColor (Color.green);
        page.fillOval(20,150,40,40);
      }//end else if statement
    }//end method
  }//end class
}//end class