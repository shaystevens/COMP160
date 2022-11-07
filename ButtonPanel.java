import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ButtonPanel extends	JPanel{
 JTextField	display = new JTextField(12);
 JButton	change =	new JButton("Change team");
 JButton	reset	= new	JButton("Reset");
 int next =	0;
 String [] teams = {"Highlanders","Crusaders", "Waratahs", "Chiefs"};

public ButtonPanel(){
 ButtonListener bl =	new ButtonListener();
 change.addActionListener(bl);
 reset.addActionListener(bl);
 display.setText("Press a button");
 add(change);
 add(reset);
 add(display);
 }

 private	class	ButtonListener	implements ActionListener{

public void	actionPreformed(ActionEvent event){
 if (event.getSource() == change){ // display next	team
 display.setText(teams[next]);
 next	= (next < teams.length-1)?	++next :	0;
 }	else if (event.getSource()	==	reset){ // reset display
 display.setText("Press a button");
 next	= 0;
 }
}
 }
}