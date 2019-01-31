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
        System.out.println(list2);
        ArrayList<String> overlap = overlap(list1, list2);

    }
    // This method reads in all the data from an external file
    // applies case folding. Arraylist is then sorted to eliminate
    // duplicates. This method returns an ArrayList
    // of Strings that are unique.
    public static ArrayList<String> getWords(Scanner file){
        //read all words and sort
        ArrayList<String> words = new ArrayList<String>();
        while(file.hasNext()){
            words.add(file.next().toLowerCase());
        }
        Collections.sort(words);

        //eliminate the duplicates in the array list
        ArrayList<String> uniqueWords = new ArrayList<String>();
        if(words.size() > 0){
            uniqueWords.add(words.get(0));
        }
        for(int i = 1; i < words.size(); i++){
            if(!(words.get(i).equals(words.get(i - 1)))){
                uniqueWords.add(words.get(i));
            }
        }
        return uniqueWords;
    }
    public static ArrayList<String> overlap(ArrayList<String> list1, ArrayList<String> list2){
        ArrayList<String> match = new ArrayList<String>();
        int count1, count2 = 0;
        ArrayList<String> larger = new ArrayList<String>;
        if(list1.size() >= list2.size()){
            larger = list1;
        }else{
            larger = list2;
        }
        while(larger.size() != count1){
            if(list1.get(count1).equals(list2.get(count2))){
                match.add(list1.get(count1));
                count1++;
                count2++;
            } else if(list1.get(count1).compareTo(list2.get(count2)){

            }

        }
    }
}
