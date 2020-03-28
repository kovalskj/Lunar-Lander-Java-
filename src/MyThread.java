import javax.swing.*;

import static java.lang.Thread.sleep;

public class MyThread implements  Runnable{
    private JFrame component;

    public MyThread(JFrame component) {
        this.component = component;
        System.out.println("Watek");
    }

    public void run() {

        while (true) {
            component.repaint();
            System.out.println("Watek run");
            try {
                sleep(5);
            } catch (Exception e) {
                System.out.println("Wyjątek!");
            }
        }

    }
}