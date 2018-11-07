package Chapter7Arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MattSchneidermanSum {
    public static final String file = "sum.txt";

    public static void main(String[] args) throws FileNotFoundException{
        Scanner fileScanner = new Scanner(new File("src/Chapter&Arrays/sum.txt")); //reads file
        createArray(fileScanner);
    }
    public static void createArray(Scanner fileScanner){
        while(fileScanner.hasNextLine()){
            Scanner line = new Scanner(fileScanner.nextLine());
            int numberOfToken = 0;
            while(line.hasNext()){


            }
        }
    }
}


//Step 1: Import the file and create a loop that reads each line one at a time

//Step 2: Create an 2D array for that line. The length will be the length across of the largest number + the number of times a number of that length appears. The number of rows will be the number of tokens (numbers) in that line plus one. The last row will be for the sum

//Step 3:  Populate the array by starting from the back, that way the number line uo correctly. Then add up all of the columns so that the sum for each column is in the last row. Start in the back and if when adding a column the sum has two values add the number in the tenths place to the column to the left.

// Step 4: Print the equation in the correct format without all of the extra zeros.

