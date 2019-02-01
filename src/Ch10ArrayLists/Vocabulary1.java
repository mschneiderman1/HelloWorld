package Ch10ArrayLists;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Vocabulary1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);
        System.out.print("File 1: ");
        String file1 = console.next();
        System.out.print("File 2: ");
        String file2 = console.next();
        Scanner input1 = new Scanner(new File(file1));
        Scanner input2 = new Scanner(new File(file2));

        ArrayList<String> list1 = getWords(input1);
        System.out.println(file1 + ": " + list1);
        ArrayList<String> list2 = getWords(input2);
        System.out.println(file2 + ": " + list2);
        ArrayList<String> overlap = overlap(list1, list2);
        System.out.println("Overlap: " + overlap);
        double list1Percent = getPercentOverlap(overlap, list1);
        System.out.println(file1 + " Overlap Percent: " + list1Percent + "%");
        double list2Percent = getPercentOverlap(overlap, list2);
        System.out.println(file2 + " Overlap Percent: " + list2Percent + "%");

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
        int count1 = 0, count2 = 0;
        while((list1.size() > count1) && (list2.size() > count2)){
            if(list1.get(count1).equals(list2.get(count2))){
                match.add(list1.get(count1));
                count1++;
                count2++;
            } else if((list1.get(count1).compareTo(list2.get(count2)) < 0)){
                count1++;
            }else{
                count2++;
            }

        }
        return match;
    }
    //how many words out of each list appear in our overlap
    public static double getPercentOverlap(ArrayList<String> common, ArrayList<String> list){
        return (((double)common.size() / list.size()) * 100);

    }
}
