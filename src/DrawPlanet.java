import java.awt.*;

public class DrawPlanet {

    protected void paintPlante(Graphics g){
        g.drawLine(0,0,400,400);
        g.drawLine(400,400,0,0);
    }

    public void paint(Graphics g){
        paintPlante(g);
    }
}
