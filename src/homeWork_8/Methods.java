package homeWork_8;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Methods extends Commodity{

    public static Scanner scan = new Scanner(System.in);

    public Methods(String name, double length, double width, double weight) {
        super(name, length, width, weight);
    }


    public static void displayAllProducts(List<Object> l) {
        System.out.println("Виводжу всі товари : ");
        for (Object o : l) {
            System.out.println(o.toString());
        }
        System.out.println();
    }


    public static List<Object> addTheCommodity (List<Object> l) {
        System.out.println("Додаємо новий товар\n" +
                "Введіть назву товару : ");
        String n = scan.nextLine();
        System.out.println("Введіть довжину :");
        double len = scan.nextDouble();
        System.out.println("Введіть ширину :");
        double wid = scan.nextDouble();
        System.out.println("Введіть вагу :");
        double wei = scan.nextDouble();
        System.out.println();

        l.add(new Commodity(n, len, wid, wei));
        return l;
    }


    public static void removeTheCommodity (List<Object> l) {
        System.out.println("Видаляємо обєкт :\n" +
                "Вкажіть номер об'єкта від 0 до " + (l.size() - 1) + " :");
        int i = scan.nextInt();
        System.out.println("Видалено обєкт : " + l.get(i).toString());
        l.remove(i);
        System.out.println();
    }


    public static void replaceTheCommodity (List<Object> l) {
        System.out.println("Замінюємо товар : \n" +
                "Вкажіть номер товару, який хочете замінити від 0 до " + (l.size() - 1) + " :");
        int i = scan.nextInt();
        System.out.println("Вкажіть номер товару, яким хочете замінити від 0 до " + (l.size() - 1) + " :");
        int j = scan.nextInt();
        l.set(i,l.get(j));
        System.out.println();
    }


    public static void sortByName (List<Commodity> list) {
        System.out.println("\nСортуємо за ім'ям :");
        Collections.sort(list);
        System.out.println(list);
    }


    public void sortByLength () {
        System.out.println("\nСортуємо за довжиною :");

    }


    public void sortByWidth () {

    }


    public void sortByWeight () {

    }


    public void printTheElementOfTheCollection () {

    }
}
