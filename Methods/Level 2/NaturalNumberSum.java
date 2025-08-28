import java.util.Scanner;

public class NaturalNumberSum {

    public static int sumRecursion(int n) {
        if (n == 0) return 0;
        return n + sumRecursion(n - 1);
    }

    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number!");
            return;
        }

        int recSum = sumRecursion(n);
        int formulaSum = sumFormula(n);

        System.out.println("Sum using recursion: " + recSum);
        System.out.println("Sum using formula: " + formulaSum);

        if (recSum == formulaSum) {
            System.out.println("Both computations are correct!");
        }
    }
}
