package geometrics;

public class Line extends Point {

     public Line(double x, double y){
         super(x, y);
     }

    // printing out the coordinates
    public void display(){
        System.out.print("{"  + getPointX() + ", " + getPointY() + "}");
    }

    // printing out the name of class
    public String name(){
        return "Line";
    }
}
