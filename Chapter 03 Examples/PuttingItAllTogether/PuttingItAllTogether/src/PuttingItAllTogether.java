// Author : Kyle Ray
// Date : January 27, 2026
// Purpose : Convert cm to Feet/Inches

import java.util.Scanner; // import the Scanner module
public class PuttingItAllTogether {
    public static void main(String[] args) { // This goes in every program
        double cm; // Declare a variable
        int feet, inches, remainder; // Declare a variable
        final double CM_PER_INCH = 2.54; // Declare and assign a constant
        final int IN_PER_FOOT = 12; // Declare and assign a constant
        Scanner in = new Scanner(System.in); // Declare and assign Scanner

        //prompt user and get the value
        System.out.print("Exactly how many cm? "); // Prompt User a Question
        cm = in.nextDouble(); // Assign the user input to the variable. in ,means read the keyboard. nextDouble id a
                                // method that waits for the user to type something, reads what is typed, converts it into
                                // a double number and then gives the number back to my program.
                                // Pretty much this is asking the user to type a number, read it, and store it in cm

        // convert and output the result
        inches = (int) (cm/CM_PER_INCH); // convert inches to foot and allow int/double division.
        feet = inches / IN_PER_FOOT; // convert feet to inches
        remainder = inches % IN_PER_FOOT; // Modulo Operation (Divides two numbers and computes the remainder)
        System.out.printf("%.2f cm = %d ft, %d in\n", cm, feet, remainder);
            // print f just means print formatted, which controls how numbers look and plug variables into specific spots

            // "%.2f cm = %d ft, %d in\n" This is the template and it contains normal text (cm =, ft, and in) & placeholders where numbers will go.
            //%.2f
                // % is where a value will go
                // f means a floating-point number (double)
                // .2 means to show 2 digits after the decimal.
                // this goes with cm
            //%d
                // first %d goes with feet
                // second %d goes with remainder.
            // \n means new line

            // cm, feet, remainder at the end, these are the actual values that fill the placeholders in order.
                // %.2f is the cm variable
                // %d is the feet variable
                // %d is the remainder variable. ORDER MATTERS!!
    }

}