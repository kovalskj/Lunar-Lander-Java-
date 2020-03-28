import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {

    public GameWindow(Point Loc, int width, int heigth) {

        Game game = new Game(new DrawPlanet(), new DrawShip());
        add(game);
        setSize(new Dimension(width, heigth));
        setLocation(Loc);
        setVisible(true);

        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                new MainWindow(locPoint(), getWidth(), getHeigth());
            }
        });

        new MyThread(game);
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


}
