package home_Work_5;

import java.util.Scanner;

public class Test {

    public void print () {
        System.out.println("1");
    }

    void print1 () {
        System.out.println("2");
    }

    public static void main(String[] args) {
        Test test = new Test();
//        test.print();
//        int i = 10;
//        int j = 4;
//        int k = i % j;
//
//        System.out.println(i + " % " + j + " остача = " + k);

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        for (Months m : Months.values()) {
//            while (!s.equalsIgnoreCase(m.name())) {
                while (!s.equalsIgnoreCase("NO")) {
                    System.out.println("You entered an incorrect value.\n" +
                            "Would you like to continue work with the months ( YES/NO )");
                    s = scanner.nextLine();
                }
                System.out.println("Enter the name of the month on English ");
//            }
        }

    }

    public static class Builder {


    }
}
