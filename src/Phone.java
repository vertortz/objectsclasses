public class Phone {
    public final String brand;
    public final String model;
    public final double price;

    public Phone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "%s %s — %.2f".formatted(brand, model, price);
    }
}
