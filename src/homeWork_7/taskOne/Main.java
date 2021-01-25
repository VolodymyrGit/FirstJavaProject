package homeWork_7.taskOne;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static StringBuilder aBuilder = new StringBuilder();
    private static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Вводьте слова доки не набридне\nКоли захочете завершити введіть - 0");

        fiveLines();

        System.out.println(aBuilder);
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
// 2.   Зробити валідацію для емейл-адрес, зберігати лише ті, які закінчуються на @gmail.com
// 3.   Вхідним параметром є стрічка :
//      String str = "I love Java more than my friend. Java is so beautiful.";
//  3.1 перевірити чи є в стрічці слово “Java”;
//  3.2 замінити слово “Java” на “C#”;
//  3.3 замінити всі слова “Java” на “C#”;
//
// 4.   Користувач з консолі має вводити слова доти, доки не введе “break”, всі слова записуються в List.
//      Написати функцію для :
//
//  4.1 виведення користувачу всіх слова, які він ввів!
//  4.2 виведення слів, які починаються на “s”!
//  4.3 виведення слів, які мають кількість букв більше ніж 5!