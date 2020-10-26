package HomeTask_3_4;

import java.util.Scanner;

public class HomeTask {

    public static void main(String[] args) {
        System.out.println("Розв'язання квадратного рівняння: ax^2+bx+c=0");
        System.out.print("Введіь будь яке ціле число: a = " );
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        System.out.print("Введіь будь яке ціле число: b = " );
        double b = scan.nextDouble();
        System.out.print("Введіь будь яке ціле число: c = " );
        double c = scan.nextDouble();
        System.out.println(a + " * x^2 + " + b + " * x + " + c + " = 0");
        if (a == 0 && b == 0)
            System.out.println("Змінні a=0, b=0, тому рівняння розв'язків не має");
        else if (a == 0 && b != 0) {
            System.out.println("Квадратне рівняння перетворюється в лінійне: bx+c=0");
            System.out.println("x = -c/b = " + (Math.abs(-c / b)));
        } else if (a != 0 && b == 0 && c == 0) {
            System.out.println("b = 0, c = 0 ; Не повне квадратне рівняння ax^2=0");
            System.out.println("x = 0");
        } else if (a != 0 && b != 0 && c == 0) {
            System.out.println("c = 0 ; Не повне квадратне рівняння ax^2+bx=0");
            System.out.println("x1 = 0");
            System.out.println("x2 = " + (-b / a));
        } if (a != 0 && b == 0 && c != 0) {
            System.out.println("b = 0 ; Не повне квадратне рівняння ax^2+c=0");
            if ((-c / a) > 0) {
                System.out.println("x1 = " + (Math.sqrt(-c / a)));
                System.out.println("x2 = " + (-(Math.sqrt(-c / a))));
            } else {
                System.out.println("(-c / a) < 0 тому рівняння розв'язків не має");
            }
        }if (a != 0 && b != 0 && c != 0) {
            byte exponent = 2;
            double D = ((Math.pow(b, exponent)) - 4 * a * c);
            System.out.println("Використовуємо дискримінант D");
            System.out.println("D = b^2 - 4ac = " + D);
            if (D == 0) {
                System.out.println("Дискримінант D = 0 , тому x = -b/2a = " + (-b / 2 * a));
            } else if (D > 0) {
                    System.out.println("x1 = (-b + sqrt(D))/(2a) = " + ((-b + (Math.sqrt(D))) / 2 * a));
                    System.out.println("x2 = (-b - sqrt(D))/(2a) = " + (-b - (Math.sqrt(D)) / 2 * a));
            } else {
                    System.out.println("Дискримінант D < 0 , тому рівняння розв'язків не має");
                }
        }
    }
}

