package geometrics;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
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
        System.out.print("Radius= " + getRadius());
    }

    public String name() {
        return "Circle";
    }
}
