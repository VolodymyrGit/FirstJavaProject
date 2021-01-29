package homeWork_7;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskOne {
    private static StringBuilder aBuilder = new StringBuilder();
    private static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {

        System.out.println("Вводьте слова доки не набридне\nКоли захочете завершити введіть - 0");

        fiveLines();

        String[] allWords = aBuilder.toString().split(" ");
        System.out.println("Введені слова : " + Arrays.toString(allWords) + "\n");
        System.out.println("Слова, які починаються на \"a\"");
        System.out.println(Arrays.toString(onlyAWordsArray(allWords)));
    }


    public static void fiveLines() {
        do {
            for (int i = 0; i < 5; i++) {
                aBuilder.append(scan.nextLine())
                        .append(" ");
                if (i == 4) {
                    System.out.println("Ви ввели п'ять рядків.\n" +
                            "Бажаєте продовжити? (так - 1/ні - 0)");
                }
            }
        } while (doYouWantToContinue());
    }


    public static String[] onlyAWordsArray(String[] s) {
        StringBuilder onlyAWords = new StringBuilder();
        for (String value : s) {
            if (ifTheWordIsFits(value)) {
                onlyAWords.append(value)
                        .append(" ");
            }
        }
        return onlyAWords.toString().split(" ");
    }


    public static boolean ifTheWordIsFits(String s) {
        Pattern p = Pattern.compile("^a");
        Matcher m = p.matcher(s);
        return m.find();
    }


    public static boolean doYouWantToContinue() {
        String s = scan.nextLine();
        System.out.println();
        boolean answer = true;
        while (!s.equals("1") && !s.equals("0")) {
            System.out.println("Ви ввели помилкове значення.\nБажаєте продовжити? (1/0)");
            s = scan.nextLine();
            System.out.println();
        }
        if (s.equals("0")) {
            answer = false;
        }
        return answer;
    }
}
//      Завдання(1, 2) робити через RegEx
// 1.   Користувач вводить слова з консолі, в масив додавати лише ті, що починаються на “a”.