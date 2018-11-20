package Chapter7Arrays;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class MattSchneidermanPersonality{
    public static void main(String[] args) throws FileNotFoundException{
        inputFile();
    }

    public static void inputFile(){
        Scanner console = new Scanner(System.in);
        System.out.print("What is the file you want to input?: ");
        String userFile = console.next();
        Scanner file = new Scanner(userFile);

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
