package Chapter7Arrays;

import java.util.Scanner;

public class MattSchneidermanMode {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = console.nextInt();
        System.out.println("The mode of " + num +  " is " + mostFrequentDigit(num));
    }
    public static int mostFrequentDigit(int num){
        int[] array = new int[10];
        while(num > 0){
            int digit = num % 10;
            array[digit]++;
            num = num / 10;
        }
        int highest = 0;
        for(int i = 1; i < array.length - 1; i++){
            if (array[highest] < array[i]){
                highest = i;
                }
            }
        return highest;
    }
}
