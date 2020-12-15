package home_Work_5;

import java.util.Scanner;

public class ConsoleMenu {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome on work with the months!\n");
        String yes_No = "yes";

        while (!yes_No.equalsIgnoreCase("no")) {

            if (yes_No.equalsIgnoreCase("yes")) {

                while (yes_No.equalsIgnoreCase("yes")) {
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
                    yes_No = scanner.nextLine();
                    System.out.println();
                }
            } else if (!yes_No.equalsIgnoreCase("yes")) {
                System.out.println("You entered an incorrect value - " + yes_No + "\n" +
                        "Would you like to continue work with the months ( YES/NO )");
                yes_No = scanner.nextLine();
                System.out.println();
            }
        }
        System.out.println("Goodbye");
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