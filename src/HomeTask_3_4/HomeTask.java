package HomeTask_3_4;

import java.util.Scanner;

public class HomeTask {

    public static void main(String[] args) {
        String end = "Розв'язків рівняння не має";
        System.out.println("Розв'язання квадратного рівняння: ax^2+bx+c=0");
        System.out.print("Введіь будь яке ціле число: a " );
        Scanner scan = new Scanner(System.in);
        double a = scan.nextInt();
        System.out.print("Введіь будь яке ціле число: b " );
        double b = scan.nextInt();
        System.out.print("Введіь будь яке ціле число: c " );
        double c = scan.nextInt();
        if (a == 0 && b == 0)
        System.out.println("Змінні a=0, b=0, тому " + end);
        else if (a == 0 && b != 0) {
            System.out.println("Квадратне рівняння перетворюється в лінійне: bx+c=0");
            System.out.println("x = " + (-c / b));
        }
    }
}
