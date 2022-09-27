package geometrics;

public class Rectangle extends Point {
    private double width;
    private double height;

    public Rectangle(double x, double y, double width, double height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double area() {
        return getWidth() * getHeight();
    }

    public double perimeter() {
        return 2 * (getWidth() + getHeight());
    }

    public void display() {
        super.display();
        System.out.print("; Width= " + getWidth() + ", Height= " + getHeight());
    }

    public String name() {
        return "Rectangle";
    }
}
