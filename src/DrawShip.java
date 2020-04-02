import javax.swing.*;
import java.awt.*;

public class DrawShip extends JPanel {

    int y;

    DrawShip(int height){
        y = (int) (height*0.01);
    }

    public void paintComponent(Graphics g, int width, int height) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;
        g2d.setColor(Color.black);
        g2d.fillOval(shipPositionX(width), shipPositionY(), 30, 30);
        g2d.setFont(new Font("TimesRoman", Font.PLAIN + Font.BOLD, 20));
        g2d.drawString("X: ", (int) (width*0.01),(int) (height*0.05));
        g2d.drawString("Y: ",(int) (width*0.01) ,(int) (height*0.1));
    }
    public int shipPositionY(){
        if(y<510) {
            y += 1;
        }
        return y;
    }

    public int shipPositionX(int width){
        return (int) (width*0.48);
    }
}
