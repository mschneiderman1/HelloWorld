package CH12Recursion;

import java.util.Arrays;

public class MattSchneidermanSelectionSort {
    public static void main(String[] args){
        int[] array = {9,3,6,2,4,1,9};
        System.out.println(Arrays.toString(selectionSort(array)));

    }
    public static int[] selectionSort(int[] array){
        for(int i = 0; i < array.length; i++){
            int index = i;
            int min = array[i];
            for(int j = i; j < array.length; j++){
                if(array[j] < min){
                    min = array[j];
                    index = j;
                }
            }
            array[index] = array[i];
            array[i] = min;
        }
        return array;
    }
}
