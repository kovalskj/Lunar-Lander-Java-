import java.awt.Color;
import java.awt.Graphics;

import javax.swing.*;

public class DrawGameField extends JPanel
{

        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawLine(0, 480, 60, 240);
            g.drawLine(60, 240, 100, 200);
            g.drawLine(100, 200, 120, 220);
            g.drawLine(120, 220, 140, 180);
            g.drawLine(140, 180, 220, 180);
            g.drawLine(220, 180, 280, 280);
            g.drawLine(280, 280, 300, 250);
            g.drawLine(300, 250, 330, 230);
            g.drawLine(330, 230, 360, 280);
            g.drawLine(330, 280, 420, 400);



        }

}