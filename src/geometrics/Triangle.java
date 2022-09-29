package geometrics;

public class Triangle extends Shape {
    private double base;
    private double height;
    private double side1;
    private double side2;

    public Triangle(double base, double height, double side1, double side2) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double area() {
        return (getHeight() * getBase()) / 2;
    }

    public double perimeter() {
        return getSide1() + getBase() + getSide2();
    }

    public void display() {
        System.out.print("Side1=" + getSide1() + ", Base= " + getBase() + ", Side2= " + getSide2() + ", Height-Base= "
                + getHeight());
    }

    // public String name() {
    public String getName() {
        return getClass().getSimpleName();
    }
}
