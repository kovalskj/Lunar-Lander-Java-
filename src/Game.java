import javax.swing.*;
import java.awt.*;

public class Game extends JPanel {

    DrawPlanet Planet;
    DrawShip Ship;

    Game(DrawPlanet Planet, DrawShip Ship){
        this.Planet = Planet;
        this.Ship = Ship;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;
        Planet.paintComponent(g2d);
        Ship.paintComponent(g2d);
    }

}
