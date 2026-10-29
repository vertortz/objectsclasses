public class Dog {
    public final String name;
    public final String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void bark() {
        System.out.println(name + " лает: гав!");
    }
}
