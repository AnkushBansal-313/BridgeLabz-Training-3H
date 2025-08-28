import java.util.Scanner;

public class CollinearPoints {
    static boolean checkCollinearSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        int slopeAB_num = (y2 - y1) * (x3 - x2);
        int slopeBC_num = (y3 - y2) * (x2 - x1);
        return slopeAB_num == slopeBC_num;
    }

    static boolean checkCollinearArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        int area = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt(), y1 = sc.nextInt();
        int x2 = sc.nextInt(), y2 = sc.nextInt();
        int x3 = sc.nextInt(), y3 = sc.nextInt();
        if (checkCollinearSlope(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Collinear by Slope Method");
        } else {
            System.out.println("Not Collinear by Slope Method");
        }
        if (checkCollinearArea(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Collinear by Area Method");
        } else {
            System.out.println("Not Collinear by Area Method");
        }
    }
}
