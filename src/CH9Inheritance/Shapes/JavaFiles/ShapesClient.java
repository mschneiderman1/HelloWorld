
package CH9Inheritance.Shapes.JavaFiles;

public class ShapesClient {
private static Sphere sphere = new Sphere(4);
private static Cube cube = new Cube(4, 5, 5);
private static RightSquarePyramid rightSquarePyramid = new RightSquarePyramid(2, 4);
private static Cylinder cylinder = new Cylinder(2, 3);
private static Cone cone = new Cone(2, 3, 4);
private static RectangularPrism rectangle = new RectangularPrism(2, 3, 4);



public static void main(String [] args) {
	System.out.println("Volume of sphere: " + sphere.getVolume());
	System.out.println("Surface area of sphere: " + sphere.getSA()+ "\n");
	System.out.println("Volume of cube: " + cube.getVolume());
	System.out.println("Surface area of cube: " + cube.getSA()+ "\n");
	System.out.println("Volume of rectangular prism: " + rectangle.getVolume());
	System.out.println("Surface area of rectangular prism: " + rectangle.getSA()+ "\n");
	System.out.println("Volume of cone: " + cone.getVolume());
	System.out.println("Surface area of cone: " + cone.getSA()+ "\n");
	System.out.println("Volume of right square pyramid: " + rightSquarePyramid.getVolume());
	System.out.println("Surface area of right square pyramid: " + rightSquarePyramid.getSA()+ "\n");
	System.out.println("Volume of cylinder: " + cylinder.getVolume());
	System.out.println("Surface area of cylinder: " + cylinder.getSA()+ "\n");



}
}
