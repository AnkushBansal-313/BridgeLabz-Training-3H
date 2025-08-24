import java.util.Scanner;
public class kmToMilesInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kilometers;
        System.out.print("Enter distance in kilometers: ");
        kilometers = input.nextDouble();
        double miles = kilometers / 1.6;
        System.out.println("The total miles is " + miles + " mile for the given " + kilometers + " km");
        input.close();
    }
}