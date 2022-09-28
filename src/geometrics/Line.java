package geometrics;

public class Line extends Shape {

    private double line1;
    private double line2;

    public Line(double line1, double line2) {
        this.line1 = line1;
        this.line2 = line2;
    }

    public double getLine1() {
        return line1;
    }

    public double getLine2() {
        return line2;
    }

    public double area() {
        return 0;
    }

    public double perimeter() {
        return 0;
    }

    // printing out the coordinates
    public void display() {
        System.out.print("Point1= " + getLine1() + ", Point2= " + getLine2());
    }

    // printing out the name of class
    public String name() {
        return "Line";
    }
}
