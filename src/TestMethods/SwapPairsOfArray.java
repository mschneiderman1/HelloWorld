package TestMethods;

import java.util.Arrays;

public class SwapPairsOfArray{
    public static void main(String[] args){
        String[] a = {"four", "score", "and", "seve","yea", "e"};
        swapPairs(a);
    }
    public static void swapPairs(String[] a){
        for(int i = 0; i < a.length - 1; i+=2){
            String temp = a[i];
            a[i] = a[i + 1];
            a[i + 1] = temp;
        }
        System.out.println(Arrays.toString(a));
    }
}
