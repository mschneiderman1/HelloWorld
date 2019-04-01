package CH9Inheritance.Shapes.JavaFiles;

public class RightSquarePyramid implements Shapes{
    private double base;
    private double height;

    /**
     * constructor
     * @param base
     * @param height
     */
    public RightSquarePyramid(double base, double height){
        this.base = base;
        this.height = height;
    }
    /**
     * @returns the base length
     */
    public double getBase() {
        return base;
    }
    /**
     * @returns the height
     */

    public double getHeight() {
        return height;
    }
    /**
     * Returns the Volume of the right square pyramid using the formula
     * v = b^2 * height/3.
     *
     * @return Volume of the right square pyramid
     */
    public double getVolume(){
        return Math.pow(base, 2) * (height / 3);
    }

    /**
     * Returns the Surface Area of the right square pyramid using the formula
     * SA = b^2 + ( 2 * base * sqrt((base^2 / 4) + height^2)) .
     *
     * @return Surface Area of the right square pyramid
     */
    public double getSA(){
        return Math.pow(base, 2) + (2 * base * Math.sqrt((Math.pow(base, 2) / 4) + Math.pow(height, 2)));
    }
}
