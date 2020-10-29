package HomeTask_3_4;

public class probnyii {

    public static void main(String[] args) {

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 31) - 15);
            System.out.println(array[i]);


        }
    }
}
