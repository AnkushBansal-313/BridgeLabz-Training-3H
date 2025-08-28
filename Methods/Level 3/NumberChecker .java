import java.util.Arrays;

public class NumberChecker {
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    public static int[] getDigits(int num) {
        String s = String.valueOf(num);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) digits[i] = s.charAt(i) - '0';
        return digits;
    }

    public static boolean isDuckNumber(int num) {
        int[] digits = getDigits(num);
        for (int d : digits) if (d == 0) return true;
        return false;
    }

    public static boolean isArmstrong(int num) {
        int[] digits = getDigits(num);
        int n = digits.length, sum = 0;
        for (int d : digits) sum += Math.pow(d, n);
        return sum == num;
    }

    public static int[] largestAndSecondLargest(int num) {
        int[] digits = getDigits(num);
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > first) {
                second = first;
                first = d;
            } else if (d > second) second = d;
        }
        return new int[]{first, second};
    }

    public static int[] smallestAndSecondSmallest(int num) {
        int[] digits = getDigits(num);
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < first) {
                second = first;
                first = d;
            } else if (d < second) second = d;
        }
        return new int[]{first, second};
    }
}
