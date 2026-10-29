public class Employee {
    public final String name;
    public final String position;
    public final double salary;

    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "%s — %s, salary: %.2f".formatted(name, position, salary);
    }
}
