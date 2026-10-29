public class Course {
    public final String title;
    public final Teacher teacher;
    public final int durationHours;
    public int enrolledStudents;

    public Course(String title, Teacher teacher, int durationHours) {
        this.title = title;
        this.teacher = teacher;
        this.durationHours = durationHours;
    }

    public void enrollStudent() {
        enrolledStudents++;
    }

    public String info() {
        return "%s — teacher: %s, %d hours, enrolled: %d"
                .formatted(title, teacher.name, durationHours, enrolledStudents);
    }
}
