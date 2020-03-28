import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {

    public GameWindow(Point Loc, int width, int heigth){

        pack();
        setSize(new Dimension(width, heigth));
        setLocation(Loc);
        setVisible(true);

        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                new MainWindow(locPoint(), getWidth(), getHeigth());
            }
        });

        Thread Thread1 = new Thread();
    }

    private Point locPoint() {
        return this.getLocation();
    }

    public int getWidth() {
        return this.getSize().width;
    }

    public int getHeigth() {
        return this.getSize().height;
    }

    public void paint(Graphics g){
        DrawShip Ship = new DrawShip();
        DrawPlanet Planet = new DrawPlanet();
        Ship.paint(g);
        Planet.paint(g);
    }
}
