package geometrics;

public class Point extends Shape1 {

    private double pointX;
    private double pointY;

    public Point(double x, double y) {
        pointX = x;
        pointY = y;
    }

    public double getPointX() {
        return pointX;
    }

    public double getPointY() {
        return pointY;
    }

    // returns area of the shape and it is zero by default
    public double area() {
        return 0.0;
    }

    // returns perimeter of the shape and it is zero by default
    public double perimeter() {
        return 0.0;
    }

    // printing out the coordinates
    public void display() {
        System.out.print("{" + getPointX() + ", " + getPointY() + "}");
    }

    // printing out the name of class
    public String name() {
        return "Point";
    }
}
