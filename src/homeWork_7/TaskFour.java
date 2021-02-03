package homeWork_7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskFour {
    private static final Scanner scan = new Scanner(System.in);
    private static List<String> listWithSomeWords = new ArrayList<>();
    private static Pattern pattern = Pattern.compile("^s");


    public static void main(String[] args) {
        enterWordsUntilYouEnterABreak();
        printAllWords(listWithSomeWords);
        printOnlyThoseWordsThatHaveTheLetterS(listWithSomeWords);
        printAllMoreThen5LettersWords(listWithSomeWords);
    }


    public static void enterWordsUntilYouEnterABreak() {
        System.out.println("Вводьте слова доки не набридне\n" +
                "Коли захочете завершити введіть - \"break\"");
        String s = scan.nextLine();

        while (!s.equalsIgnoreCase("break")) {
            listWithSomeWords.add(s);
            s = scan.nextLine();
        }
    }


    public static void printAllWords(List<String> list) {
        System.out.println("\nВсі слова які ввів користувач : ");
        for (String s : list) {
            System.out.println(s);
        }
    }


    public static void printOnlyThoseWordsThatHaveTheLetterS(List<String> list) {
        System.out.println("\nВсі слова які починаються на \"s\" : ");
        for (String s : list) {
            Matcher matcher = pattern.matcher(s);
            if (matcher.find()) {
                System.out.println(s);
            }
        }
    }


    public static void printAllMoreThen5LettersWords(List<String> list) {
        System.out.println("\nВсі слова в яких кількість букв більше ніж 5 : ");
        for (String s : list) {
            if (s.length() > 5) {
                System.out.println(s);
            }
        }
    }
}
// 4.   Користувач з консолі має вводити слова доти, доки не введе “break”,
//      всі слова записуються в List.
//      Написати функцію для :
//
//  4.1 виведення користувачу всіх слова, які він ввів!
//  4.2 виведення слів, які починаються на “s”!
//  4.3 виведення слів, які мають кількість букв більше ніж 5!