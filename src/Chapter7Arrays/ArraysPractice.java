package Chapter7Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractice {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        randomArray(console);

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
}

