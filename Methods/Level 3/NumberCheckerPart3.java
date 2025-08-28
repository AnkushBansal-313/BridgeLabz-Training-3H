import java.util.Arrays;

public class NumberCheckerPart3 {
    public static int[] getDigits(int num) {
        String s = String.valueOf(num);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) digits[i] = s.charAt(i) - '0';
        return digits;
    }

    public static int[] reverseDigitsArray(int num) {
        int[] digits = getDigits(num);
        int[] rev = new int[digits.length];
        for (int i = 0; i < digits.length; i++) rev[i] = digits[digits.length - 1 - i];
        return rev;
    }

    public static boolean compareArrays(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    public static boolean isPalindrome(int num) {
        return compareArrays(getDigits(num), reverseDigitsArray(num));
    }

    public static boolean isDuckNumber(int num) {
        int[] digits = getDigits(num);
        for (int d : digits) if (d == 0) return true;
        return false;
    }
}
