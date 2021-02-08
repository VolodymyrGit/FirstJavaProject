package homeWork_8;

import homeWork_8.commodityComparators.*;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Methods {
    private static Scanner scan = new Scanner(System.in);
    private static String sort1 = "\nСортуємо за ім'ям :";
    private static String sort2 = "\nСортуємо за довжиною :";
    private static String sort3 = "\nСортуємо за шириною :";
    private static String sort4 = "\nСортуємо за вагою :";

    public static void consoleMenu(List<Commodity> list) {
        System.out.println("Виводжу всі товари : \n" + list);

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
                    sortCommodity(list, new CommodityNameComparator(), sort1);
                    break;
                case 6:
                    sortCommodity(list, new CommodityLengthComparator(), sort2);
                    break;
                case 7:
                    sortCommodity(list, new CommodityWidthComparator(), sort3);
                    break;
                case 8:
                    sortCommodity(list, new CommodityWeightComparator(), sort4);
                    break;
                case 9:
                    printTheElementOfTheCollection(list);
                    break;
            }
        }
    }


    public static boolean doYouWantToContinue() {
        System.out.println("\nПрацюємо з товарами? (1 - так / 0 - ні) :");
        int answer = scan.nextInt();
        System.out.println();
        while (answer != 0 && answer != 1) {
            System.out.println("Ви ввели помилкове значення.\nБажаєте продовжити? (1/0)");
            answer = scan.nextInt();
            System.out.println();
        }
        return answer == 1;
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


    public static int lastIndex(List<Commodity> list) {
        return list.size() - 1;
    }


    public static void removeTheCommodity(List<Commodity> list) {
        System.out.println("\nВидаляємо обєкт зі списку :\n" + list + "\n\n" +
                "Вкажіть номер об'єкта від 0 до " + lastIndex(list) + " :");
        int i = scan.nextInt();
        System.out.println("Видалено обєкт : " + list.get(i).toString());
        list.remove(i);
        System.out.println(list);
    }


    public static void replaceTheCommodity(List<Commodity> list) {
        System.out.println("\nЗамінюємо товар : \n" +
                "Вкажіть номер товару, який хочете замінити від 0 до " + lastIndex(list) + " :");
        int i = scan.nextInt();
        System.out.println("Вкажіть номер товару, яким хочете замінити від 0 до " + lastIndex(list) + " :");
        int j = scan.nextInt();
        list.set(i, list.get(j));
        System.out.println(list);
    }


    public static void sortCommodity(List<Commodity> list, Comparator<Commodity> cC, String toDisplayHowWeWillSort) {
        System.out.println(toDisplayHowWeWillSort);
        list.sort(cC);
        System.out.println(list);
    }


    public static void printTheElementOfTheCollection(List<Commodity> list) {
        System.out.println("\nВиводимо елемент колекції за індексом.\n" +
                "Ведіть індекс елемента який хочете вивести від 0 до " + lastIndex(list) + " :");
        int index = scan.nextInt();
        System.out.println(list.get(index));
    }
}