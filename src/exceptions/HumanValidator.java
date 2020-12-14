package exceptions;

import exceptions.except.IncorrectEmailException;
import exceptions.except.UnderAgeException;

public class HumanValidator {

    public static void validateHumanAge(Human human) throws UnderAgeException {
        if (human.getAge() < 18) {
            throw new UnderAgeException(human.getAge());
        }
    }

    public static void validateHumanEmail(Human human) throws IncorrectEmailException {
        if (!human.getEmail().contains("@")) {
            throw new IncorrectEmailException();
        }
    }

}
