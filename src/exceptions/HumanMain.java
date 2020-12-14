package exceptions;

import exceptions.except.IncorrectEmailException;
import exceptions.except.UnderAgeException;

import java.util.Arrays;

public class HumanMain {
    public static void main(String[] args) {
        Human[] humans = new Human[]{
                new Human("Pietia", "rstgmail.com", 16),
                new Human("Kolia", "rst@gmail.com", 25),
                new Human("Olia", "rst@gmail.com", 70),
                new Human("Vasia", "", 11),
                new Human("Vova", "rst@gmail.com", 40),
                new Human("Dima", "@gmail.com", 19),
                null };

        Human[] validHumans = new Human[humans.length];
        int count = 0;
        for (Human human : humans) {
            validateHuman(human);
            boolean valid = validateHuman(human);
            if (valid) {
                validHumans[count] = human;
                count++;
            }
        }
        Human[] humans1 = Arrays.copyOf(validHumans, count);
        System.out.println("Валідні люди : \n" + Arrays.toString(humans1));
    }

    public static boolean validateHuman (Human human) {
        boolean valid = true;
        if (human == null) {
            return false;
        }

        try {
            HumanValidator.validateHumanAge(human);
        } catch (UnderAgeException e) {
            System.out.println("Шановний " + human.getName() +
                    " ваш вік замалий" + e.getMessage());
            valid = false;
        }
        try {
            HumanValidator.validateHumanEmail(human);
        } catch (IncorrectEmailException e) {
            System.out.println("Шановний " + human.getName() +
                    " ваш Email не коректний");
            valid = false;
        }
        return valid;
    }
}
