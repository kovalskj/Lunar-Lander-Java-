import javax.swing.*;
import java.awt.*;

public class DrawPlanet extends JPanel {

     public void paintComponent(Graphics g, int readX[], int readY[]) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.fillPolygon(readX, readY, 18);
        g2d.setFont(new Font("TimesRoman", Font.PLAIN + Font.BOLD, 50));
        g2d.drawString("#1",370,70);
         g2d.setFont(new Font("TimesRoman", Font.PLAIN + Font.BOLD, 20));
         g2d.drawString("X: ",10,20);
         g2d.setFont(new Font("TimesRoman", Font.PLAIN + Font.BOLD, 20));
         g2d.drawString("Y: ",10,40);
        g2d.setFont(new Font("TimesRoman", Font.PLAIN + Font.BOLD, 20));
        g2d.drawString("12345",700,70);
        g2d.setColor(Color.red);
        g2d.fillOval(10,620 , 30, 30);
        g2d.fillOval(45,620 , 30, 30);
        g2d.fillOval(80,620 , 30, 30);
        g2d.fillOval(80,620 , 30, 30);
        g2d.fillRect(680,10, 100,20);

     }
}
