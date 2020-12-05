package homeWork_4;

import java.util.Random;

public class Test {

    public static void main(String[] args) {
        int[] arrayNumbers = new int[40];
        anotherRandomNumber(arrayNumbers);

        int[] n = new int[] {1, 2, 3, 4};
    }


    public static void anotherRandomNumber(int[] arrayNumbers) {
        Random random = new Random();
        for (int number : arrayNumbers) {
            number = random.nextInt(arrayNumbers.length);
            System.out.println(number);
        }
    }


//    public static int randomWarrior1 (int[] arrayWar, int j) {
//        Random random = new Random();
//        int number = 0;
//        int[] arrayNumbers = new int[arrayWar.length];
//        for (int i : arrayNumbers) {
//            i = random.nextInt(arrayNumbers.length);
//            if (arrayWar[i] > 0 && !arrayWar[i].equals(j)) {
//                number = i;
//            }
//        }
//        return arrayWar[number];
//    }

//    public static void randomWarrior1 (int[] arrayWar, Warrior warrior) {
//        Random random = new Random();
//        int[] arrayNumbers = new int[arrayWar.length];
//        for (int number : arrayNumbers) {
//            number = random.nextInt(arrayNumbers.length);
//        }
//
//        while (arrayWar[i].health <= 0 && arrayWar[i].equals(arrayWar[warIndex])) {
//            random.nextInt(arrayWar.length);
//        }
//    }
}



//        int a,b;
//        a = 2;
//        b=3;
//        System.out.println(a + " " + b);
//    }
//}

//        int[][] arr = new int[5][7];
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 7; j++) {
//                arr[i][j] = Warrior.random();
//                System.out.print(" | " + arr[i][j]);
//            }
//            System.out.print(" |");
//            System.out.println();
//        }
//    }
//}
//
//        public static int random () {
//            return (int) (Math.random() * 4);
//
//        }
//    }
//}


//        int q = 1;
//        int w = 2;
//        int e = 3;
//        int[] ar = new int[] {q, w, e};
//        System.out.println(ar[0]);
//    }
//}

//    public static int[] array(int a, int b) {
//        return new array[a,b];
//   }
//}
//    private String name;
//    private int number;
//
//    public Test(String name, int number) {
//        this.name = name;
//        this.number = number;
//    }
//
//    public static void main(String[] args) {
//        Test test = new Test("qwe", 1);
//        Test test1 = new Test("asd", 2);
//    }
//
//    public static Test[] array(Test test1,Test test2) {
//
//        return ;
//    }
//}
