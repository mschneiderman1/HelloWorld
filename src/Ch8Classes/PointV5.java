package Ch8Classes;
//This class is  a template to represent a Point on
//the cartesian coordinate plane. This version overrides
// the calls Object's equal method
public class PointV5 {
    private int x;
    private int y;
    private static int objectCount; //static fields reside at the class level not at the object level

    //This is the constructor
    //A constructor does NOT have a return type
    //it gets called implicitly when an object is created
    public PointV5(int x, int y){
        objectCount++;
        this.x = x;
        this.y = y;
    }
    public PointV5(){
        objectCount++;
        x = 0;
        y = 0;
    }
    public static int getObjectCount(){
        return objectCount;
    }

    //setters (mutator) methods below
    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    //These are the state fields (variables)
    //behaviors below (methods)
    // void (getter) methods below (void methods)
    public void translate(int dx, int dy){
        x += dx;
        y += dy;

    }
    public void setLocation(int newX, int newY){
        x = newX;
        y = newY;

    }
    //getter (accessor) methods below (non void methods)
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public double distance(PointV5 other){
        int dx = x - other.x;
        int dy = y - other.y;
        return Math.sqrt((dx*dx) + (dy * dy));
    }
    public double distanceFromOrigin(){
        return Math.sqrt((x * x) + (y * y));
    }
    //Over ridding the obejct's built-in toString() method
    //to print the contents of the object instead of its location
    public String toString(){

        return "(" + x + "," + y + ")";
    }

    public boolean equals(Object name){
        if(name instanceof PointV5) {
            PointV5 point = (PointV5) name;
            return this.getX() == point.getX() && this.getY() == point.getY();
        }
        return false;
    }
}
