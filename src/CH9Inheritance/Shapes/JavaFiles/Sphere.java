
package CH9Inheritance.Shapes.JavaFiles;

public class Sphere implements Shapes{
	private double radius;


	/**
	 * constructor
	 * @param radius
	 */

	public Sphere(double radius){
		this.radius = radius;
	}

	/**
	 * @returns the radius
	 */
	public double getRadius(){
		return radius;
	}

	/**
	 * Returns the Volume of the sphere using the formula
	 * v = 4/3 Pi r^3.
	 *
	 * @return Volume of the sphere
	 */
	public double getVolume(){
		return (4/3) * Math.PI * Math.pow(radius, 3);
	}

	/**
	 * Returns the Surface Area of the sphere using the formula
	 * SA = 4 Pi r^2.
	 *
	 * @return SA of the sphere
	 */
	public double getSA(){
		return 4 * Math.PI * Math.pow(radius, 2);
	}

}


