package geometrics;

public class Parallelogram extends Point {
    private double base;
    private double side;
    private double height;

    public Parallelogram(double x, double y, double base, double side, double height){
        super(x, y);
        this.base = base;
        this.side = side;
        this.height = height;
    }

    public double getBase(){
        return base;
    }

    public double getSide(){
        return side;
    }

    public double getHeight(){
        return height;
    }

    public double area(){
        double base = getBase();
        double height = getHeight();
        return base * height;
    }

    public double perimeter(){
        double side = getSide();
        double base = getBase();
        return 2 * (side + base);
    }

    public void display(){
        super.display();
        System.out.print("; Side= " + getSide() + ", Base= " + getBase() + ", Height= " + getHeight());
    }


    public String name(){
        return "Parallelogram";
    }

}
