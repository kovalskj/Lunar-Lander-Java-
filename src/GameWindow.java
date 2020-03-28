import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {

    DrawPlanet Planet;
    DrawShip Ship;

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

        Planet = new DrawPlanet();
        Ship = new DrawShip();
       MyThread myThread = new MyThread(this);
        (new Thread(myThread)).start();

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

    @Override
    public void paint(Graphics g) {
        Planet.paint(g);
        Ship.paint(g);
    }

}
