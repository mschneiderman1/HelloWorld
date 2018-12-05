package Ch8Classes;

public class PointClientV4 {
    public static void main(String[] args){
        //instantiate a point object called p1
        PointV4 p1 = new PointV4(3,6);
        System.out.println("p1: " + p1);
        System.out.println("p1': " + p1);

        PointV4 p2 = new PointV4(7,25);
        System.out.println("p2: " + p2);

        PointV4 p3 = new PointV4(); //p3 should be at (0,0)
        System.out.println("p3: " + p3);

    }
}
