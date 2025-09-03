package Circle;
public class Circle {
    double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double area() {
        return Math.PI * radius * radius;
    }
    public void displayArea() { 
        System.out.println("Area of Circle: " + area());
    }
}
