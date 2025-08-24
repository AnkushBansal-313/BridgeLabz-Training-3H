package level_1;
import java.util.Scanner;

public class ToCharArrayCompare {
    static char[] customToCharArray(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) arr[i] = str.charAt(i);
        return arr;
    }

    static boolean compareCharArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) if (a[i] != b[i]) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] custom = customToCharArray(str);
        char[] builtin = str.toCharArray();
        System.out.println("Arrays equal: " + compareCharArrays(custom, builtin));
        
    }
}
