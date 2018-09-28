package Chapter7Arrays;

import java.util.Arrays;

public class ArrayTraversal {
    public static void main(String[] args){
        int[] array = {5, 8, 7, 12};
        System.out.println("Original Array" + Arrays.toString(array));
        abbyAlgo(array);
        jonnyAlgo(array);
    }
    public static void jonnyAlgo(int[] ja){
        int temp[] = new int[ja.length];
        for(int i = 0; i < ja.length; i++){
            int x = ja[i];
            temp[i] = ja[ja.length - i -1];
            temp[temp.length - i - 1] = x;
        }
        System.out.println("Jonny's Algorithm" + Arrays.toString(temp));

    }
    public static void abbyAlgo(int[] aa){
        //Step1: create a new temp integer array of the same size
        int[] temp = new int[aa.length];
        //Step2: copy the contents of the original array into the new
        //array in reverse order
        int x = 0;
        for(int i = aa.length - 1; i >= 0; i--){
            temp[x] = aa[i];
            x++;
        }
        System.out.println("Abby Algorithm" + Arrays.toString(temp));
    }
}
