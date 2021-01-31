package homeWork_7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskFour {
    private static final Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {

        System.out.println("Вводьте слова доки не набридне\n" +
                "Коли захочете завершити введіть - \"break\"");

        String s;
        List<String> aList = new ArrayList<>();

        do {
            s = scan.nextLine();
            aList.add(s);
        }
        while (!s.equalsIgnoreCase("break"));

        System.out.println();
        printAllWords(aList);

        System.out.println();
        printSWords(aList);

        System.out.println();
        printAllMoreThen5LettersWords(aList);
    }


    public static void printAllWords(List<String> l) {
        System.out.println("Всі слова які ввів користувач : ");
        for (int i = 0; i < (l.size() - 1); i++) {
            System.out.println(l.get(i));
        }
    }


    public static void printSWords(List<String> l) {
        System.out.println("Всі слова які починаються на \"s\" : ");
        for (int i = 0; i < (l.size() - 1); i++) {
            if (ifTheWordIsFits(l.get(i))) {
                System.out.println(l.get(i));
            }
        }
    }


    public static void printAllMoreThen5LettersWords(List<String> l) {
        System.out.println("Всі слова в яких кількість букв більше ніж 5 : ");
        for (int i = 0; i < (l.size() - 1); i++) {
            if (l.get(i).length() > 5) {
                System.out.println(l.get(i));
            }
        }
    }


    public static boolean ifTheWordIsFits(String s) {
        Pattern p = Pattern.compile("^s");
        Matcher m = p.matcher(s);
        return m.find();
    }
}
// 4.   Користувач з консолі має вводити слова доти, доки не введе “break”,
//      всі слова записуються в List.
//      Написати функцію для :
//
//  4.1 виведення користувачу всіх слова, які він ввів!
//  4.2 виведення слів, які починаються на “s”!
//  4.3 виведення слів, які мають кількість букв більше ніж 5!