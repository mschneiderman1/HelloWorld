package Chapter7Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractice {
    public static void main(String[] args) {
        //Scanner console = new Scanner(System.in);
        //randomArray(console);
        int number = 669260267;
        int mode = mode(number);
        System.out.println(mode);

    }
    public static void first(){
        //Step1: declare a variable
        int[] numbers1 = new int[5];
        //Step2: initialize the variable
        System.out.println(Arrays.toString(numbers1)); //before populated the array
        for(int i = 0; i < 5; i++){
            numbers1[i] = i + 1;
        }
        System.out.println(Arrays.toString(numbers1)); //after populated the array
        //OR
        //Step1&2; declare and initialize
        int[] numbers2 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers2));

    }
    public static void randomArray(Scanner console){
        System.out.print("How long do you want the array to be? ");
        int length = console.nextInt();
        System.out.println("What range of numbers do you want?");
        System.out.print("Min: ");
        int min = console.nextInt();
        System.out.print("Max: ");
        int max = console.nextInt();
        int[] randoAarray = new int[length];
        for(int i = 0; i < length ; i++){
            randoAarray[i] = (int)((Math.random() * (max-min)) + min);
        }
        System.out.println(Arrays.toString(randoAarray));
    }
    public static int mode(int number){
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int count6 = 0;
        int count7 = 0;
        int count8 = 0;
        int count9 = 0;
        int count0 = 0;
        while(number > 0) {
            int x = number % 10;
            if (x == 1) {
                count1++;
            } else if (x == 2){
                count2++;
            } else if (x == 3){
                count3++;
            } else if (x == 4){
                count4++;
            } else if (x == 5){
                count5++;
            } else if (x == 6){
                count6++;
            } else if (x == 7){
                count7++;
            } else if (x == 8){
                count8++;
            } else if (x == 9){
                count9++;
            } else if (x == 0){
                count0++;
            }
            number = number / 10;
        }
        int max1 = Math.max(count1, Math.max(count2, Math.max(count3, count4)));
        int max2 = Math.max(count5, Math.max(count6, Math.max(count7, count8)));
        int max3 = Math.max(count9, count0);
        int maxFinal = Math.max(max1, Math.max(max2, max3));
        return maxFinal;






    }
}

