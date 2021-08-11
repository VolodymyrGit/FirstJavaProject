package homeWork_14;

import java.util.function.Consumer;

public class Lambdas {

    String s = "sdfsd";

    public static void main(String[] args) {

        String[][] a = new String[5][5];

        for (int i = 0; i < a.length; i++) {
            System.out.println();
            for (int j = 0; j < a.length; j++) {
                a[i][j] = i + "" + j;
                System.out.print(a[i][j] + " ");
            }
        }

        Consumer<String> stringConsumer = (String s) -> System.out.println(s);

    }


}
