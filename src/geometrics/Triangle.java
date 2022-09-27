package geometrics;

public class Triangle extends Point {
    private double base;
    private double height;
    private double side1;
    private double side2;

    public Triangle(double x, double y, double base, double height, double side1, double side2){
        super(x, y);
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }

    public double getBase(){
        return base;
    }

    public double getHeight(){
        return height;
    }

    public double getSide1(){
        return side1;
    }

    public double getSide2(){
        return side2;
    }

    public double area(){
        double base = getBase();
        double height = getHeight();
        return (height * base) / 2;
    }

    public double perimeter(){
        double base = getBase();
        double side1 = getSide1();
        double side2 = getSide2();
        return side1 + base + side2;
    }

    public void display(){
        super.display();
        System.out.print("; Side= " + getSide1() + ", Base= " + getBase() + ", Side= " + getSide2() + ", Height-Base= " + getHeight());
    }

    public String name(){
        return "Triangle";
    }
}
