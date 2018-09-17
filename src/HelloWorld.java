import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello World!!");
        System.out.println("Welcome to APCS");
        Scanner console = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = console.next();
        System.out.print("Your name is " + name);
        System.out.println("Hello");
        System.out.println("Hello again.");
    }
}
