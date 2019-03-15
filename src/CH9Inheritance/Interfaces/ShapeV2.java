//Shape is an interface that contains two methods and they are
//Area and perimeter. Any class that implements shape is responsible
//for implementing all the methods of shape

package CH9Inheritance.Interfaces;

public abstract class ShapeV2 implements Comparable{
    public abstract double area();
    public abstract double perimeter();

    @Override
    public int compareTo(Object o){
       if(o instanceof ShapeV2) {
           ShapeV2 s = (ShapeV2) o;
           if(this.area() > s.area()){
               return 1;
           }else if(this.area() < s.area()){
               return -1;
           }else{
               return 0;
           }
       }
       return Integer.MAX_VALUE;
    }

}
