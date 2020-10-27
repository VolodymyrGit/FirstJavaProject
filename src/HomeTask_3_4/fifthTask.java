package HomeTask_3_4;

import java.util.Scanner;

public class fifthTask {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введіь будь яке число:  ");
        double m = scan.nextDouble();
        System.out.print("Введіь будь яке число:  ");
        double n = scan.nextDouble();
        if (Math.abs(m - 10) < Math.abs(n - 10))
            System.out.println(m + " - ближче до 10");
        else if ((Math.abs(n - 10)) < (Math.abs(m - 10)))
            System.out.println(n + " - ближче до 10");
    }
}

//    Створити програму, що виводить на екран найближче до 10 з двох чисел, записаних в змінні m і n.
//        Користувач вводить два числа m та n , програма виводить число, яке є ближче до 10.
//        Наприклад, серед чисел 8.5 і 11.45 найближче до десяти 11,45.