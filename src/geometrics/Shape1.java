package geometrics;

abstract public class Shape1 {
    public double area(){
        return 0.0;
    }

    public double perimeter(){
        return 0.0;
    }

    // abstract method for displaying out the parameters/attributes
    public abstract void display();

    // abstract method for returning the names of the shapes
    public abstract String name();
}
