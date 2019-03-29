//Triangle implements the shape interface
//triangle must implement the methods area and interface
package CH9Inheritance.Interfaces;

public class Triangle implements ShapeV1 {
    private double side1, side2, side3, s;

    public Triangle(double a, double b, double c){
        this.side1 = a;
        this.side2 = b;
        this.side3 = c;
        this.s = .5 *(a + b + c);
    }

    public double area(){
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double perimeter(){
        return side1 + side2 + side3;
    }
}
