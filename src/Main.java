// First we import the scanner so Java can accept user input.
// Initialize variables userMonth, which will change to match the user input, and trash, which will interpret incorrect inputs as string variables.
// Prompt the user to enter a birth year value ranging from 1 to 12.
// System.out.print("Enter your birth month as a value from 1 to 12.")
// The program will first run an if statement to check if the user provided an int value. Next, it will check if the int value falls into the range of 1-12.
// if(in.hasNextInt()) // This checks if the input is a valid integer.
    // if(userMonth >= 1 & userMonth <= 12) // This checks if the integer, having been deemed valid, falls between 1 and 12.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int userMonth;
        String trash;
            System.out.print("Enter your birth month as a value from 1 to 12: ");
            if(in.hasNextInt())
            {
                userMonth = in.nextInt();
                if(userMonth >= 1 & userMonth <= 12)
                {
                    System.out.print("You were born in month " + userMonth + ".");
                }
                else
                {
                    System.out.print("The value you provided, " + userMonth + ", is not within the valid month range. Please run the program again and provide a valid month number.");
                }

            }
            else
            {
                trash = in.nextLine();
                System.out.println("The input you provided was " + trash + ", which is not a valid month number. Please run the program again and enter a valid number.");
            }


    }
}