package Chapter7Arrays;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args){
        //Step1: declare a variable
        int x;
        int[] numbers1 = new int[5];
        //Step2: initialize the variable
        x = 5;
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
}
