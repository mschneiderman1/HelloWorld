package CH12Recursion;

import java.util.Arrays;

public class MergeSort{
    public static void main(String[] args){
        int[] array = {1, 2, 3, 4, 5 , 6};
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        System.out.println(Arrays.toString(merge(array, array1, array2)));

    }
    public static void mergeSort(int[] array){
        //split array into two halves
        int[] left = Arrays.copyOfRange(array, 0,array.length / 2);
        int[] right = Arrays.copyOfRange(array, array.length / 2, array.length);

        //sort the two halves
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
        mergeSort(left);
        mergeSort(right);

        //merge the sorted halves into a sorted whole
        merge(array, left, right);
    }
    public static int[] merge(int[] array, int[] left, int[] right){
        int[] sorted = {array.length};
        int i1 = 0;
        int i2 = 0;
        for(int i = 0; i < array.length ; i++){
             if((i2 >= right.length || i1 < left.length) && left[i1] <= right[i2]){
                 sorted[i] = left[i1];
                 i1++;
             }else{
                 sorted[i] = right[i2];
                 i2++;

             }
        }
        return sorted;
    }
}
