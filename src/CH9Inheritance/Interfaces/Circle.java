//circle implements the shape interface
// circle must implement the methods area and interface
package CH9Inheritance.Interfaces;

public class Circle implements ShapeV1 {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double area(){
        return Math.PI * Math.pow(radius, 2);
    }

    public double perimeter(){
        return 2 * Math.PI * radius;
    }
}
