package homeWork_2;

import java.util.Scanner;

public class TaskTwo {

    public static void main(String[] args) {
        System.out.println("Введіть 5 елементів масиву");
        Scanner scan = new Scanner(System.in);
        String[] array = new String[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextLine();
        }
        System.out.print("| ");
        for (String s : array) {
            System.out.print(s + " | ");
        }
        System.out.println();
        System.out.print("| ");
        for (int i = array.length - 1 ; i >= 0; i--) {
            System.out.print(array[i] + " | ");
        }
    }
}
//    Користувач задає елементи масиву певного розміру (розмір масиву вибирає програміст).
//    Ваше завдання вивести масив, який ввів користувач, а потім вивести масив у зворотньому порядку.