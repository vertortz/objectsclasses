public class BankAccount {
    public final String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }
        this.owner = owner;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        requirePositive(amount);
        balance += amount;
    }

    public boolean withdraw(double amount) {
        requirePositive(amount);
        if (amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }

    private static void requirePositive(double amount) {
        if (!Double.isFinite(amount) || amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive and finite.");
        }
    }

    @Override
    public String toString() {
        return "%s: balance %.2f".formatted(owner, balance);
    }
}
