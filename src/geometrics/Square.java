package geometrics;

public class Square extends Shape {
    private double length;

    public Square(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public double area() {
        return getLength() * getLength();
    }

    public double perimeter() {
        return 4 * getLength();
    }

    public void display() {
        System.out.print("Length= " + getLength());
    }

    public String name() {
        return "Square";
    }
}
