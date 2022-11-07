import java.awt.*;
import javax.swing.*;
public class MyFrame extends JFrame {

 public void paint (Graphics g) {

int top = 50;
int bottom = 150;
int left = 50;
int right = 150;
for (int i = 0; i <= 100; i += 10) {
g.drawLine(left + i, top, right - i, bottom);
// comment 1
}
// comment 2
 }

}