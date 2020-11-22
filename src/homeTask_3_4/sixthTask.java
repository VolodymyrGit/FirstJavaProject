package homeTask_3_4;

public class sixthTask {

    public static void main(String[] args) {

        int[] array = new int[10];

        for ( int i = 0; i < array.length; i++ ) {
            array[i] = ( (int)(Math.random() * 101) - 50 );
            System.out.print ( array[i] + " | " );
        }
        System.out.println();
        System.out.println("Найбільше число " + getMax(array));
        System.out.println("Найменше число " + getMin(array));
    }

    public static int getMax (int[] inputArray) {
        int maxValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] > maxValue) {
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }

    public static int getMin (int[] inputArray) {
        int minValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] < minValue) {
                minValue = inputArray[i];
            }
        }
        return minValue;
    }
}

//    Створіть масив, наповніть його рандомними даними, знайдіть найбільше та найменше значення масиву.