public class Player {
    public final String name;
    public int health;
    public final int damage;

    public Player(String name, int health, int damage) {
        if (health < 0 || damage < 0) {
            throw new IllegalArgumentException("Health and damage cannot be negative.");
        }
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public void attack(Player target) {
        target.takeDamage(damage);
    }

    public void takeDamage(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Damage cannot be negative.");
        }
        health = Math.max(0, health - amount);
    }
}
