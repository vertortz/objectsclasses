public class Computer {
    public final String brand;
    public final String processor;
    public final int ram;
    public final double price;

    public Computer(String brand, String processor, int ram, double price) {
        this.brand = brand;
        this.processor = processor;
        this.ram = ram;
        this.price = price;
    }

    public String info() {
        return "%s, %s, %d GB RAM, %.2f".formatted(brand, processor, ram, price);
    }
}
