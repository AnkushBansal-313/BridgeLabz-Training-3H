import java.util.Scanner;
public class doubleOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);     
        double a, b, c;
        System.out.print("Enter value for a: ");
        a = input.nextDouble();
        System.out.print("Enter value for b: ");
        b = input.nextDouble();
        System.out.print("Enter value for c: ");
        c = input.nextDouble();      
        double result1 = a + b * c;   // Multiplication before addition
        double result2 = a * b + c;   // Multiplication before addition
        double result3 = c + a / b;   // Division before addition
        double result4 = a % b + c;   // Modulus before addition      
        System.out.println("The results of Double Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);        
        input.close();
    }
}