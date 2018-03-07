package lab3;

public class StockItem {
    private String id, description;
    private int maximum, minimum, inStock;

    StockItem(String id, String description, int maximum, int minimum, int inStock) {
        this.id = id;
        this.description = description;
        this.maximum = maximum;
        this.minimum = minimum;
        this.inStock = inStock;
    }

    public int getInStock() {
        return inStock;
    }

    public void takeOnStock(int quantity) {
        if (inStock + quantity < maximum) {
            inStock += quantity;
        } else {
            try {
                throw new OverMaxException();
            } catch (OverMaxException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public void issueStock(int stock) {
        if (inStock - stock > minimum) {
            inStock -= stock;
        } else if (inStock - stock < minimum && inStock - stock > 0) {
            inStock -= stock;
            try {
                throw new BelowMinException();
            } catch (BelowMinException e) {
                System.err.println(e.getMessage());
            }
        } else if (inStock - stock <= 0) {
            try {
                throw new OutOfStockException();
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }

    }
}