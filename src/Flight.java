public class Flight {
    public final String flightNumber;
    public final String destination;
    public int availableSeats;

    public Flight(String flightNumber, String destination, int availableSeats) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.availableSeats = availableSeats;
    }

    public boolean bookSeat() {
        if (availableSeats == 0) {
            return false;
        }
        availableSeats--;
        return true;
    }
}
