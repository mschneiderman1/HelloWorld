package Ch8Classes;

public class PointClientV5 {
    public static void main(String[] args){
        System.out.println(PointV4.getObjectCount());
        //instantiate a point object called p1
        PointV5 p1 = new PointV5(3,6);
        System.out.println("p1: " + p1);

        System.out.println(PointV5.getObjectCount());

        PointV5 p2 = new PointV5(3,6);
        System.out.println("p2: " + p2);

        System.out.println(PointV5.getObjectCount());

        if(p1.equals(p2)){
            System.out.println("They are equal points!");
        }else{
            System.out.println("They are different points!");
        }
    }
}
