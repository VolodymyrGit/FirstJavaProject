package exceptions.except;

public class UnderAgeException extends  Exception {
    public UnderAgeException(int age) {
        super("Приходьте через - " + (18 - age));
    }
}
