import javax.swing.*;
import java.awt.*;

public class DrawShip extends JPanel {

    int x = 400 ,y = 30;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;
        g2d.fillOval(x, shipPosition(), 30, 30);

    }

    public int shipPosition(){
        if(y<510) {
            y += 1;
        }
        return y;
    }

}
