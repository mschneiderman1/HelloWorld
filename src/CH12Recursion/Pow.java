package CH12Recursion;

public class Pow{
    public static void main(String[] args){
        System.out.println(iterativePow(4,5) + " " + recursivePow(4, 5));
        System.out.println(iterativePow(3,7) + " " + recursivePow(3, 7));
        System.out.println(iterativePow(8,4) + " " + recursivePow(8, 4));

    }
    public static int iterativePow(int n, int x){
        int total = 1;
        for(int i = 0; i < x; i++){
            total *= n;
        }
        return total;
    }
    public static int recursivePow(int n, int x){
        if(x == 1){
            return n;
        }else{
            return recursivePow(n, x - 1) * n;
        }
    }
}
