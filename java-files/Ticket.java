public class Ticket {
    private String ticketId;
    private Passenger passenger;
    private Train train;
    public double fare;
    private BookingStatus status;

    Ticket() {
        // default constructor. To be filled in later
    }

    Ticket(String ticketId, Passenger passenger, Train train, double fare, BookingStatus status) {
        this.ticketId = ticketId;
        this.passenger = passenger;
        this.train = train;
        this.fare = fare;
        this.status = status;
        this.status = status;
    }
}
