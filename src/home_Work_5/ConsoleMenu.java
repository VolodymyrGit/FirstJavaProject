package home_Work_5;

import java.util.Scanner;

public class ConsoleMenu {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome on work with the months!\n");
        String yes_No = "yes";

        while (!yes_No.equalsIgnoreCase("no")) {
            System.out.println("Enter the name of the month on English ");
            String str = scanner.nextLine();

            while (Months.checkIfThereIsSuchAMonth(str) == 0)


                Months.checkIfThereIsSuchAMonth(str);
            System.out.println(Months.checkIfThereIsSuchAMonth(str));
            Months.MARCH.displayAllMonthsWithTheSameSeason().
                    displayAllMonthsWithTheSameNumberOfDays().
                    displayAllMonthsThatHaveFewerDays().
                    displayAllMonthsThatHaveMoreDays().
                    displayTheNextSeason().
                    displayThePreviousSeason().
                    displayAllMonthsThatHaveAnEvenNumberOfDays().
                    displayAllMonthsThatHaveAnOddNumberOfDays();

            if (!yes_No.equalsIgnoreCase("no")) {
                System.out.println("You entered an incorrect value.");
            }
            System.out.println("Would you like to continue work with the months ( YES/NO )");
            yes_No = scanner.nextLine();
        }
        System.out.println("Goodbye");
    }

    public Months readMonthFromScanner () {
        System.out.println("Enter the name of the month on English ");
        String s = scanner.nextLine();
        for (Months m : Months.values()) {
            if (!s.equalsIgnoreCase(m.name())) {
                while (!s.equalsIgnoreCase(m.name())) {
                    while (!s.equalsIgnoreCase("NO")) {
                        System.out.println("You entered an incorrect value.\n" +
                                "Would you like to continue work with the months ( YES/NO )");
                        s = scanner.nextLine();
                    }
                    System.out.println("Enter the name of the month on English ");
                }
            }
        }
        return Months.valueOf(s);
    }

}
