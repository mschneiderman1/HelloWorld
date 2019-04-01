
package CH9Inheritance.Shapes.JavaFiles;

public class Cylinder implements Shapes {
    private double radius;
    private double height;

    /**
     * constructor
     * @param radius
     * @param height
     *
     */
    public Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
    }

    /**
     * @returns the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * @returns the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * Returns the Volume of the cylinder using the formula
     * v = Pi * r^2 * height.
     *
     * @return Volume of the cylinder
     */

    public double getVolume(){
        return Math.PI * Math.pow(radius, 2) * height;
    }

    /**
     * Returns the Surface Area of the cylinder using the formula
     * SA = (2 * Pi * radius * height) + (2 * Pi * r^2)
     *
     * @return SA of the cylinder
     */
    public double getSA(){
        return (2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius, 2));
    }

}
