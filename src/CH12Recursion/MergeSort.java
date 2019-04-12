package CH12Recursion;

import java.util.Arrays;

public class MergeSort{
    public static void main(String[] args){
        int[] array = {5, 10, 12, 2, 9, 6, -111};
        System.out.println(Arrays.toString(array));
        mergeSort(array);
        System.out.println(Arrays.toString(array));

    }
    public static void mergeSort(int[] array){
        if(array.length >= 2) {
            //split array into two halves
            int[] left = Arrays.copyOfRange(array, 0, array.length / 2);
            int[] right = Arrays.copyOfRange(array, array.length / 2, array.length);

            //sort the two halves
            mergeSort(left);
            mergeSort(right);

            //merge the sorted halves into a sorted whole
            merge(array, left, right);
        }
    }
    public static void merge(int[] array, int[] left, int[] right){
        int i1 = 0;
        int i2 = 0;
        for(int i = 0; i < array.length; i++){
             if(i2 >= right.length ||
                     (i1 < left.length && left[i1] < right[i2])){
                 array[i] = left[i1];
                 i1++;
             }else{
                 array[i] = right[i2];
                 i2++;
             }
        }
    }
}
