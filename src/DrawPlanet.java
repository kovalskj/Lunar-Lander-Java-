import javax.swing.*;
import java.awt.*;

public class DrawPlanet extends JPanel {

    int x [] = {0,60, 100, 120, 140, 220, 280, 300, 330, 360, 420, 500, 550, 600, 640, 700, 750,780};
    int y [] = {660, 580, 540, 560, 520, 520, 520, 580, 530, 570, 540, 540, 500, 540, 540, 500, 540,660};


     public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.fillPolygon(x, y, 18);
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
