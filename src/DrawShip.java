import javax.swing.*;
import java.awt.*;

public class DrawShip extends JPanel {

    int x = 400 ,y = 30;

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillOval(x, y, 30, 30);
        if(y<510) {
            y += 1;
        }

    }

}
