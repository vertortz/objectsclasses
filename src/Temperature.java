public class Temperature {
    public final double celsius;

    public Temperature(double celsius) {
        this.celsius = celsius;
    }

    public double toFahrenheit() {
        return celsius * 9 / 5 + 32;
    }

    public double toKelvin() {
        return celsius + 273.15;
    }
}
