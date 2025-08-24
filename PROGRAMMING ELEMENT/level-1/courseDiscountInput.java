import java.util.Scanner;
public class courseDiscountInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fee, discountPercent;
        System.out.print("Enter the course fee (INR): ");
        fee = input.nextDouble();
        System.out.print("Enter the discount percentage: ");
        discountPercent = input.nextDouble();
        double discountAmount = (discountPercent / 100) * fee;
        double finalFee = fee - discountAmount;
        System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + finalFee);
        input.close();
    }
}