package geometrics;

public class Circle extends Point {
    private double radius;

    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double area() {
        return Math.PI * getRadius() * getRadius();
    }

    public double perimeter() {
        return 2 * Math.PI * getRadius();
    }

    public void display() {
        super.display();
        System.out.print("; Radius= " + getRadius());
    }

    public String name() {
        return "Circle";
    }
}
