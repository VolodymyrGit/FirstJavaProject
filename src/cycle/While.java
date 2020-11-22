package cycle;

import java.util.Scanner;

public class While {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть: (Так / Ні)");
        String str = scan.nextLine();

        while (str.equalsIgnoreCase("Так")) {
            System.out.println("Так");
            str = scan.nextLine();
        }
    }
}
