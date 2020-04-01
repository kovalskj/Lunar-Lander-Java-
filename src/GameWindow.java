import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {

    double readX [] = {0, 0.075, 0.125, 0.15, 0.175, 0.275, 0.35, 0.40, 0.40, 0.45, 0.55, 0.625, 0.7, 0.725, 0.8, 0.875, 0.92, 0.97};
    double readY [] = {660, 580, 540, 560, 520, 520, 520, 580, 530, 570, 540, 540, 500, 540, 540, 500, 540,660};


    public GameWindow(Point Loc) {

        Game game = new Game(new DrawPlanet(), new DrawShip());
        add(game);
        setSize(800, 700);
        setLocation(Loc);
        setVisible(true);
        scaleX();
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

    public void scaleX(){
        Dimension size = getSize();
        for(int i =0; i<readX.length; i++){
             readX[i] = (int) (readX[i]*size.width);
        }
    }
}
