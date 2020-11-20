package HomeWork_2;

public class TaskThree {

    public static void main(String[] args) {
        int[][] arr = new int[5][7];
        for (int i = 0; i < 5; i ++) {
            for (int j = 0; j < 7; j ++) {
               arr[i][j] = random();
                System.out.print(" | " + arr[i][j]);
            }
            System.out.print(" |");
            System.out.println();
        }
    }

    public static int random () {
        return ((int)(Math.random() * 78) - 2);
    }
}
//  Створити двовимірний масив, який буде мати 5 рядків і 7 стовпців.
//  І заповнити його рандомними(Math.random()) цифрами з проміжку [-2, 75]