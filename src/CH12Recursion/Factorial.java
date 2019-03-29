package CH12Recursion;

public class Factorial {
    public static void main(String[] args){
        System.out.println(factorial(5) + " " + factorial(10));
        System.out.println(factorial(-4) + " " + factorial(4));
        System.out.println(factorial(0) + " " + factorial(2));

    }
    public static int factorial(int n){
        if(n == 0){
            return 1;
        }
        int total = n;
        for(int i = n; i > 0; i--){
            total *= (Math.abs(n) - i);
        }
        return total;

    }
    public static void recursiveFactorial(int n){

    }
}
