package HomeTask_3_4;

import java.util.Scanner;

public class SecondTask {

    public static void main(String[] args) {

        System.out.print("Введіть день тижня : ");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        switch (str) {
            case "Понеділок" :
                System.out.println("Їхати на роботу");
                break;
            case "Вівторок" :
            case "Четвер" :
                System.out.println("Навчання Java core");
                break;
            case "Середа" :
                System.out.println("Робити домашку");
                break;
            case "П'ятниця" :
                System.out.println("Доробити протези");
                break;
            case "Субота" :
                System.out.println("Попрацювати біля дому");
                break;
            case "Неділя" :
                System.out.println("Купити продукти");
                break;
            default:
                System.out.println("Ви шось не то ввели ) Введіть день тижня : ");
        }
    }
}


//    Створити стрічкову змінну яка зберігатиме день тижня. Використовуючи конструкцію switch скласти розклад
//        на тиждень. В залежності від дня тижня у користувача на екрані відображається, те, що заплановано на
//        цей день.