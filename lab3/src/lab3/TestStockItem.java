package lab3;

public class TestStockItem {
    public static void main(String[] args) {
        StockItem item = new StockItem("123", "Shampoo", 100, 10, 25);
        item.takeOnStock(80);
        item.issueStock(30);
        item.issueStock(20);
        System.out.printf("Amount of stock is: %d", item.getInStock());
    }
}
