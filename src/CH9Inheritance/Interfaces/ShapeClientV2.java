package CH9Inheritance.Interfaces;

public class ShapeClientV2 {
    public static void main(String[] args) {
        ShapeV2[] shapes = {new CircleV2(5),
                new RectangleV2(8, 11),
                new TriangleV2(3, 4, 5)};

        //shapeInfo should print the area and perimeter of all the y
        //in the array
        shapeInfo(shapes);
        int answer = shapes[0].compareTo(shapes[1]);
        if(answer > 1){
            System.out.println("Circle at index 0 has the larger area");
        }else if(answer < 1){
            System.out.println("Rectangle at index 1 has the larger area");
        }else{
            System.out.println("Both shapes have the same area");
        }
    }
    public static void shapeInfo(ShapeV2[] shapes){
        //for(int i = 0; i < shapes.length; i++){
        //dataType  var:  contain
        for(ShapeV2 s: shapes){
            System.out.println("Area: " + s.area());
            System.out.println("Perimeter: "+  s.perimeter() + "\n");
        }
    }
}
