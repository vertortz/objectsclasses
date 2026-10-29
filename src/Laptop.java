public class Laptop {
    public final String brand;
    public final int ram;
    public final double price;

    public Laptop(String brand, int ram, double price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    @Override
    public String toString() {
        return "%s, %d GB RAM, price: %.2f".formatted(brand, ram, price);
    }
}
