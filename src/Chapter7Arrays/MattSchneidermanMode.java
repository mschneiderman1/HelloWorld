package Chapter7Arrays;

import java.util.Scanner;


public class MattSchneidermanMode {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter your number: "); //prompts user for number
        int num = console.nextInt();
        mostFrequentDigit(num);
        System.out.println("The mode of " + num + " is " + mostFrequentDigit(num));
    }

    public static int mostFrequentDigit(int num){
        int[] array = new int[10]; // This creates an array for the digits 0-9

        while (num > 0) {
            int digit = num % 10; //gets the last digit
            array[digit]++; // adds one to that index
            num = num / 10; //gets rid of that digit
        }
        int highest = 0;
        for (int i = 1; i < array.length - 1; i++){ //runs through array to see which index is the highest
            if (array[highest] < array[i]) {
                highest = i;
            }
        }
        return highest; //returns the mode
    }
}