/********* Getting input from User *************/

// Import the Scanner from inbuilt packages "util"
import java.util.Scanner;

public class inputoutputdemo {
    public static void main(String args[]) {
        // int a; int-datatype, a-variable
        // Scanner scanner; Scanner-class, scanner-object
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        // Scanning the next line and store in a string called "name"
        String name = Scanner.nextLine();

        System.out.println("Rate us from 1 to 5");
        // Scanning the nextInt and store in an integer called "rating"
        int rating = Scanner.nextInt();
        // short rating = Scanner.nextShort();
        // After scan the integer, we give enter that enter take as a string and set to Email. So we are scanning the empty line and storing it anywhere.
        Scanner.nextLine();

        System.out.println("Enter the EmailId");
        // Scanning the next line and store in a string called "email"
        String email = Scanner.nextLine();


        System.out.println("Hello" + name);
        System.out.println("Your rating to us is" + rating);
        System.out.println("Your EmailId" + email);
    } 
}