package homeWork_2;

import java.util.Scanner;

public class CodeTime1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[1000];
        System.out.println("Вводьте числа, для закінчення введіть 0");

        int count = 0;
        while (scan.hasNextInt()) {
            int valueFromConsole = scan.nextInt();
            array[count] = valueFromConsole;
            count ++;
            if (valueFromConsole == 0) {
                break;
            }
        }
        System.out.println("Кількість цифр = " + count);
        System.out.println("Сума введених чисел = " + sumArray(array, count));
    }

    public static  int sumArray (int[] array, int size) {
        if (array.length < size) {
            System.out.println("Неправильні значення розміру");
            return 0;
        }

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array[i];
        }
        return sum;
    }
}

// Запропонувати користувачу вводити числа доти, доки він не введе “0”.
// Після того, як користувач вводить “0” вивести на екран кількість чисел та суму чисел.