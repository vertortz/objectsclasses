public class Order {
    public final String orderNumber;
    public final String productName;
    public final double price;
    public int quantity;

    public Order(String orderNumber, String productName, double price, int quantity) {
        this.orderNumber = orderNumber;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public double total() {
        return price * quantity;
    }

    public void changeQuantity(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative.");
        }
        this.quantity = quantity;
    }
}
