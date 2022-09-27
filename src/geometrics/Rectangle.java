package geometrics;

public class Rectangle extends Point {
    private double width;
    private double height;

    public Rectangle(double x, double y, double width, double height){
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    public double area(){
        double width = getWidth();
        double height = getHeight();
        return width * height;
    }

    public double perimeter(){
        double width = getWidth();
        double height = getHeight();
        return 2 * (width + height);
    }

    public void display(){
        super.display();
        System.out.print("; Width= " + getWidth() + ", Height= " + getHeight());
    }

    public String name(){
        return "Rectangle";
    }
}
