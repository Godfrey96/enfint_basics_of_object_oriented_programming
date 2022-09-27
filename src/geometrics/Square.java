package geometrics;

public class Square extends Point {
    private double length;

    public Square(double x, double y, double length) {
        super(x, y);
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
        super.display();
        System.out.print("; Length= " + getLength());
    }

    public String name() {
        return "Square";
    }
}
