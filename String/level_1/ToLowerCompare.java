package level_1;
import java.util.Scanner;

public class ToLowerCompare {
    static String toLowerCustom(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') result += (char) (c + 32);
            else result += c;
        }
        return result;
    }

    static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        for (int i = 0; i < str1.length(); i++) if (str1.charAt(i) != str2.charAt(i)) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String custom = toLowerCustom(str);
        String builtin = str.toLowerCase();
        System.out.println("Comparison: " + compareStrings(custom, builtin));
    }
}
