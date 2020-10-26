package HomeTask_3_4;

import java.util.Scanner;

public class HomeTask {

    public static void main(String[] args) {
        System.out.println("Розв'язання квадратного рівняння: ax^2+bx+c=0");
        System.out.print("Введіь будь яке ціле число: a " );
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        System.out.print("Введіь будь яке ціле число: b " );
        double b = scan.nextDouble();
        System.out.print("Введіь будь яке ціле число: c " );
        double c = scan.nextDouble();
        if (a == 0 && b == 0)
            System.out.println("Змінні a=0, b=0, тому рівняння розв'язків не має");
        else if (a == 0 && b != 0) {
            System.out.println("Квадратне рівняння перетворюється в лінійне: bx+c=0");
            System.out.println("x = " + (-c / b));
        } else if (a != 0 && b == 0 && c == 0) {
            System.out.println("b = 0, c = 0 ; Не повне квадратне рівняння ax^2=0");
            System.out.println("x = 0");
        } else if (a != 0 && b != 0 && c == 0) {
            System.out.println("c = 0 ; Не повне квадратне рівняння ax^2+bx=0");
            System.out.println("x1 = 0");
            System.out.println("x2 = " + (-b / a));
        } else if (a != 0 && b == 0 && c != 0) {
            System.out.println("b = 0 ; Не повне квадратне рівняння ax^2+c=0");
        } else if ((-c / a) > 0) {
            System.out.println("x1 = " + (sqrt(-c / a)));
            System.out.println("x2 = " + (-(sqrt(-c / a))));
        } else ((-c / a) < 0)

    }
}
