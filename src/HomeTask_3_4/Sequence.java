package HomeTask_3_4;

public class Sequence {

    public static void main(String[] args) {

        int a = -1;
        int i = 1;

        while (i <= 55) {
            i ++;
            a += 2;
            System.out.println((i - 1) + "-й елемент послідовності що починається від одного і збільшується на 2 : " + a);
        }
    }
}

//       Створіть програму, що виводить на екран перші 55 елементів послідовності 1 3 5 7 9 11 13 15 17 ....