package Ch8Classes;

public class PointV3 {
    public int x;
    public int y;

    //This is the constructor
    //A constructor does NOT have a return type
    //it gets called implicitly when an object is created
    public PointV3(int xInitialized, int yInitialized){
        x = xInitialized;
        y = yInitialized;
    }
    public PointV3(){
        x = 0;
        y = 0;
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
    public double distance(PointV3 other){
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
}
