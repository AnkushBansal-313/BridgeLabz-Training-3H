import java.util.Scanner;
public class OnlineShoppingCart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean moreCustomers = true;

        while (moreCustomers) {
            System.out.println("Welcome to the Online Shopping Cart System!");

            int totalAmount = 0;
            int productPrice = 0;
            int productChoice;
            int quantity;

            int itemCount;
            do {
                System.out.print("Enter number of items you want to buy (at least 1): ");
                itemCount = scanner.nextInt();
            } while (itemCount < 1);

            for (int i = 1; i <= itemCount; i++) {
                System.out.println("\n--- Product Menu ---");
                System.out.println("1. Laptop - Rs. 45000");
                System.out.println("2. Smartphone - Rs. 20000");
                System.out.println("3. Headphones - Rs. 2000");
                System.out.println("4. Book - Rs. 500");
                System.out.println("5. Backpack - Rs. 1500");
                System.out.print("Enter your choice (1-5): ");
                productChoice = scanner.nextInt();

                System.out.print("Enter quantity: ");
                quantity = scanner.nextInt();

                switch (productChoice) {
                    case 1:
                        productPrice = 45000;
                        break;
                    case 2:
                        productPrice = 20000;
                        break;
                    case 3:
                        productPrice = 2000;
                        break;
                    case 4:
                        productPrice = 500;
                        break;
                    case 5:
                        productPrice = 1500;
                        break;
                    default:
                        System.out.println("Invalid choice. Skipping this item.");
                        productPrice = 0;
                }

                totalAmount += productPrice * quantity;
            }

            System.out.println("\nTotal Amount before discount: Rs. " + totalAmount);
            if (totalAmount > 5000) {
                double discount = totalAmount * 0.10;
                totalAmount -= discount;
                System.out.println("Discount Applied: Rs. " + discount);
            } else {
                System.out.println("No discount applied.");
            }

            System.out.println("Final Payable Amount: Rs. " + totalAmount);

            System.out.print("\nNext customer? (yes/no): ");
            String response = scanner.next();
            if (!response.equalsIgnoreCase("yes")) {
                moreCustomers = false;
            }
        }

        System.out.println("Thank you for using the Online Shopping Cart System!");
    }
}
