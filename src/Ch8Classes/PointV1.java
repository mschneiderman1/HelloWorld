package Ch8Classes;

import java.awt.*;

public class PointV1{
    //These are the state fields (variables)
    public int x;
    public int y;

    //behaviors below (methods)
    // void methods
    public void translate(int dx, int dy){
        x += dx;
        y += dy;

    }
    public void setLocation(int newX, int newY){
        x = newX;
        y = newY;

    }
    //non void methods
    public double distance(PointV1 other){
        int dx = x - other.x;
        int dy = y - other.y;
        return Math.sqrt((dx*dx) + (dy * dy));
    }
    public double distanceFromOrigin(){
        return Math.sqrt((x*x) + (y*y));
    }
}
