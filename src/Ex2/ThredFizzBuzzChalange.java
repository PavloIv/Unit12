package Ex2;

public class ThredFizzBuzzChalange {
    int n;
    static int[] fbArray;
    String[] result;

    public ThredFizzBuzzChalange(int n) {
        this.n = n;

        Thread inputArray = new Thread(() -> inputArray(n));
        inputArray.start();
        Thread fizzbuzz = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(200);
                    fizzbuzz();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        fizzbuzz.start();
        Thread fizz = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(100);
                    fizz();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        fizz.start();
        Thread buzz = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(150);
                    buzz();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        buzz.start();
        Thread number = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(250);
                    number();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        number.start();

    }

    public int[] inputArray(int n) {
        fbArray = new int[n];
        result = new String[n];
        for (int i = 0; i < n; i++) {
            fbArray[i] = i + 1;
        }
        return fbArray;
    }

    public String[] fizz() {
        for (int i = 0; i < n; i++) {
            if (fbArray[i] % 3 == 0) {
                result[i] = "fizz";
            }
        }
        return result;
    }

    public String[] buzz() {
        for (int i = 0; i < n; i++) {
            if (fbArray[i] % 5 == 0) {
                result[i] = "buzz";
            }
        }
        return result;
    }
    public String[] fizzbuzz() {
        for (int i = 0; i < n; i++) {
            if (fbArray[i] % 15 == 0) {
                result[i] = "fizzbuzz";
            }
        }
        return result;
    }

    public void number() {
        for (int i = 0; i < n; i++) {
            if (result[i] == null) {
                result[i] = "" + (i + 1);
                System.out.print(result[i] + " ");
            } else {
                System.out.print(result[i] + " ");
            }
        }
    }
}

