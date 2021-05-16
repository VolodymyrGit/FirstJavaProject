package homeWork_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Введіть скільки чисел Фібоначі Ви хочете бачити?");
            int numberOfDigits = Integer.parseInt(reader.readLine());

            MyThread mT = new MyThread(numberOfDigits);
            Thread t = new Thread(new RunnableThread(numberOfDigits));

            mT.start();
            System.out.println();
            t.start();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//    Створити клас MyThread наслідувати його від класу Thread. Перевизначити метод
//        run(), так щоб можна було вивести введену з консолі кількість чисел Фібоначі. Тобто ми вводимо з
//        консолі скільки ми хочемо бачити чисел Фібоначі і ми їх виводимо з затримкою в 1 секунду.
//        Створити потік. Створити клас RunnableThread імплементувати його від інтерфейсу Runnable.
//        Метод run() перевизначити таким чином, щоб числа Фібоначі виводились в зворотньому порядку.
//        Тобто Спершу ввели через Scanner скільки ми хочемо бачити чисел Фібоначі, потім з затримкою в
//        1 секунду вивести їх від останнього до першого значення.
//
//        Вигляд на консолі :
//        -Введіть скільки чисел Фібоначі Ви хочете бачити?
//        - 5
//        звичайний порядок : 1, 1, 2, 3, 5
//        зворотній порядок : 5, 3, 2, 1, 1