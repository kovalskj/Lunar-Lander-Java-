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

        Thread ThreadA = new Thread();
        ThreadA.start();
        run();
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
        super.paint(g);
        DrawPlanet Planet = new DrawPlanet();
        DrawShip Ship = new DrawShip();
        Planet.paint(g);
        Ship.paint(g);
    }

    public void run(){
        repaint();
    }
}
