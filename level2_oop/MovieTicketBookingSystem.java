class MovieTicket {

    // Attributes
    private String movieName;
    private String seatNumber;
    private double price;
    private boolean isBooked;

    // Constructor
    public MovieTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        this.isBooked = false; // Initially, the ticket is not booked
    }

    // Method to book a ticket
    public void bookTicket() {
        if (!isBooked) {
            isBooked = true;
            System.out.println("Ticket booked successfully!");
        } else {
            System.out.println("Ticket is already booked!");
        }
    }

    // Method to display ticket details
    public void displayTicketDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
        System.out.println("Booking Status: " + (isBooked ? "Booked" : "Available"));
    }
}

public class MovieTicketBookingSystem {
    public static void main(String[] args) {
        // Create MovieTicket object
        MovieTicket ticket = new MovieTicket("Inception", "A12", 300.0);

        // Display ticket details
        ticket.displayTicketDetails();

        // Book the ticket
        ticket.bookTicket();

        // Display ticket details again to see the updated status
        ticket.displayTicketDetails();
    }
}
