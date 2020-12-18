package home_Work_5;

import java.util.Scanner;

/**
 * @Autor Volodymyr Melnyk
 * This is my main class
 * The class implements the console menu for working with ENUM
 */
public class ConsoleMenu {

    /**
     * A scanner object of class Scanner is created
     */
    private static final Scanner scanner = new Scanner(System.in);

    /**
     * The program starts running here
     * @param args command line values
     */
    public static void main(String[] args) {
        System.out.println("Welcome on work with the months!\n" +
                "Shell we start? ( YES/NO )");

        while (doYouWantToContinue()) {
            System.out.println("Enter the name of the month on English ");
            String str = scanner.nextLine();
            System.out.println();

            if (Months.checkIfThereIsSuchAMonth(str)) {
                Months.valueOf(str.toUpperCase())
                        .displayWhetherTheMonthEnteredFromTheConsoleHasAnEvenNumberOfDays()
                        .displayAllMonthsThatHaveAnEvenNumberOfDays()
                        .displayAllMonthsThatHaveAnOddNumberOfDays()
                        .displayAllMonthsWithTheSameNumberOfDays()
                        .displayAllMonthsThatHaveFewerDays()
                        .displayAllMonthsThatHaveMoreDays()
                        .displayAllMonthsWithTheSameSeason()
                        .displayTheNextSeason()
                        .displayThePreviousSeason();
            }
            System.out.println("Would you like to continue work with the months ( YES/NO )");
        }
        System.out.println("Goodbye");
    }

    /**
     * The program asks the user to enter String "s" until the user enters (YES/NO)
     * @return boolean :
     * true if enter "YES"
     * false if enter "NO"
     */
    private static boolean doYouWantToContinue() {
        boolean yesOrNo = true;
        String s = scanner.nextLine();
        System.out.println();
        while (!s.equalsIgnoreCase("yes") && !s.equalsIgnoreCase("no")) {
            System.out.println("You entered an incorrect value - " + s + "\n" +
                    "Would you like to continue work with the months ( YES/NO )");
            s = scanner.nextLine();
            System.out.println();
        }
        if (s.equalsIgnoreCase("no")) {
            yesOrNo = false;
        }
        return yesOrNo;
    }

}
//    Написати консольну програму для роботи з Enums.
//    Створити енум Сезони, в якому оголосити такі константи : Зима , Весна, Літо, Осінь.
//    Створити енум Місяці, в якому створити 12 констант- місяці року(Січень , Лютий.. Грудень ),
//    оголосити змінну дні, та змінну сезон типу Сезон , як поле енума .
//    Створити конструктор з визначеними параметрами в енумі Місяці,
//    в який як параметри передати змінну дні та сезон.
//    Описати getters до даних полів (дні, сезони).
//    Створити консольне меню, в якому реалізувати наступні пункти :
//
//    Перевірити чи є такий місяць (місяць вводимо з консолі, передбачити, щоб регістр
//    букв був не важливим ).
//    Вивести всі місяці з такою ж порою року.
//    Вивести всі місяці які мають таку саму кількість днів.
//    Вивести на екран всі місяці які мають меншу кількість днів.
//    Вивести на екран всі місяці які мають більшу кількість днів.
//    Вивести на екран наступну пору року.
//    Вивести на екран попередню пору року.
//    Вивести на екран всі місяці які мають парну кількість днів.
//    Вивести на екран всі місяці які мають непарну кількість днів.
//    Вивести на екран чи введений з консолі місяць має парну кількість днів.