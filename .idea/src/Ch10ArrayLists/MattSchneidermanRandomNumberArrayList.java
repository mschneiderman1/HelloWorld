package Ch10ArrayLists;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MattSchneidermanRandomNumberArrayList {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner file = new Scanner(new File("randomNumbers.txt"));
        int sum = file.nextInt();
        int max = sum;
        int min = sum;
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(file.hasNext()){
            int next = file.nextInt();
            if(next > max){
                max = next;
            }else if (next < min){
                min = next;

            }
            sum += next;
            list.add(next);

        }
        System.out.println(list);
        System.out.println((double)sum / list.size());
        System.out.println(max);
        System.out.println(min);
        ArrayList<Integer> odd = new ArrayList<Integer>();
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) % 2 != 0){
                odd.add(list.get(i));
            }
        }
        System.out.print(odd);
    }

}
