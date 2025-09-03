package JavaConstructer.Level1;
class Circle {
    double radius;

    Circle() {
        this(1.0);
    }

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }

    void display() {
        System.out.println("Circle radius: " + radius + ", Area: " + area());
    }

    public static void main(String[] args) {
        Circle defaultCircle = new Circle();
        Circle customCircle = new Circle(5.0);
        defaultCircle.display();
        customCircle.display();
    }
}
