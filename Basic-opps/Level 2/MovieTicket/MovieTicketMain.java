package Basic-opps.Level 2.MovieTicket;
public class MovieTicketMain {
    public static void main(String[] args) {
        MovieTicket ticket1 = new MovieTicket("Avengers", "", 0);
        ticket1.bookTicket("A12", 250);
        ticket1.displayTicket();
        
    }
}
