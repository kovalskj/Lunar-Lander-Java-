import javax.swing.*;
import java.awt.*;

public class DrawShip extends JPanel {

    int x = 400 ,y = 30;

    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x, y, 30, 30);
        if(y<510) {
            y += 1;
        }

    }

}
