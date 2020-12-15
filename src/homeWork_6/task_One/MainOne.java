package homeWork_6.task_One;

import java.util.Scanner;

public class MainOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть ціле число");
        double a = scanner.nextDouble();
        if (validateVariables(a)) {
            if (a % 2 == 0) {
                System.out.println("Введено парне число");
            } else {
                System.out.println("Введено неарне число");
            }
        }
    }

    public static boolean validateVariables(double a) {
        boolean integerNumber = true;
        try {
            variablesValidator(a);
        } catch (ArithmeticException e) {
            System.out.println("Помилка : введено не ціле число");
            integerNumber = false;
        }
        return integerNumber;
    }

    private static void variablesValidator(double a) throws ArithmeticException {
        if (a % 1 != 0) {
            throw new ArithmeticException();
        }
    }
}
/*
1) Створити програму, яка буде повідомляти,
чи є ціле число, введене користувачем, парним або непарним.
Якщо користувач введе не ціле число, то повідомляти йому про помилку.
 */