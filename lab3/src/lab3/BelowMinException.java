package lab3;

public class BelowMinException extends Exception {

    public BelowMinException() {
        super();
    }

    @Override
    public String getMessage() {
        return "Warning: Stock below acceptable minimum level";
    }
}
