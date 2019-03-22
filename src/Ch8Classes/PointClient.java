package Ch8Classes;

public class PointClient {
    public static void main(String[] args){
        //instantiate a point object called p1
        PointV1 p1 = new PointV1();
        System.out.println("p1: (" + p1.x + ", " + p1.y + ")");
        p1.x = 3;
        p1.y = 3;
        System.out.println("p1': (" + p1.x + ", " + p1.y + ")");
    }
}
