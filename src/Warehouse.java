public class Warehouse {
    public final String productName;
    public final int capacity;
    public int quantity;

    public Warehouse(String productName, int quantity, int capacity) {
        if (capacity < 0 || quantity < 0 || quantity > capacity) {
            throw new IllegalArgumentException("Quantity must be between zero and capacity.");
        }
        this.productName = productName;
        this.quantity = quantity;
        this.capacity = capacity;
    }

    public boolean add(int amount) {
        requirePositive(amount);
        if (amount > capacity - quantity) {
            return false;
        }
        quantity += amount;
        return true;
    }

    public boolean remove(int amount) {
        requirePositive(amount);
        if (amount > quantity) {
            return false;
        }
        quantity -= amount;
        return true;
    }

    private static void requirePositive(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive.");
        }
    }
}
