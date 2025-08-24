package level_1;
public class NullPointerDemo {
    static void generateNullPointer() {
        String text = null;
        System.out.println(text.length());
    }

    static void handleNullPointer() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled");
        }
    }

    public static void main(String[] args) {
        try { generateNullPointer(); } catch (Exception e) { System.out.println("Exception occurred"); }
        handleNullPointer();
    }
}
