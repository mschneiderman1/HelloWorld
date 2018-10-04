package Chapter7Arrays;

import java.util.Arrays;

public class MattSchneidermanRandomHat {
    public static void main(String[] args){
        int[] teams = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Round 1:");
        int test = 0;
        for(int i = 1; i <= 8; i++) {
            int x = (int) (Math.random() * 8);
            while (teams[x] == 0) {
                x = (int) (Math.random() * 8);
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
