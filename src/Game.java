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
        Planet.paintComponent(g);
        Ship.paintComponent(g);
    }

}
