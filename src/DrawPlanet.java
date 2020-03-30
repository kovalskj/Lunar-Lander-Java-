import javax.swing.*;
import java.awt.*;

public class DrawPlanet extends JPanel {
    int x [] = {0,60, 100, 120, 140, 220, 280, 300, 330, 360, 420, 500, 550, 600, 640, 700, 750,780};
    int y [] = {660, 580, 540, 560, 520, 520, 520, 580, 530, 570, 540, 540, 500, 540, 540, 500, 540,660};
     public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.fillPolygon(x, y, 18);
    }


}
