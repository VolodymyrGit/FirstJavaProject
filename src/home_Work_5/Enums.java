package home_Work_5;

import java.util.Scanner;

public class Enums {
    Scanner scanner = new Scanner(System.in);

    public String readFromScanner (String string) {
        System.out.println("Enter the name of the month on English ");
        String s = "YES";
        for (Months m : Months.values())
        if (!string.equalsIgnoreCase(m.name())){
            while (!s.equalsIgnoreCase("NO")) {
                System.out.println("You entered an incorrect value.\n" +
                        "Would you like to continue work with the months ( YES/NO )");
                s = scanner.nextLine();
                System.out.println("Enter the name of the month on English ");
            }
        }
        return scanner.nextLine();
    }

    public void toCompare (String str) {
        Months[] arr = Months.values();
        for(Months month : arr) {
            if(str.equalsIgnoreCase(month.name()));
            System.out.println();
        }
    }

    public void checkIfThereIsSuchAMonth () {

    }

    public static void displayAllMonthsWithTheSameSeason (Months month) {
        for(Months m : Months.values()) {
            if(month.getSeason() == m.getSeason()) {
                System.out.println(m.name() + "- This month is from the same time of year - " + m.getSeason());
            }
        }
        System.out.println();
    }


    public void DisplayWhetherTheMonthEnteredFromTheConsoleHasAnEvenNumberOfDays () {

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