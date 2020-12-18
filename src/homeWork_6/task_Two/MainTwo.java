package homeWork_6.task_Two;

import java.util.Scanner;

public class MainTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean integerNumber;

        double b = 0;
        System.out.println("Введіть змінну а (Ціле число)");
        double a = scanner.nextDouble();
        if (validateVariable(a)) {
            System.out.println("Введіть змінну b (Ціле число)");
            b = scanner.nextDouble();
            integerNumber = validateVariable(b);
        } else {
            integerNumber = false;
        }
        if (integerNumber) {
            System.out.println("Сума двох чисел введених користувачем = " + (int)(a + b));
        }
    }

    private static boolean validateVariable(double d) {
        boolean integerNumber = true;
        try {
            variablesValidator(d);
        } catch (ArithmeticException e) {
            System.out.println("Помилка : введено не ціле число");
            integerNumber = false;
        }
        return integerNumber;
    }

    private static void variablesValidator(double d) throws ArithmeticException {
        if (d % 1 != 0) {
            throw new ArithmeticException();
        }
    }
}
/*
2) Створити програму, яка буде обчислювати і
виводити на екран суму двох цілих чисел, введених користувачем.
Якщо користувач некоректно введе хоча б одне з чисел, то повідомляти про помилку.
 */