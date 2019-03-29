package CH7Arrays;

import java.util.Arrays;

public class Names {
    public static void main(String[] args){
        String[] names = {"Hello", "Hi", "How are you", "LOL"};
        System.out.println(Arrays.toString(namesBack(names)));

    }
    public static String[] namesBack(String[] names) {
        int back = names.length - 1;
        for (int i = 0; i < names.length / 2; i++) {
            String temp = names[i];
            names[i] = names[back];
            names[back] = temp;
            back--;
        }
        return names;
    }
}

