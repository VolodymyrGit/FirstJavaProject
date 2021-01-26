package homeWork_7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskThree {

    public static void main(String[] args) {
        String str = "I love Java more than my friend. Java is so beautiful.";

        System.out.println("Перевірка, чи є в стрічці слово \"Java\" :\n"
                + checkOnTheWordJava(str) + "\n");

        System.out.println("замінюємо слово \"Java\" на \"C#\"\n"
                + str.replaceFirst("Java","C#") + "\n");

        System.out.println("Замінюємо всі слова \"Java\" на \"C#\" :\n"
                + str.replaceAll("Java", "C#") + "\n");
    }


    public static boolean checkOnTheWordJava (String s) {
        Pattern pattern = Pattern.compile("Java");
        Matcher matcher = pattern.matcher(s);
        return matcher.find();
    }
}

// 3.   Вхідним параметром є стрічка :
//      String str = "I love Java more than my friend. Java is so beautiful.";
//  3.1 перевірити чи є в стрічці слово “Java”;
//  3.2 замінити слово “Java” на “C#”;
//  3.3 замінити всі слова “Java” на “C#”;