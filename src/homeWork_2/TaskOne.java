package homeWork_2;

import java.util.Scanner;

public class TaskOne {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Рахуємо, яким буде вклад за певну кількість років, \n" +
                "якщо ви введете суму та процентну ставку.\n" +
                "");
        System.out.print("Введіть суму грн (лише цифри) : ");
        double m = scan.nextDouble();
        System.out.print("Введіть процентну ставку (% річних (лише цифри)) : ");
        float n = scan.nextFloat();
        System.out.print("Термін - введіть кількість років (лише ифри) : ");
        float k = scan.nextFloat();

        Double result = m + (m * n / 100 * k);
        System.out.println("\nЯкщо покласти суму " + m + "грн, під " +
                n + " % на " + k + " років \n");
        System.out.print("Можна отримати : ");
        System.out.printf("%.2f", result);
        System.out.println(" грн");
    }
}

/*
    В банк поклали m - гривень під n-% відсотків річних.
    Яким буде вклад за K-років.
    Користувач вводить : m -суму грошей , n - процентна ставка та  k-кількість років.
*/