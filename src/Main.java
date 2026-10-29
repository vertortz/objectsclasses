import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. Student: " + new Student("Аня", 19, "ИС-101"));

        System.out.println("\n2. Cars:");
        System.out.println(new Car("Toyota", "Corolla", 2022));
        System.out.println(new Car("Volvo", "XC60", 2024));

        System.out.println("\n3. Book: " + new Book("Мастер и Маргарита", "Михаил Булгаков", 480));

        System.out.println("\n4. Phones:");
        List.of(new Phone("Apple", "iPhone 16", 999.99),
                new Phone("Samsung", "Galaxy S25", 899.99),
                new Phone("Google", "Pixel 9", 799.99)).forEach(System.out::println);

        System.out.println("\n5. Cat:");
        new Cat("Мурка", 3).meow();

        System.out.println("\n6. Dog:");
        new Dog("Бим", "Овчарка").bark();

        Rectangle rectangle = new Rectangle(4, 6);
        System.out.printf("%n7. Rectangle: area=%.1f, perimeter=%.1f%n",
                rectangle.area(), rectangle.perimeter());
        System.out.printf("8. Circle: area=%.2f%n", new Circle(3).area());
        System.out.println("\n9. Employee: " + new Employee("Иван", "Разработчик", 120000));

        Laptop laptop1 = new Laptop("Lenovo", 16, 75000);
        Laptop laptop2 = new Laptop("ASUS", 32, 110000);
        System.out.printf("%n10. Laptops: %s; %s. More expensive: %s%n",
                laptop1, laptop2, laptop1.price > laptop2.price ? laptop1.brand : laptop2.brand);

        BankAccount account1 = new BankAccount("Ольга", 1000);
        account1.deposit(500);
        account1.withdraw(200);
        System.out.println("\n11. Bank account: " + account1);
        System.out.printf("12. Product stock value: %.2f%n",
                new Product("Ручка", 25, 40).totalValue());

        Student examStudent = new Student("Пётр", 20, "ИС-102", 72);
        System.out.printf("%n13. Exam passed: %s%n", examStudent.hasPassedExam());
        Counter counter = new Counter(4);
        counter.increment();
        counter.decrement();
        System.out.printf("14. Counter: %d; after reset: ", counter.count);
        counter.reset();
        System.out.println(counter.count);

        System.out.println("\n15. Movie: " + new Movie("Интерстеллар", "фантастика", 169).info());
        Temperature temperature = new Temperature(25);
        System.out.printf("16. Temperature: %.1f C = %.1f F = %.2f K%n",
                temperature.celsius, temperature.toFahrenheit(), temperature.toKelvin());
        System.out.printf("17. Point distance from origin: %.2f%n",
                new Point(3, 4).distanceFromOrigin());

        ShoppingCart cart = new ShoppingCart("Чай", 150, 2);
        cart.changeQuantity(3);
        System.out.printf("%n18. Shopping cart total: %.2f%n", cart.total());
        System.out.println("19. Clock: " + new Clock(9, 5, 7).displayTime());

        Flight flight = new Flight("SU-100", "Москва", 2);
        System.out.printf("20. Flight booking successful: %s; seats left: %d%n",
                flight.bookSeat(), flight.availableSeats);

        System.out.println("\n21. Computers:");
        List.of(new Computer("Dell", "i5", 16, 85000),
                new Computer("Apple", "M3", 16, 180000),
                new Computer("HP", "Ryzen 7", 32, 125000))
                .forEach(computer -> System.out.println(computer.info()));

        BankAccount account2 = new BankAccount("Сергей", 300);
        account2.deposit(100);
        account1.withdraw(100);
        System.out.printf("%n22. Independent accounts: %s; %s%n", account1, account2);

        LibraryBook libraryBook = new LibraryBook("Война и мир", "Лев Толстой");
        System.out.printf("23. Borrow book: %s; borrow again: %s%n",
                libraryBook.borrow(), libraryBook.borrow());
        libraryBook.returnBook();
        System.out.println("   Returned, available: " + libraryBook.isAvailable);

        Student[] students = {
                new Student("Алиса", 19, "ИС-101", 91),
                new Student("Борис", 20, "ИС-101", 78),
                new Student("Вера", 19, "ИС-101", 95),
                new Student("Глеб", 21, "ИС-101", 83),
                new Student("Дина", 20, "ИС-101", 88)
        };
        StudentGroup.topStudent(students).ifPresent(student ->
                System.out.println("\n24. Top student: " + student.name
                        + ", average grade: " + student.averageGrade));

        MobilePhone mobile = new MobilePhone("Nokia", 80);
        mobile.turnOn();
        mobile.useBattery(25);
        System.out.printf("%n25. Mobile phone: battery=%d%%, on=%s%n",
                mobile.batteryLevel, mobile.isOn);

        Car tripCar = new Car("Лада", "Гранта", 2020, 10000, 50);
        tripCar.drive(120, 10);
        System.out.printf("26. Car after trip: mileage=%.1f km, fuel=%.1f l%n",
                tripCar.mileage, tripCar.fuel);

        Order order = new Order("A-001", "Клавиатура", 4000, 2);
        order.changeQuantity(3);
        System.out.printf("27. Order %s total: %.2f%n", order.orderNumber, order.total());

        Player attacker = new Player("Рыцарь", 100, 35);
        Player opponent = new Player("Дракон", 30, 20);
        attacker.attack(opponent);
        opponent.attack(attacker);
        opponent.takeDamage(100);
        System.out.printf("%n28. Players: %s health=%d; %s health=%d%n",
                attacker.name, attacker.health, opponent.name, opponent.health);

        Warehouse warehouse = new Warehouse("Коробки", 8, 10);
        System.out.printf("29. Warehouse: add 3=%s, remove 4=%s, stock=%d/%d%n",
                warehouse.add(3), warehouse.remove(4), warehouse.quantity, warehouse.capacity);

        Teacher teacher1 = new Teacher("Мария Иванова", "Математика", 12);
        Teacher teacher2 = new Teacher("Алексей Смирнов", "Информатика", 8);
        Course course1 = new Course("Алгебра", teacher1, 48);
        Course course2 = new Course("Основы Java", teacher2, 64);
        course1.enrollStudent();
        course1.enrollStudent();
        course2.enrollStudent();
        System.out.println("\n30. University management system:");
        for (Student student : students) {
            System.out.println("Student: " + student);
        }
        System.out.println("Teacher: " + teacher1.info());
        System.out.println("Teacher: " + teacher2.info());
        System.out.println("Course: " + course1.info());
        System.out.println("Course: " + course2.info());
    }
}
