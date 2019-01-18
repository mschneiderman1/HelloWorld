package Ch10ArrayLists;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExercise {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner file = new Scanner(new File("data.txt"));
        print(file);
    }
    public static void print(Scanner file){
        ArrayList<String> list = new ArrayList<String>();
        while(file.hasNext()){
            String word = file.next();
            list.add(word);
        }
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        for(int i = list.size() - 1; i > -1; i--){
            System.out.print(list.get(i)  + " ");
        }
        System.out.println();
        for(int i = 0; i < list.size(); i++){
            String test = list.get(i);
            int length = test.length();
            if(test.charAt(length - 1) == 's'){
                 list.set(i, test.substring(0, 1).toUpperCase() + test.substring(1));
            }
            System.out.print(list.get(i)  + " ");
        }
        System.out.println();
    }
}
