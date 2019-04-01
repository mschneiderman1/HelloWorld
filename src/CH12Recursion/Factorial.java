package CH12Recursion;

public class Factorial {
    public static void main(String[] args){
        System.out.println(iterativeFactorial(10) + " " + recursiveFactorial(10));
        System.out.println(iterativeFactorial(4) + " " + recursiveFactorial(4));
        System.out.println(iterativeFactorial(2) + " " + recursiveFactorial(2));

    }
    public static int iterativeFactorial(int n){
        int total = n;
        for(int i = n - 1; i > 0; i--){
            total *= (i);
        }
        return total;

    }
    public static int recursiveFactorial(int n){
        if(n == 0){
            return 1;
        }
        else{
            return recursiveFactorial(n - 1) * n;
        }
    }
}
