package Chapter7Arrays;

import java.util.Scanner;

public class MattSchneidermanMode { //This program takes a number and find which digit 0-9 occurs the most(mode)
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter your number: "); //prompts the user for the number
        int num = console.nextInt();
        System.out.println("The mode of " + num + " is " + mostFrequentDigit(num));
    }
    public static int mostFrequentDigit (int num){
        int[] array = new int[10]; //creates array so that we can keep track of occurrences.
        while (num > 0) {
            int digit = num % 10; //this gets the last digit of the number
            array[digit]++;
            num = num / 10; // this gets rid of the last digit
        }
        int highest = 0;
        for (int i = 1; i < array.length - 1; i++) {// this traverses the array to find which number occurred
            // the most
            if (array[highest] < array[i]) {
                highest = i;
            }
        }
        return highest; // this returns the mode so it can be printed
    }
}

