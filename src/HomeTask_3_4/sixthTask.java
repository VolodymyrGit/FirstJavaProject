package HomeTask_3_4;

public class sixthTask {

    public static void main(String[] args) {

        int a = (int) (Math.random() * 100);
        int b = (int) (Math.random() * 100);
        int c = (int) (Math.random() * 100);
        int d = (int) (Math.random() * 100);
        int e = (int) (Math.random() * 100);
        int f = (int) (Math.random() * 100);
        int g = (int) (Math.random() * 100);
        int h = (int) (Math.random() * 100);
        int i = (int) (Math.random() * 100);
        int j = (int) (Math.random() * 100);

        int [] arr = new int [] {a, b, c, d, e, f, g, h, i, j};

        for (int k = 0; k < 10; k ++) {
            System.out.println(arr[k]);


        }
    }
}

//    Створіть масив, наповніть його рандомними даними, знайдіть найбільше та найменше значення масиву.