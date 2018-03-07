package lab3;

public class OverMaxException extends Exception{

    public OverMaxException() {
        super();
    }

    @Override
    public String getMessage() {
        return "Warning: Stock is over the maximum allowed limit";
    }
}
