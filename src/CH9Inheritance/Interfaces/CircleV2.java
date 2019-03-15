//circle implements the shape interface
// circle must implement the methods area and interface
package CH9Inheritance.Interfaces;

public class CircleV2 extends ShapeV2 {
    private double radius;

    public CircleV2(double radius){
        this.radius = radius;
    }

    public double area(){
        return Math.PI * Math.pow(radius, 2);
    }

    public double perimeter(){
        return 2 * Math.PI * radius;
    }
}
