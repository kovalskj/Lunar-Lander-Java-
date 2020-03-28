import java.awt.*;

public class DrawShip {

    int x = 30 ,y = 30;

    protected void paintShip(Graphics g) {

        g.fillOval(x, y, 50, 50);
        x += 1;
        y += 1;
    }

    public void paint(Graphics g){
        paintShip(g);
    }
}
