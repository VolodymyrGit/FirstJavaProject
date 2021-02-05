package homeWork_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskOne {
    private static Scanner scan = new Scanner(System.in);
    private static Pattern pattern = Pattern.compile("^a");


    public static void main(String[] args) {
        List<String> listWithSomeWords = new ArrayList<>();
        enterWordsUntilYouEnterABreak(listWithSomeWords);
        System.out.println("Введені слова : " + listWithSomeWords + "\n");
        System.out.println("Слова, які починаються на \"a\" :\n" +
                Arrays.toString(makeOnlyAWordsArray(listWithSomeWords)));
    }


    public static void enterWordsUntilYouEnterABreak(List<String> list) {
        System.out.println("Вводьте слова доки не набридне\n" +
                "Коли захочете завершити введіть - \"break\"");
        String s = scan.nextLine();

        while (!s.equalsIgnoreCase("break")) {
            list.add(s);
            s = scan.nextLine();
        }
    }


    public static String[] makeOnlyAWordsArray(List<String> list) {
        List<String> aWords = new ArrayList<>();
        for (String s : list) {
            Matcher matcher = pattern.matcher(s);
            if (matcher.find()) {
                aWords.add(s);
            }
        }
        return aWords.toArray(new String[0]);
    }
}
//      Завдання(1, 2) робити через RegEx
// 1.   Користувач вводить слова з консолі, в масив додавати лише ті, що починаються на “a”.