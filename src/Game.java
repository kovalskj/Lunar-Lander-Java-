import javax.swing.*;
import java.awt.*;

public class Game extends JPanel {

    DrawPlanet Planet;
    DrawShip Ship;
    int x[];
    int y[];
    int width;
    int height;
    Game(DrawPlanet Planet, DrawShip Ship, int readX[], int readY[], int widthIN, int heightIN){
        x = readX;
        y = readY;
        this.Planet = Planet;
        this.Ship = Ship;
        width = widthIN;
        height = heightIN;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;
        Planet.paintComponent(g2d,x,y, width, height);
        Ship.paintComponent(g2d, width, height);
    }

}
