package homeWork_7;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskTwo {
    private static Pattern pattern = Pattern.compile("@gmail\\.com");

    public static void main(String[] args) {
        ArrayList<String> emailList = new ArrayList<>();
        emailList.add("skdfhf.com,");
        emailList.add("sdfhskjf.gmail.com");
        emailList.add("wkefjh.gmail.com");
        emailList.add("wlkefkjh@gmail");
        emailList.add("vkwefhiu@gmail.com");
        emailList.add("reghieheir");
        emailList.add("kefhie@gmail.com");

        System.out.println(selectEmailAddressesOnly(emailList));
    }


    public static List<String> selectEmailAddressesOnly (List<String> list) {
        List<String> trueEmailList = new ArrayList<>();
        for(String s : list) {
            Matcher matcher = pattern.matcher(s);
            if (matcher.find()) {
              trueEmailList.add(s);
            }
        }
        return trueEmailList;
    }
}
//      Завдання(1, 2) робити через RegEx
// 2.   Зробити валідацію для емейл-адрес, зберігати лише ті, які закінчуються на @gmail.com