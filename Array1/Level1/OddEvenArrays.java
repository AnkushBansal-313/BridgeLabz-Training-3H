import java.util.*;

public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println("Error: Not a natural number");
            return;
        }
        int[] evens = new int[number / 2 + 1];
        int[] odds = new int[number / 2 + 1];
        int e = 0, o = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) evens[e++] = i;
            else odds[o++] = i;
        }
        System.out.print("Even numbers: ");
        for (int i = 0; i < e; i++) System.out.print(evens[i] + " ");
        System.out.println();
        System.out.print("Odd numbers: ");
        for (int i = 0; i < o; i++) System.out.print(odds[i] + " ");
        System.out.println();
    }
}
