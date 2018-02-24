package lab3;

public class OutOfStockException extends Exception{

    public OutOfStockException() {
        super();
    }

    @Override
    public String getMessage() {
        return "Warning: Out of Stock";
    }
}
