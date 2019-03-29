package CH7Arrays;

import java.util.Arrays;

public class ArrayTraversal {
    public static void main(String[] args) {
        int[] array = {5, 8, 7, 12};
        array = abbyAlgo(array);
        System.out.println("After Abby's " + Arrays.toString(array));
        array = jonnyAlgo(array);
        System.out.println("After Johnny's " + Arrays.toString(array));
    }

    public static int[] jonnyAlgo(int[] ja) {
        for (int i = 0; i < ja.length / 2; i++) {
            int x = ja[i];
            ja[i] = ja[ja.length - i - 1];
            ja[ja.length - i - 1] = x;
        }
        return ja;

    }

    public static int[] abbyAlgo(int[] aa) {
        //Step1: create a new temp integer array of the same size
        int[] temp = new int[aa.length];
        //Step2: copy the contents of the original array into the new
        //array in reverse order
        int x = 0;
        for (int i = aa.length - 1; i >= 0; i--) {
            temp[x] = aa[i];
            x++;
        }
        return temp;
    }
}
