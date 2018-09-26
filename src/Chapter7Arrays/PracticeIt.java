package Chapter7Arrays;

import java.util.Arrays;

public class PracticeIt {
    public static void main(String[] args) {
        int[] odds = new int[22];
        int x = -5;
        for (int i = 0; i < odds.length; i++) {
            odds[i] = x;
            x += 2;
        }
        System.out.println(Arrays.toString(odds));
    }
}

