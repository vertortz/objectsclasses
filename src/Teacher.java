public class Teacher {
    public final String name;
    public final String subject;
    public final int experienceYears;

    public Teacher(String name, String subject, int experienceYears) {
        this.name = name;
        this.subject = subject;
        this.experienceYears = experienceYears;
    }

    public String info() {
        return "%s — %s, teaching experience: %d years"
                .formatted(name, subject, experienceYears);
    }
}
