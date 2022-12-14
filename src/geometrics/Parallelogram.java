package geometrics;

public class Parallelogram extends Shape {
    private double base;
    private double side;
    private double height;

    public Parallelogram(double base, double side, double height) {
        this.base = base;
        this.side = side;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getSide() {
        return side;
    }

    public double getHeight() {
        return height;
    }

    public double area() {
        return getBase() * getHeight();
    }

    public double perimeter() {
        return 2 * (getSide() + getBase());
    }

    public void display() {
        System.out.print("Side= " + getSide() + ", Base= " + getBase() + ", Height= " + getHeight());
    }

    // public String name() {
    public String getName() {
        return getClass().getSimpleName();
    }

}
