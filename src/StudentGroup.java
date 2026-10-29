import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class StudentGroup {
    public static Optional<Student> topStudent(Student... students) {
        return Arrays.stream(students).max(Comparator.comparingDouble(student -> student.averageGrade));
    }
}
