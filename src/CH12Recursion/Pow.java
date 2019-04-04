package CH12Recursion;

public class Pow{
    public static void main(String[] args){
        System.out.println(iterativePow(4,5) + " " + recursivePow(4, 5));
        System.out.println(iterativePow(3,7) + " " + recursivePow(3, 7));
        System.out.println(iterativePow(8,4) + " " + recursivePow(8, 4));

    }
    public static int iterativePow(int base, int exp){
        int total = 1;
        for(int i = 0; i < exp; i++){
            total *= base;
        }
        return total;
    }
    public static int recursivePow(int base, int exp){
        //base case
        if(exp == 0){
            return 1;
        }else{
            return recursivePow(base, exp - 1) * base;
        }
    }
}
