package geometrics;

public class Square extends Point {
    private double length;

    public Square(double x, double y, double length){
        super(x, y);
        this.length = length;
    }

    public double getLength(){
        return length;
    }

    public double area(){
        double length = getLength();
        return length * length;
    }

    public double perimeter(){
        double length = getLength();
        return 4 * length;
    }

    public void display(){
//        System.out.print("Start = ");
        super.display();
        System.out.print("; Length= " + getLength());
    }

    public String name(){
        return "Square";
    }
}
