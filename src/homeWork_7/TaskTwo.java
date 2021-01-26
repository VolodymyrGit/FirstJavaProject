package homeWork_7;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskTwo {

    public static void main(String[] args) {
        String[] emailArray = {"skdfhf.com,",
                "sdfhskjf.gmail.com",
                "wkefjh.gmail.com",
                "wlkefkjh@gmail",
                "vkwefhiu@gmail.com",
                "reghieheir",
                "kefhie@gmail.com"};

        System.out.println(Arrays.toString(selectEmailAddressesOnly(emailArray)));
    }


    public static boolean checkIfThisIsAnEmail(String s) {
        Pattern pattern = Pattern.compile("@gmail\\.com");
        Matcher matcher = pattern.matcher(s);
        return matcher.find();
    }


    public static String[] selectEmailAddressesOnly (String[] s) {
        StringBuilder sb = new StringBuilder();
        for(String value : s) {
            if (checkIfThisIsAnEmail(value)) {
                sb.append(value)
                        .append(" ");
            }
        }
        return sb.toString().split(" ");
    }
}

//      Завдання(1, 2) робити через RegEx
// 2.   Зробити валідацію для емейл-адрес, зберігати лише ті, які закінчуються на @gmail.com