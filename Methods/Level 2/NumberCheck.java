import java.util.Scanner;

public class NumberCheck {

    public static boolean isPositive(int n) { return n >= 0; }
    public static boolean isEven(int n) { return n % 2 == 0; }
    public static int compare(int a, int b) {
        if (a > b) return 1;
        else if (a == b) return 0;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
            if (isPositive(arr[i])) {
                System.out.print("Positive and ");
                if (isEven(arr[i])) System.out.println("Even");
                else System.out.println("Odd");
            } else {
                System.out.println("Negative");
            }
        }

        int cmp = compare(arr[0], arr[4]);
        if (cmp == 0) System.out.println("First and last numbers are Equal");
        else if (cmp > 0) System.out.println("First number is Greater");
        else System.out.println("First number is Smaller");
    }
}
