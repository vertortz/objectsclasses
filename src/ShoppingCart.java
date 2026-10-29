public class ShoppingCart {
    public final String productName;
    public final double price;
    public int quantity;

    public ShoppingCart(String productName, double price, int quantity) {
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
