import javax.swing.*;
import java.awt.*;

public class DrawPlanet extends JPanel {

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawLine(0, 660, 60, 580);
        g2d.drawLine(60, 580, 100, 540);
        g2d.drawLine(100, 540, 120, 560);
        g2d.drawLine(120, 560, 140, 520);
        g2d.drawLine(140, 520, 220, 520);
        g2d.drawLine(220, 520, 280, 520);
        g2d.drawLine(280, 520, 300, 580);
        g2d.drawLine(300, 580, 330, 530);
        g2d.drawLine(330, 530, 360, 570);
        g2d.drawLine(360, 570, 420, 540);
        g2d.drawLine(420, 540, 500, 540);
        g2d.drawLine(500, 540, 550, 500);
        g2d.drawLine(550, 500, 600, 540);
        g2d.drawLine(600, 540, 640, 540);
        g2d.drawLine(640, 540, 700, 500);
        g2d.drawLine(700, 500, 750, 540);
        g2d.drawLine(750, 540, 800, 540);
    }


}
