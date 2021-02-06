package homeWork_8;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Methods extends Commodity {
    private static Scanner scan = new Scanner(System.in);

    public Methods(String name, int length, int width, int weight) {
        super(name, length, width, weight);
    }

    public static void consoleMenu(List<Commodity> list) {
        System.out.println("Виводжу всі товари : \n" +
                list);

        while (doYouWantToContinue()) {

            System.out.println("\n0 - Завершити роботу\n" +
                    "2 - Додати товар\n" +
                    "3 - Видалити товар\n" +
                    "4 - Замінити товар\n" +
                    "5 - Сортувати за назвоню\n" +
                    "6 - Сортувати за довжиною\n" +
                    "7 - Сортувати за шириною\n" +
                    "8 - Сортувати за вагою\n" +
                    "9 - Вивести елемент колекції за індексом\n" +
                    "Введіть номер операії :");

            int actionNumber = scan.nextInt();

            switch (actionNumber) {
                case 0:
                    System.exit(0);
                    break;
                case 2:
                    addTheCommodity(list);
                    break;
                case 3:
                    removeTheCommodity(list);
                    break;
                case 4:
                    replaceTheCommodity(list);
                    break;
                case 5:
                    sortByName(list);
                    break;
                case 6:
                    sortByLength(list);
                    break;
                case 7:
                    sortByWidth(list);
                    break;
                case 8:
                    sortByWeight(list);
                    break;
                case 9:
                    printTheElementOfTheCollection(list);
                    break;
            }
        }
    }


    public static boolean doYouWantToContinue() {
        System.out.println("\nПрацюємо з товарами? (1 - так / 0 - ні) :");
        String answer = scan.nextLine();
        System.out.println();
        while (!answer.equalsIgnoreCase("0") && !answer.equalsIgnoreCase("1")) {
            System.out.println("Ви ввели помилкове значення.\nБажаєте продовжити? (1/0)");
            answer = scan.nextLine();
            System.out.println();
        }
        return !answer.equalsIgnoreCase("0");
    }


    public static void addTheCommodity(List<Commodity> list) {
        System.out.println("\nДодаємо новий товар\n" +
                "Введіть назву товару : ");
        String name = scan.nextLine();

        System.out.println("Введіть довжину :");
        int length = scan.nextInt();

        System.out.println("Введіть ширину :");
        int width = scan.nextInt();

        System.out.println("Введіть вагу :");
        int weight = scan.nextInt();

        list.add(new Commodity(name, length, width, weight));

        System.out.println(list);
    }


    public static void removeTheCommodity(List<Commodity> list) {
        System.out.println("\nВидаляємо обєкт :\n" +
                "Вкажіть номер об'єкта від 0 до " + (list.size() - 1) + " :");
        int i = scan.nextInt();
        System.out.println("Видалено обєкт : " + list.get(i).toString());
        list.remove(i);
        System.out.println(list);
    }


    public static void replaceTheCommodity(List<Commodity> list) {
        System.out.println("\nЗамінюємо товар : \n" +
                "Вкажіть номер товару, який хочете замінити від 0 до " + (list.size() - 1) + " :");
        int i = scan.nextInt();
        System.out.println("Вкажіть номер товару, яким хочете замінити від 0 до " + (list.size() - 1) + " :");
        int j = scan.nextInt();
        list.set(i, list.get(j));
        System.out.println(list);
    }


    public static void sortByName(List<Commodity> list) {
        System.out.println("\nСортуємо за ім'ям :");
        Collections.sort(list);
        System.out.println(list);
    }


    public static void sortByLength(List<Commodity> list) {
        System.out.println("\nСортуємо за довжиною :");
        list.sort(new CommodityLengthComparator());
        System.out.println(list);
    }


    public static void sortByWidth(List<Commodity> list) {
        System.out.println("\nСортуємо за шириною :");
        list.sort(new CommodityWidthComparator());
        System.out.println(list);
    }


    public static void sortByWeight(List<Commodity> list) {
        System.out.println("\nСортуємо за вагою :");
        list.sort(new CommodityWeightComparator());
        System.out.println(list);
    }


    public static void printTheElementOfTheCollection(List<Commodity> list) {
        System.out.println("\nВиводимо елемент колекції за індексом.\n" +
                "Ведіть індекс елемента який хочете вивести від 0 до " + (list.size() - 1) + " :");
        int index = scan.nextInt();
        System.out.println(list.get(index));
    }
}
