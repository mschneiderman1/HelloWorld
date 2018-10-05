package Chapter7Arrays;

import java.util.Scanner;

public class MattSchneidermanRandomHatV2 {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("How many teams are competing? ");
        int length = console.nextInt();
        while(length % 2 != 0 || length < 0){
            System.out.println("You need to enter a positive even number for this program to work");
            System.out.print("Enter a new number: ");
            length = console.nextInt();
        }
        int[] teams = new int[length];
        for(int i = 0; i < length; i++){
            teams[i] = i + 1;
        }
        System.out.println();
        System.out.println("Round 1:");
        int test = 0;
        for(int i = 1; i <= teams.length; i++) {
            int x = (int) (Math.random() * length);
            while (teams[x] == 0) {
                x = (int) (Math.random() * length);
            }
            System.out.print(teams[x]);
            teams[x] = 0;
            if(test == 0){
                System.out.print(" VS. ");
                test++;
            }
            else{
                test = 0;
                System.out.println();
            }
        }
    }
}
