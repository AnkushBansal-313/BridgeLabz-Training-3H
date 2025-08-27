import java.util.*;

public class Multiplication6to9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] multiplicationResult = new int[4][10];
        for (int n = 6; n <= 9; n++) {
            for (int i = 1; i <= 10; i++) {
                multiplicationResult[n - 6][i - 1] = n * i;
            }
        }
        for (int n = 6; n <= 9; n++) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " * " + i + " = " + multiplicationResult[n - 6][i - 1]);
            }
            System.out.println();
        }
    }
}
