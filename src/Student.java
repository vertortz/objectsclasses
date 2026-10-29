public class Student {
    public final String name;
    public final int age;
    public final String group;
    public final double averageGrade;

    public Student(String name, int age, String group) {
        this(name, age, group, 0);
    }

    public Student(String name, int age, String group, double averageGrade) {
        this.name = name;
        this.age = age;
        this.group = group;
        this.averageGrade = averageGrade;
    }

    public boolean hasPassedExam() {
        return averageGrade >= 50;
    }

    @Override
    public String toString() {
        return "Student{name='%s', age=%d, group='%s', averageGrade=%.1f}"
                .formatted(name, age, group, averageGrade);
    }
}
