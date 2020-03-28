import java.awt.Component;

public class ThreadTest implements Runnable{

    private final Component c;

    public ThreadTest(Component c)
    {
        this.c = c;
        (new Thread(this, "Name")).start();
    }

    public void run()
    {
        while (true) {
            c.repaint();
            try {
                Thread.sleep(5);
            }
            catch (Exception e) {
                System.out.println("Wyjątek!");
            }
        }
    }
}