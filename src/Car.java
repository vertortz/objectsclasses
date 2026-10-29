public class Car {
    public final String brand;
    public final String model;
    public final int year;
    public double mileage;
    public double fuel;

    public Car(String brand, String model, int year) {
        this(brand, model, year, 0, 0);
    }

    public Car(String brand, String model, int year, double mileage, double fuel) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.fuel = fuel;
    }

    public boolean drive(double distance, double fuelUsed) {
        if (distance < 0 || fuelUsed < 0) {
            throw new IllegalArgumentException("Distance and fuel used must be non-negative.");
        }
        if (fuelUsed > fuel) {
            return false;
        }
        mileage += distance;
        fuel -= fuelUsed;
        return true;
    }

    @Override
    public String toString() {
        return "%d %s %s (mileage: %.1f km, fuel: %.1f l)"
                .formatted(year, brand, model, mileage, fuel);
    }
}
