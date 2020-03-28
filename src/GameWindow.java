import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {
    DrawPlanet Planet;
    DrawShip Ship;

    public GameWindow(Point Loc, int width, int heigth) {

        Planet = new DrawPlanet();
        Ship = new DrawShip();
        Game game = new Game(Planet, Ship);
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

    private static class Game extends JPanel {
        DrawPlanet Planet;
        DrawShip Ship;

        Game(DrawPlanet Planet, DrawShip Ship){
            this.Planet = Planet;
            this.Ship = Ship;
        }

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            Planet.paintComponent(g);
            Ship.paintComponent(g);
        }
    }
}
