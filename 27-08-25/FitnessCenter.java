import java.util.Scanner;

public class FitnessCenter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fee = 0;
        boolean open = true;

        do {
            System.out.println("\nSelect Membership Type:");
            System.out.println("1. Monthly (₹1000)");
            System.out.println("2. Quarterly (₹2500)");
            System.out.println("3. Yearly (₹9000)");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: fee = 1000; break;
                case 2: fee = 2500; break;
                case 3: fee = 9000; break;
                default: 
                    System.out.println("Invalid choice, default Monthly selected.");
                    fee = 1000;
            }

            System.out.print("Enter number of members to register: ");
            int members = sc.nextInt();

            for (int i = 1; i <= members; i++) {
                System.out.print("Enter member type (normal/student/senior): ");
                String type = sc.next();

                int finalFee = fee;
                if (type.equalsIgnoreCase("student")) {
                    finalFee = (int)(fee * 0.8);
                } else if (type.equalsIgnoreCase("senior")) {
                    finalFee = (int)(fee * 0.7);
                }

                System.out.println("Member " + i + " registered. Fee: ₹" + finalFee);
            }

            System.out.print("\nDo you want to continue registering? (yes/no): ");
            String ans = sc.next();
            if (ans.equalsIgnoreCase("no")) {
                open = false;
            }

        } while (open);

        System.out.println("\nCenter Closed. Thank you!");
        sc.close();
    }
}
