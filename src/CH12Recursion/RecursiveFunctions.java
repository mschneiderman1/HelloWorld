package CH12Recursion;

public class RecursiveFunctions {
    public static void main(String[] args){
        System.out.println(f1(12));
    }
    public static int f1(int x){
        //base case
        if(x <= 4){
            return x + 4;
        }
        //recursive cases
        else if(x > 6){
            return 2 * f1(x - 3) - 3;
        }else{
            return f1(x + 2) + 1;
        }
    }
}
