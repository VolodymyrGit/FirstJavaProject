package home_Work_5;

import java.security.PublicKey;
import java.util.Scanner;

public class Enums {
    Scanner scanner = new Scanner(System.in);

    public String readFromScanner () {
        System.out.println("Enter the name of the month on English ");
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

    public void displayAllMonthsWithTheSameSeason () {

    }

    public void displayAllMonthsWithTheSameNumberOfDays () {

    }

    public void displayAllMonthsThatHaveFewerDays () {

    }

    public void displayAllMonthsThatHaveMoreDays () {

    }

    public void displayTheNextSeason () {

    }

    public void displayThePreviousSeason () {

    }

    public void displayAllMonthsThatHaveAnEvenNumberOfDays () {

    }

    public void displayAllMonthsThatHaveAnOddNumberOfDays () {

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