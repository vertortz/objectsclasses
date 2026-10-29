public class Cat {
    public final String name;
    public final int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void meow() {
        System.out.println(name + " мяукает: мяу!");
    }
}
