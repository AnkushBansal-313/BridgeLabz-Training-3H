package level_1;
reimport java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {
    static void generateException(String[] arr) {
        System.out.println(arr[arr.length]);
    }

    static void handleException(String[] arr) {
        try {
            System.out.println(arr[arr.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) arr[i] = sc.next();
        try { generateException(arr); } catch (Exception e) { System.out.println("Exception occurred"); }
        handleException(arr);
    }
}
