package Chapter7Arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class MattSchneidermanPersonality {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);
        Scanner input = new Scanner(new File(inputFile(console)));
        PrintStream output = new PrintStream(new File(outputFile(console)));
        answerArray(input, output);

    }

    public static String inputFile(Scanner console) {// this method ask the user for the input file
        System.out.print("Input file name: ");
        String userInput = console.next();
        int x = 0;
        while (x == 0) {// this checks to make sure the file exists
            try {
                Scanner test = new Scanner(new File(userInput));
                x = 1;
            } catch (FileNotFoundException e) {
                x = 0;
                System.out.print("File not found. Try again: ");
                userInput = console.next();
            }
        }
        return userInput; //returns the user's file
    }

    public static String outputFile(Scanner console) {// ask the user for the output file
        System.out.print("Output file name: ");
        String userOutput = console.next();
        return userOutput;
    }

    public static void answerArray(Scanner input, PrintStream output) {// this method creates an array and populates it with the answers
        while (input.hasNextLine()) {
            output.println(input.nextLine() + ":");
            String answers = input.nextLine();
            char[] userAnswers = new char[70];
            for (int i = 0; i < userAnswers.length; i++) { //this for loop populates the array
                userAnswers[i] = answers.charAt(i);
            }
            int[] aCount = new int[4];
            int[] bCount = new int[4];
            count(aCount, bCount, userAnswers, output);
        }
    }

    public static void count(int[] aCount, int[] bCount, char[] userAnswers, PrintStream output) {// this code counts the A's and B's
        for (int i = 0; i < userAnswers.length; i++) { // This counts the Extrovert/Introvert questions
            char test = userAnswers[i];
            test = Character.toUpperCase(test);
            if (test == 'A') {
                aCount[0]++;
            } else if (test == 'B') {
                bCount[0]++;
            }
            i += 6;
        }
        int next = 0;
        for (int i = 1; i < userAnswers.length; i++) {// This counts the Sensing/iNtuition questions
            char test = userAnswers[i];
            test = Character.toUpperCase(test);
            if (test == 'A') {
                aCount[1]++;
            } else if (test == 'B') {
                bCount[1]++;
            }
            if (next == 1) {
                i += 5;
                next = 0;
            } else {
                next = 1;
            }
        }
        next = 0;
        for (int i = 3; i < userAnswers.length; i++) {// This counts the Thinking/Feeling questions
            char test = userAnswers[i];
            test = Character.toUpperCase(test);
            if (test == 'A') {
                aCount[2]++;
            } else if (test == 'B') {
                bCount[2]++;
            }
            if (next == 1) {
                i += 5;
                next = 0;
            } else {
                next = 1;
            }
        }
        next = 0;
        for (int i = 5; i < userAnswers.length; i++) {// This counts the Judging/Perceiving questions
            char test = userAnswers[i];
            test = Character.toUpperCase(test);
            if (test == 'A') {
                aCount[3]++;
            } else if (test == 'B') {
                bCount[3]++;
            }
            if (next == 1) {
                i += 5;
                next = 0;
            } else {
                next = 1;
            }
        }
        printAandB(aCount, bCount, output);
        printFinal(aCount, bCount, output);

    }

    public static void printAandB(int[] aCount, int bCount[], PrintStream output) { // this prints the As and Bs in the right format
        for (int i = 0; i < 4; i++) {
            output.print(aCount[i] + "A-" + bCount[i] + "B  ");
        }
        output.println();
    }

    public static void printFinal(int[] aCount, int[] bCount, PrintStream output) {// This prints the bPercents and the final result
        String[] bPercent = new String[4]; // array for bPercents
        String result = "";
        for (int i = 0; i < bPercent.length; i++) {
            int percent = bCount[i] * 100 / (aCount[i] + bCount[i]); // calculates the bPercent
            bPercent[i] = percent + "%";
            if (i == 0) { // finds whether result is E or I or X
                if (percent > 50) {
                    result += "I";
                } else if (percent < 50) {
                    result += "E";
                } else {
                    result += "X";
                }
            }
            if (i == 1) { // finds whether result is N or S or X
                if (percent > 50) {
                    result += "N";
                } else if (percent < 50) {
                    result += "S";
                } else {
                    result += "X";
                }
            }
            if (i == 2) { // finds whether result is F or T or X
                if (percent > 50) {
                    result += "F";
                } else if (percent < 50) {
                    result += "T";
                } else {
                    result += "X";
                }
            }
            if (i == 3) { // finds whether result is P or J or X
                if (percent > 50) {
                    result += "P";
                } else if (percent < 50) {
                    result += "J";
                } else {
                    result += "X";
                }
            }
        }
        output.println(Arrays.toString(bPercent) + " = " + result); //prints the bPrecent Array and the final result
        output.println();
    }
}

// 1) Ask user for input file, check to make sure the file exists.
// Create scanner to process the file. Also create Print stream that way you can print to the output
//process each set one at a time (set = the name line and their answers)

// 2) Print the name to the file

// 3) Create an array to store the person’s answers

// 4) create a second array that will hold the percentages

// 5) Create a string that will hold the persons result

// 6) Count the number of A’s and B’s for the I/E section. Use index (0, 7, 14, 21, etc.)

// 7) Print to the file the number of As and Bs in the form #A-#B

// 8) Calculate the percentage of B (#B over Total (A + B)) and then add it to the percent
// array with the % symbol

// 9) If percent > 50 add the second option to the string; if percent = 50 add an X and if
// percent < 50 add the first option(Introvert)

// 10) Repeat for section S/iN and then for T/F and finally for J/P

// 11) Print the present array to the file

// 12) Print the result string to the file