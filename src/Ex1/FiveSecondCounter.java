package Ex1;

public class FiveSecondCounter implements Runnable{
    int i = 0;
    @Override
    public void run() {
        for(;;) {
            fiveSecondMethod();
            if (i % 5 == 0) {
                System.out.println(Thread.currentThread().getName() + " Пройшло 5 секунд");
            }
        }
    }
    public void fiveSecondMethod() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        i++;
    };
}
