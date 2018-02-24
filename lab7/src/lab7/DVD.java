package lab7;

public class DVD {

    private String title, category, year;
    private final int maxStock = 5;
    private int stock, checkedOut;
    private int ratingCount = 0;
    private int ratingTotal = 0;

    DVD(String title, String category, String year, int stock, int checkedOut) {
        this.title = title;
        this.category = category;
        this.year = year;
        this.stock = stock;
        this.checkedOut = checkedOut;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getYear() {
        return year;
    }

    public int getStock() {
        return stock;
    }

    public int getCheckedOut() {
        return checkedOut;
    }

    public double getRatingTotal() {
        return ratingTotal;
    }

    public int getRatingCount() {
        return ratingCount;
    }

    public void rateDvd(double rating) {
        if (rating >= 0 && rating <= 5) {
            this.ratingTotal += rating;
            ratingCount++;
        } else {
            System.err.println("The number is out of bounds.");
        }
    }

    public double getAverageRating() {
        if (ratingTotal == 0 || ratingCount == 0) {
            return 0;
        } else {
            return ratingTotal / ratingCount;
        }
    }

    public void checkOut() throws OutOfStockException{
        if (stock <= 0 ) {
            throw new OutOfStockException();
        }
        checkedOut++;
        stock--;
    }

    public boolean returnDVD() {
        if (stock >= maxStock) {
            System.out.println("DVD does not belong in the store.");
            return false;
        }
        checkedOut--;
        stock++;
        return true;
    }

    @Override
    public String toString() {
        return String.format("Title: %-22s Number Available: %d" , title, stock);
    }

    static class OutOfStockException extends Exception {
        private OutOfStockException() {
            super("DVD out of stock.");
        }
    }
}