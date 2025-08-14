import java.util.*;
public class Area_circle {
   public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter radius of the circle: ");
            double radius = sc.nextDouble();
            double area = 3.1415 * radius * radius;
            System.out.println("Area of the circle: " + area);
}
}