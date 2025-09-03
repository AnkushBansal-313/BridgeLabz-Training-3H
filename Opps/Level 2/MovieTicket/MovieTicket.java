package Basic-opps.Level 2.MovieTicket;
public class MovieTicket {
    String movieName;
    String seatNumber;
    double price;
    MovieTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }
    void bookTicket(String seat, double cost) {
        this.seatNumber = seat;
        this.price = cost;
        System.out.println("Ticket booked successfully!");
    }
    void displayTicket() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
        
    }
}