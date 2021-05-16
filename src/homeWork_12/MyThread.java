package homeWork_12;

public class MyThread extends Thread {

    private final int numberOfDigits;


    public MyThread(int numberOfDigits) {
        this.numberOfDigits = numberOfDigits;
    }

    public void run() {

        long m = 1;
        long n = 0;
        long l = 0;

        if (numberOfDigits != 0) {

            System.out.print("звичайний порядок : ");

            for (int i = 0; i < numberOfDigits; i++) {

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.print(m + " ");

                l = m;
                m += n;
                n = l;
            }
            System.out.println();
        }
    }
}