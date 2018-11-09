package Chapter7Arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MattSchneidermanSum {
    public static final int length = 25;
    public static void main(String[] args) throws FileNotFoundException {
        //This program takes a file of numbers and produces the sum of the number on the line.
        //This program works for numbers of any length. You just need to update the class constant
        Scanner input = new Scanner(new File("sum.txt")); //imports file
        createArray(input);

    }

    public static void createArray(Scanner input){ // This method creates the array for the line
        int numberOfLines = 0;
        while(input.hasNextLine()){
            numberOfLines++;
            String lineString = input.nextLine();
            Scanner line1 = new Scanner(lineString);
            int x = 0;
            while (line1.hasNext()){
                x++;
                line1.next();
            }
            int column = x;
            Scanner line = new Scanner(lineString);
            while(line.hasNext()){ // This prints the equation with out the sum
                if(x != 1) {
                    System.out.print(line.next() + " + ");
                    x--;
                }else{
                    System.out.print(line.next() + " = ");
                }
            }
            int[][] array = new int[column + 2][length + (column * column)]; //initalizes the array
            popArray(array, lineString);
        }
        System.out.println();
        System.out.println();
        System.out.println("Total lines = " + numberOfLines);


    }

    public static void popArray(int[][] array, String lineString) {// this method populates the array
        int row = 0;
        Scanner line = new Scanner(lineString);
        while (line.hasNext()){ //it starts at the back of the string and moves toward the front
            int column = array[row].length - 1;
            String num = line.next();
            for (int i = num.length() - 1; i >= 0; i--) {
                char number = num.charAt(i);
                int digit = number - '0';
                array[row][column] = digit;
                column--;
            }
            row++;
        }
        addColumns(array);
    }
    public static void addColumns(int[][] array){//this adds up the columns
        int columnAt = array[0].length - 1;
        int sum = 0;
        int reman = 0;
        while(columnAt > 0){
            for(int i = 0; i < array.length - 1; i++) {
                sum += array[i][columnAt];
            }
            if(sum >= 10){// this deals with any overflow
                reman = sum % 10;
                array[array.length - 1][columnAt] = reman;
                sum = sum / 10;
                array[array.length - 2][columnAt - 1] = sum;
            }else{
                array[array.length - 1][columnAt] = sum;
            }
            columnAt--;
            sum = 0;
        }
        printSum(array);
    }
    public static void printSum(int[][] array){// This method prints the last row of the array with out
        // all the 0s
        int indicator = 0;
        for(int i = 0; i < array[0].length; i++){
            if(array[array.length - 1][i] != 0){
                indicator++;
            }
            if(indicator != 0){
                System.out.print(array[array.length - 1][i]);
            }
        }
        if(indicator == 0){
            System.out.print(0);
        }
        System.out.println();
    }

}


//Method

//Step 1: Import the file and create a loop that reads each line one at a time

//Step 2: Create an 2D array for that line. The length will be the length across of the largest number + the number of times a number of that length appears. The number of rows will be the number of tokens (numbers) in that line plus one. The last row will be for the sum

//Step 3:  Populate the array by starting from the back, that way the number line uo correctly. Then add up all of the columns so that the sum for each column is in the last row. Start in the back and if when adding a column the sum has two values add the number in the tenths place to the column to the left.

// Step 4: Print the equation in the correct format without all of the extra zeros.

