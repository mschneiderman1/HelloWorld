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

    public static String inputFile(Scanner console) throws FileNotFoundException {
        System.out.print("Input file name: ");
        String userInput = console.next();
        int x = 0;
        while (x == 0) {
            try {
                Scanner test = new Scanner(new File(userInput));
                x = 1;
            } catch (FileNotFoundException e) {
                x = 0;
                System.out.print("File not found. Try again: ");
                userInput = console.next();
            }
        }
        return userInput;
    }

    public static String outputFile(Scanner console) {
        System.out.print("Output file name: ");
        String userOutput = console.next();
        return userOutput;
    }

    public static void answerArray(Scanner input, PrintStream output){
        while(input.hasNextLine()){
            output.println(input.nextLine() + ":");
            String answers = input.nextLine();
            char[] userAnswers = new char[70];
            for(int i = 0; i < userAnswers.length; i++){
                userAnswers[i] = answers.charAt(i);
            }
            int[] aCount = new int[4];
            int[] bCount = new int[4];
            count(aCount, bCount, userAnswers,output);
        }
    }

    public static void count(int[] aCount, int[] bCount, char[] userAnswers, PrintStream output){
       for(int i = 0; i < userAnswers.length; i++){
           char test = userAnswers[i];
           test = Character.toUpperCase(test);
           if (test == 'A'){
               aCount[0]++;
           }
           else if(test == 'B'){
               bCount[0]++;
           }
           i += 6;
       }
       output.println(Arrays.toString(aCount));
       output.println(Arrays.toString(bCount));

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

}
