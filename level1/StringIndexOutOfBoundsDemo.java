package level_1;
import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {
    static void generateException(String str) {
        System.out.println(str.charAt(str.length() + 1));
    }

    static void handleException(String str) {
        try {
            System.out.println(str.charAt(str.length() + 1));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        try { generateException(str); } catch (Exception e) { System.out.println("Exception occurred"); }
        handleException(str);
        sc.close();
    }
}
