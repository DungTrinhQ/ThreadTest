import java.util.Random;

public class Thread1 extends Thread {
    static public int i;

    public void run() {
        while (true) {
            Random num = new Random();
            synchronized (this) {
                i = num.nextInt(21);
                System.out.println("Thread1: " + i);
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}