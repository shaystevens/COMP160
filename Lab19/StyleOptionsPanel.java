//stesh969
//********************************************************************
//  StyleOptionsPanel.java      adapted from Java Foundations
//
//  Demonstrates the use of check boxes.
//********************************************************************

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StyleOptionsPanel extends JPanel
{
  private JLabel saying;
  private JCheckBox bold, italic;
  private JRadioButton courier, timesNewRoman, helvetica; //declare radio button data fields
  private int style = Font.PLAIN;
  private String typeFace = "Helvetica";
  
  //-----------------------------------------------------------------
  //  Sets up a panel with a label and some check boxes that
  //  control the style of the label's font.
  //-----------------------------------------------------------------
  public StyleOptionsPanel()
  { 
    setLayout(new GridLayout (6,1)); // set grid layout
    
    saying = new JLabel ("Say it with style!");
    saying.setFont (new Font (typeFace, style, 20));
    
    bold = new JCheckBox ("Bold");
    bold.setBackground (Color.cyan);
    italic = new JCheckBox ("Italic");
    italic.setBackground (Color.cyan);
    //make new JRadioButton buttons
    courier = new JRadioButton("Courier");
    timesNewRoman = new JRadioButton("Times New Roman");
    helvetica = new JRadioButton("Helvetica");
    
    
    StyleListener listener = new StyleListener();
    bold.addItemListener (listener);
    italic.addItemListener (listener);
    //add to Item Listener
    courier.addItemListener (listener);
    timesNewRoman.addItemListener (listener);
    helvetica.addItemListener (listener);
    
    //put the radio buttons in one button group
    ButtonGroup group = new ButtonGroup();
    group.add(courier);
    group.add(timesNewRoman);
    group.add(helvetica);
    
    //add to Jpanel
    add (saying);
    add (bold);
    add (italic);
    add (courier);
    add (timesNewRoman);
    add (helvetica);
    
    setBackground (Color.cyan);
    setPreferredSize (new Dimension(300, 200));
  }
  
  //*****************************************************************
  //  Represents the listener for both check boxes.
  //*****************************************************************
  private class StyleListener implements ItemListener
  {
    //--------------------------------------------------------------
    //  Updates the style of the label font style.
    //--------------------------------------------------------------
    public void itemStateChanged (ItemEvent event)
    {
      style = Font.PLAIN;
      
      if (bold.isSelected())
        style = Font.BOLD;
      
      if (italic.isSelected())
        style += Font.ITALIC;
      
      //if courier radio button is pressed set typeFace to "Courier"
      if (event.getSource() == courier)
        typeFace = "Courier";
      
      //if times new roman radio button is pressed set typeFace to "Times New Roman"
      if (event.getSource() == timesNewRoman)
        typeFace = "Times New Roman";
      
      //if helvetica radio button is pressed set typeFace to "Helvetica"
      if (event.getSource() == helvetica)
        typeFace = "Helvetica";
      
      saying.setFont (new Font (typeFace, style, 20));
    }
  }
}