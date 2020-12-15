package homeWork_6.task_Three;

import java.util.Scanner;

public class Methods {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Попрацюємо? (YES/NO)");
        while (continue$()) {
            System.out.println("Введіть змінну а");
            double a = scanner.nextDouble();
            System.out.println("Введіть змінну b");
            double b = scanner.nextDouble();

            validateVariables(a,b);

            boolean valid = validateVariables(a,b);

            if (valid) {
                adding(a, b);
                subtraction(a, b);
                multiplication(a, b);
                division(a, b);
            }
            System.out.println("Бажаєте продовжити? (YES/NO)");
            String s = scanner.nextLine();
        }
    }


    public static boolean validateVariables(double a, double b) {
        boolean valid = true;
        try {
            VariablesValidator.validate(a, b);
        } catch (IllegalArgumentException e) {
            System.out.println("Помилка : a < 0 і b < 0");
            valid = false;
        } catch (ArithmeticException e) {
            System.out.println("Помилка : a = 0 і b != 0 або a != 0 і b = 0");
            valid = false;
        } catch (IllegalAccessException e) {
            System.out.println("Помилка : a = 0 i b = 0");
            valid = false;
        } catch (MyException e) {
            System.out.println(e.getMessage());
            valid = false;
        }
        return valid;
    }


    public static boolean continue$() {
        String s = scanner.nextLine();
        boolean yes = true;
        while (!s.equalsIgnoreCase("no") && !s.equalsIgnoreCase("yes")) {
            System.out.println("Ви ввели помилкове значення.\nБажаєте продовжити? (YES/NO)");
            s = scanner.nextLine();
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