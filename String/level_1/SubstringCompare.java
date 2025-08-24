package level_1;
import java.util.Scanner;

public class SubstringCompare {
    static String customSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) result += str.charAt(i);
        return result;
    }

    static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        for (int i = 0; i < str1.length(); i++) if (str1.charAt(i) != str2.charAt(i)) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();
        String custom = customSubstring(str, start, end);
        String builtin = str.substring(start, end);
        System.out.println("Custom substring: " + custom);
        System.out.println("Built-in substring: " + builtin);
        System.out.println("Comparison: " + compareStrings(custom, builtin));
       
    }
}
