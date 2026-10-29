public class Movie {
    public final String title;
    public final String genre;
    public final int duration;

    public Movie(String title, String genre, int duration) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
    }

    public String info() {
        return "%s (%s), %d min".formatted(title, genre, duration);
    }
}
