package homeWork_12;


public class RunnableThread implements Runnable {

    private final int numberOfDigits;


    public RunnableThread(int numberOfDigits) {
        this.numberOfDigits = numberOfDigits;
    }

    @Override
    public void run() {

        long m = 1;
        long n = 0;
        long l = 0;
        long[] numbers = new long[numberOfDigits];

        if (numberOfDigits != 0) {

            try {
                Thread.sleep(numberOfDigits * 1000 + 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.print("зворотній порядок : ");

            for (int i = 0; i < numberOfDigits; i++) {

                numbers[i] = m;

                l = m;
                m += n;
                n = l;
            }
            for (int j = numbers.length - 1; j >= 0; j--) {

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.print(numbers[j] + " ");
            }
        }
    }
}