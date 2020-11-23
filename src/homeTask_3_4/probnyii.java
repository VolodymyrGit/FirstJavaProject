package homeTask_3_4;

public class probnyii {

    public static void main(String[] args) {

        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 101) - 50);
            System.out.println(array[i]);
        }
    }
}
