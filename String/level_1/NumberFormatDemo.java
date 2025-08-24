package level_1;
import java.util.Scanner;

public class NumberFormatDemo {
    static void generateException(String str) {
        int num = Integer.parseInt(str);
        System.out.println(num);
    }

    static void handleException(String str) {
        try {
            int num = Integer.parseInt(str);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        try { generateException(str); } catch (Exception e) { System.out.println("Exception occurred"); }
        handleException(str);
     
    }
}
