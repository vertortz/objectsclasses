public class MobilePhone {
    public final String brand;
    public int batteryLevel;
    public boolean isOn;

    public MobilePhone(String brand, int batteryLevel) {
        if (batteryLevel < 0 || batteryLevel > 100) {
            throw new IllegalArgumentException("Battery level must be between 0 and 100.");
        }
        this.brand = brand;
        this.batteryLevel = batteryLevel;
    }

    public boolean turnOn() {
        if (batteryLevel == 0) {
            return false;
        }
        isOn = true;
        return true;
    }

    public void turnOff() {
        isOn = false;
    }

    public void useBattery(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Battery usage cannot be negative.");
        }
        batteryLevel = Math.max(0, batteryLevel - amount);
        if (batteryLevel == 0) {
            isOn = false;
        }
    }
}
