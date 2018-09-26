package Chapter7Arrays;

import java.util.Arrays;
import java.util.Scanner;

//This program takes user input and calculates the average temperature for n days. Program also identifies how
// many days are above the average temperature
public class MattSchneidermanWeatherAnalysisV2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int length = days(console);
        average(console, length);
    }

    public static int days(Scanner console) { //prompts user for number of days and returns that value as length
        System.out.print("How many days' temperatures? ");
        int length = console.nextInt();
        return length;
    }

    public static void average(Scanner console, int length) {//creates a for loop that asks user for high temp and prints
        // updates a cumulative sum variable and populates an array
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

    public static void averageAbove(int length, double totalTemp, int[] temp) { //calculates average temp and prints &
        //sees how many highs are above that average and prints that number
        double average = (Math.round((totalTemp / length) * 10.0) / 10.0);
        System.out.println("Average temp = " + average);
        int above = 0;
        for (int i = 0; i < length; i++) {
            if (average < temp[i]) {
                above++;
            }
        }
        System.out.println(above + " days were above average.");
        HighLow(temp, length);
    }

    public static void HighLow(int[] temp, int length) {
        //prints the array of temps and then sorts it
        //finally it prints the two coldest and hottest days
        System.out.println();
        System.out.print("Temperatures: [");
        for (int i = 0; i < length - 1; i++) {
            System.out.print(temp[i] + ", ");
        }
        System.out.println(temp[length - 1] + "]");
        Arrays.sort(temp);
        System.out.println("Two coldest days: " + temp[0] + ", " + temp[1]);
        System.out.println("Two hottest days: " + temp[temp.length - 1] + ", " + temp[temp.length - 2]);
    }
}
