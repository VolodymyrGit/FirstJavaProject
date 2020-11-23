package homeTask_3_4;

import java.util.Scanner;

public class secondTask2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Бажаєте попрацювати з календарем? ( Так / Ні) ");
        String workWithTheCalendar = scan.nextLine();

        while (!workWithTheCalendar.equalsIgnoreCase("Ні")) {

            if (workWithTheCalendar.equalsIgnoreCase("Так")) {

                while (workWithTheCalendar.equalsIgnoreCase("Так")) {
                System.out.print("Введіть день тижня : ");
                String weekday = scan.nextLine();

                switch (weekday.toLowerCase()) {
                    case "понеділок":
                        System.out.println("Їхати на роботу");
                        break;
                    case "вівторок":
                    case "четвер":
                        System.out.println("Навчання Java core");
                        break;
                    case "середа":
                        System.out.println("Робити домашку");
                        break;
                    case "п'ятниця":
                        System.out.println("Доробити протези");
                        break;
                    case "субота":
                        System.out.println("Попрацювати біля дому");
                        break;
                    case "неділя":
                        System.out.println("Купити продукти");
                        break;
                    default:
                        System.out.println("Ви шось не то ввели ) Потрібно вводити день тижня. ");
                }
                System.out.println("Бажаєте продовжити роботу з календарем? ( Так / Ні)");
                workWithTheCalendar = scan.nextLine();
            }
            }
            else {
                System.out.println("Ви ввели помилкове значення. Введіть (Так / Ні)");
                workWithTheCalendar = scan.nextLine();
            }
        }
        System.out.println("Допобачення");
    }
}


//    Створити стрічкову змінну яка зберігатиме день тижня. Використовуючи конструкцію switch скласти розклад
//        на тиждень. В залежності від дня тижня у користувача на екрані відображається, те, що заплановано на
//        цей день.