import javax.swing.*;
import java.awt.*;

public class DrawShip extends JPanel {

    int x = 30 ,y = 30;

    protected void paintShip(Graphics g) {

        g.fillOval(x, y, 50, 50);
        y += 1;
        System.out.println(y);
    }

    public void paint(Graphics g){
        super.paint(g);
        paintShip(g);
    }
}
