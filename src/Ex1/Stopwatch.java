package Ex1;

import java.util.concurrent.ScheduledFuture;

public class Stopwatch implements Runnable {
        int i = 0;
    @Override
    public void run() {
        for(;;) {
            stopwatch();
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
    public void stopwatch() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        i++;
        };
}
