package homeWork_6.task_Three;

import java.util.Scanner;

public class Methods {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Попрацюємо? (YES/NO)");

        while (doYouWantToContinue()) {
            System.out.println("Введіть змінну а");
            double a = scanner.nextDouble();
            System.out.println("Введіть змінну b");
            double b = scanner.nextDouble();

            if (validateVariables(a,b)) {
                adding(a, b);
                subtraction(a, b);
                multiplication(a, b);
                division(a, b);
                System.out.println();
            }
            System.out.println("Бажаєте продовжити? (YES/NO)");
            String s = scanner.nextLine();
        }
    }


    public static boolean validateVariables(double a, double b) {
        boolean valid = false;
        try {
            VariablesValidator.validate(a, b);
            valid = true;
        } catch (IllegalArgumentException e) {
            System.out.println("Помилка : a < 0 і b < 0");
        } catch (ArithmeticException e) {
            System.out.println("Помилка : a = 0 і b != 0 або a != 0 і b = 0");
        } catch (IllegalAccessException e) {
            System.out.println("Помилка : a = 0 i b = 0");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();
        return valid;
    }


    public static boolean doYouWantToContinue() {
        String s = scanner.nextLine();
        System.out.println();
        boolean yes = true;
        while (!s.equalsIgnoreCase("no") && !s.equalsIgnoreCase("yes")) {
            System.out.println("Ви ввели помилкове значення.\nБажаєте продовжити? (YES/NO)");
            s = scanner.nextLine();
            System.out.println();
        }
        if (s.equalsIgnoreCase("no")) {
            yes = false;
        }
        return yes;
    }

    public static void adding(double a, double b) {
        System.out.println("a + b = " + (a + b));
    }

    public static void subtraction(double a, double b) {
        System.out.println("a - b = " + (a - b));
    }

    public static void multiplication(double a, double b) {
        System.out.println("a * b = " + (a * b));
    }

    public static void division(double a, double b) {
        System.out.println("a / b = " + (a / b));
    }
}
/*
3.Створити свій Exception(MyException). Створити клас Methods, Описати в ньому методи , які б
розраховували додавання, віднімання, множення, ділення двох змінних . При цьому врахувати :
Якщо a<0 і b<0 викидаємо IllegalArgumentException
Якщо a=0 і b!=0 або a!=0 і b=0 викидаємо ArithmeticException
Якщо a=0 і b=0 викидаємо IllegalAccessException
Якщо a>0 і b>0 викидаємо MyException
Протестувати всі можливі варіанти, і вивести все на консоль.
 */