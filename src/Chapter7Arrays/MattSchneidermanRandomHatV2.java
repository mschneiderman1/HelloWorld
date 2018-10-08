package Chapter7Arrays;

import java.util.Scanner;

public class MattSchneidermanRandomHatV2 {
    public static void main(String[] args) {//This program creates the first round for a tournament with n number
        //of teams. This program will only work with a positive and an even number
        int teams = intro();
        int[] teamsArray = array(teams);
        printMatches(teamsArray, teams);

    }

    public static int intro() { //This method introduces the program and asks the user for N while also checking N
        System.out.println("This program will create the first round for a tournament with N number of teams. " +
                "The program only works if N is an even number.");
        System.out.println();
        Scanner console = new Scanner(System.in);
        System.out.print("How many teams are competing? ");
        int length = console.nextInt();
        while (length % 2 != 0 || length < 0) { // this loop checks to make sure the number type is even
            System.out.println("You need to enter a positive and even integer for this program to run");
            System.out.print("Enter a new number: ");
            length = console.nextInt();
        }
        return length;
    }

    public static int[] array(int teams){ // This method creates the array and populates it 1 - N (N = number of teams)
        int[] teamsArray = new int[teams];
        for (int i = 0; i < teams; i++) {
            teamsArray[i] = i + 1;
        }
        return teamsArray;
    }

    public static void printMatches(int[] teamsArray, int teams){
        //This method selects teams at random and matches them up
        System.out.println();
        System.out.println("Round 1:");
        int forVS = 0;
        for (int i = 1; i <= teamsArray.length; i++) {
            int x = (int) (Math.random() * teams);
            while (teamsArray[x] == 0) { // This loop keeps generating a new index until a team that hasn't been selected
                //is chosen.
                x = (int) (Math.random() * teams);
            }
            System.out.print(teamsArray[x]);
            teamsArray[x] = 0;
            if (forVS == 0) {
                // This prints the "VS." only if forVS is 0 which idicates its the first team in the matchup
                System.out.print(" VS. ");
                forVS++;
            } else {
                forVS = 0;
                System.out.println();
            }
        }
    }
}
