public class Clock {
    public final int hours;
    public final int minutes;
    public final int seconds;

    public Clock(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public String displayTime() {
        return "%02d:%02d:%02d".formatted(hours, minutes, seconds);
    }
}
