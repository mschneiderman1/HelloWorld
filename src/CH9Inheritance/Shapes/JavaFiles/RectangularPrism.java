package CH9Inheritance.Shapes.JavaFiles;

public class RectangularPrism implements Shapes{
    private double length;
    private double width;
    private double height;

    public RectangularPrism(double length, double width, double height){
        this.length= length;
        this.width = width;
        this.height=height;
    }
    public double getVolume(){
        return length*width*height;
    }
    public double getSA(){
        return 2*width*length + 2*length*height + 2*height*width;
    }
}


