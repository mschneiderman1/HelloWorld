//rectangle implements the shape interface
//rectangle must implement the methods area and interface
package CH9Inheritance.Interfaces;

public class Rectangle implements ShapeV1{
    private double length;
    private double height;

    public Rectangle(double length, double height){
        this.length = length;
        this.height = height;
    }

    public double area(){
        return length * height;
    }

    public double perimeter(){
        return 2 * length + 2 * height;
    }
}
