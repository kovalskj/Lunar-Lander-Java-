import java.awt.*;

public class DrawShip {

    protected void paintShip(Graphics g){
        g.fillOval(30,30,50,50);

    }

    public void paint(Graphics g){
        paintShip(g);
    }


}
