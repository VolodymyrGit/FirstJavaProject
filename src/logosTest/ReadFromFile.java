package logosTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadFromFile {

    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = "C:" + separator + "Users" + separator +
                "Laptop" + separator + "Desktop" + separator + "sample.txt";

        File file = new File(path);
        Scanner scan = new Scanner(file);
        int lineNumber = 0;
        String[] arrayLine = new String[40];
        while (scan.hasNextLine()) {
            arrayLine[lineNumber] = scan.nextLine();
            lineNumber++;
        }
        System.out.println(Arrays.toString(arrayLine));
        scan.close();
    }
}
