import javax.swing.*;
import java.awt.*;
import java.io.File;

public class GameWindow extends JFrame {

    int readX[];
    int readY[];

    public GameWindow(Point Loc) {
        try {
            LoadingLevel File = new LoadingLevel(new File("testLevel.txt"));
            readX = File.getPosition();
            readY = File.getElevation();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        setSize(800, 700);
        scaleX();
        scaleY();
        Game game = new Game(new DrawPlanet(), new DrawShip(), readX, readY);
        add(game);
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

    public void scaleX(){
        Dimension size = getSize();
        for(int i =0; i<readX.length; i++){
            readX[i] = (int)(((double)readX[i]/100)*size.width);
        }
    }

    public void scaleY(){
        Dimension size = getSize();
        for(int i =0; i<readY.length; i++){
            readY[i] = (int)(((double)readY[i]/100)*size.height);
            System.out.println(readY[i]);
        }
    }

}
