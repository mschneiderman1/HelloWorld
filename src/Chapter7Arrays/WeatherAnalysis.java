package Chapter7Arrays;

import java.util.Scanner;

//This program takes user input and calculates the average temperature for n days. Program also identifies how
// many days are above the average temperature
public class WeatherAnalysis {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int length = days(console);
        average(console, length);
    }

    public static int days(Scanner console) {
        //Step1: prompt user for number of days
        System.out.print("How many days' temperatures? ");
        int length = console.nextInt();
        return length;
    }

    public static void average(Scanner console, int length) {
        //Step2: create for loop that ask user for  high temperature with  a cumulative sum variable
        //and populate array
        int[] temp = new int[length];
        double totalTemp = 0;
        for (int i = 0; i < length; i++) {
            System.out.print("Day " + (i + 1) + "'s high temp: ");
            int userTemp = console.nextInt();
            totalTemp += userTemp;
            temp[i] = userTemp;
        }
        averageAbove(length, totalTemp, temp);
    }

    public static void averageAbove(int length, double totalTemp, int[] temp) {
        // Step 3: calculate average temp and see how many highs are above that average
        double average = (Math.round((totalTemp / length) * 10.0) / 10.0);
        System.out.println("Average temp = " + average);
        int above = 0;
        for (int i = 0; i < length; i++) {
            if (average < temp[i]) {
                above++;
            }
        }
        System.out.println(above + " days were above average.");

    }
}
//random test comment