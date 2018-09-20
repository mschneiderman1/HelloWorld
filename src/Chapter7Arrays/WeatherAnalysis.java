package Chapter7Arrays;

import java.util.Scanner;

//This program takes user input and calculates the average temperature for n days. Program also identifies how
// many days are above the average temperature
public class WeatherAnalysis {
    public static void main(String[] args) {
        //Step1: prompt user for number of days
        Scanner console = new Scanner(System.in);
        System.out.print("How many days' temperatures? ");
        int length = console.nextInt();
        int[] temp = new int[length];
        int totalTemp = 0;
        //Step2: create for loop that ask user for  high temperature
        for(int i = 0; i < length; i++){
            System.out.print("Day " + (i + 1) + "'s high temp: ");
            int userTemp = console.nextInt();
            totalTemp += userTemp;
            temp[i] = userTemp;
        }
        int average = totalTemp / length;
        int above = 0;
        for(int i = 0; i < length - 1; i++){
            if (average < temp[i]){
                above++;
            }
        }
        System.out.println(above + " days were above average.");
        // Step3: have a cumulative sum variable running in for loop
        //also have an array
        //Step4: Calculate the average temp and print//Step5: calculate how many temps were above the average and print
    }
}
