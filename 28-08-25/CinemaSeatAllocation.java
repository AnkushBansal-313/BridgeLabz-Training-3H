import java.util.Scanner;

public class CinemaSeatAllocation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = 5;
        int cols = 10;
        boolean[][] seats = new boolean[rows][cols];

        while (true) {
            System.out.println("\nCinema Seat Layout (O=Empty, X=Booked):");
            for (int i = 0; i < rows; i++) {
                System.out.print("Row " + (i + 1) + ": ");
                for (int j = 0; j < cols; j++) {
                    System.out.print(seats[i][j] ? "X " : "O ");
                }
                System.out.println();
            }

            System.out.print("\nEnter number of people in family (0 to exit): ");
            int n = sc.nextInt();
            if (n == 0) break;

            boolean booked = false;

            for (int i = 0; i < rows; i++) {
                int consecutive = 0;
                for (int j = 0; j < cols; j++) {
                    if (!seats[i][j]) consecutive++;
                    else consecutive = 0;

                    if (consecutive == n) {
                        for (int k = j - n + 1; k <= j; k++) {
                            seats[i][k] = true;
                        }
                        System.out.println("Booked " + n + " seats in row " + (i + 1) + ", seats " + (j - n + 2) + " to " + (j + 1));
                        booked = true;
                        break;
                    }
                }
                if (booked) break;
            }

            if (!booked) {
                System.out.println("Not available for " + n + " consecutive seats.");
            }
        }
    }
}
