import java.util.Scanner;
public class intOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        System.out.print("Enter value for a: ");
        a = input.nextInt();
        System.out.print("Enter value for b: ");
        b = input.nextInt();
        System.out.print("Enter value for c: ");
        c = input.nextInt();    
        int result1 = a + b * c;    // Multiplication before addition
        int result2 = a * b + c;    // Multiplication before addition
        int result3 = c + a / b;    // Division before addition
        int result4 = a % b + c;    // Modulus before addition     
        System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);       
        input.close();
    }
}