/*
Author  : Kyle Ray
Date    : 02/11/2026
Purpose : Write a program to generate the lyrics to the song "99 Bottles of Beer." However, your program should read
in the starting number of bottles the user wants in the song, it won't always be 99.
 */

import java.util.Scanner; // import the Scanner

public class bottlesOfBeer {
    public static void main (String args[]) {

        // Declare and assign a variable that runs the method userInput() and saves the user input
        // as a variable called number.
        int number;

        // Assign the variable and run the method to get the user input.
        number = userInput(); // Run the method to get user Input

        beer(number);

    }


    // Method to get user input.

    public static int userInput() {

        //Declare the variables
        int input; // The scanner input variable

        //Prompt the user to input an integer
        System.out.print("Please input an integer : ");
        Scanner in = new Scanner(System.in); // create an instance input in Scanner.
        input = in.nextInt(); // Assign a variable that stores the input.

        return input; // Return the value input by the user.
    }

    //Method to do bottles of beer portion
    public static void beer (int number) {  // int number is used here as a parameter because in main method I
                                            // call number in beer, therefore this method has to have a parameter in
                                            // the parenthesis.

        System.out.print("Enter the starting number of beer bottles : ");

    }
}





