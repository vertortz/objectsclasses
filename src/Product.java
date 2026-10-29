public class Product {
    public final String name;
    public final double price;
    public final int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalValue() {
        return price * quantity;
    }
}
