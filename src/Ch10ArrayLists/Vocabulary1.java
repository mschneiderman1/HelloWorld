package Ch10ArrayLists;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Vocabulary1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input1 = new Scanner(new File("text1.txt"));
        Scanner input2 = new Scanner(new File("text2.txt"));

        ArrayList<String> list1 = getWords(input1);
        System.out.println(list1);
        ArrayList<String> list2 = getWords(input2);

    }

    public static ArrayList<String> getWords(Scanner file){
        //read all words and sort
        ArrayList<String> words = new ArrayList<String>();
        while(file.hasNext()){
            words.add(file.next().toLowerCase());
        }
        Collections.sort(words);
        return words;
    }
}
