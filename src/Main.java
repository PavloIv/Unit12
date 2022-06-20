import Ex1.FiveSecondCounter;
import Ex1.Stopwatch;

public class Main {
    public static void main(String[] args) {
        Stopwatch stopwatch = new Stopwatch();
        FiveSecondCounter fiveSecondCounter = new FiveSecondCounter();
        Thread firstTread = new Thread(stopwatch);
        Thread secondThread = new Thread(fiveSecondCounter);
        firstTread.start();
        secondThread.start();
    }
}
