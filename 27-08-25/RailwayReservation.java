import java.util.Scanner;

public class RailwayReservation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalSeats = 5;
        int bookedSeats = 0;
        int waitingList = 0;

        int trainChoice;
        int fare = 0;

        System.out.println("Select Train:");
        System.out.println("1. Rajdhani Express (Fare: 1500)");
        System.out.println("2. Shatabdi Express (Fare: 1200)");
        System.out.println("3. Passenger Train (Fare: 500)");
        System.out.print("Enter choice: ");
        trainChoice = sc.nextInt();

        switch (trainChoice) {
            case 1:
                fare = 1500;
                System.out.println("Rajdhani Express Selected.");
                break;
            case 2:
                fare = 1200;
                System.out.println("Shatabdi Express Selected.");
                break;
            case 3:
                fare = 500;
                System.out.println("Passenger Train Selected.");
                break;
            default:
                System.out.println("Invalid choice. Default Passenger Train Selected.");
                fare = 500;
        }

        do {
            System.out.print("\nEnter number of passengers to book: ");
            int passengers = sc.nextInt();

            for (int i = 1; i <= passengers; i++) {
                if (bookedSeats < totalSeats) {
                    bookedSeats++;
                    System.out.println("Seat Confirmed! Seat No: " + bookedSeats + " | Fare: " + fare);
                } else {
                    waitingList++;
                    System.out.println("No seat available! Added to Waiting List. WL No: " + waitingList);
                }
            }

            System.out.print("\nDo you want to continue booking? (yes/no): ");
            String choice = sc.next();
            if (choice.equalsIgnoreCase("no")) {
                break;
            }

        } while (bookedSeats < totalSeats);

        System.out.println("\nBooking Closed! Train is full.");
        System.out.println("Total Seats Booked: " + bookedSeats);
        System.out.println("Waiting List: " + waitingList);

        sc.close();
    }
}
