// Author : Kyle Ray
// Date : 02/11/26
// Purpose : Write a program (class name RightAngleLoop) to accept a number from the user and display the pattern like
                // right angle triangle with a number like the picture shown here.  You should define and invoke a method
                // called getUserNumber()  to get the number from the user.

import java.util.Scanner;

public class Loops3 {
    public static void main(String args[]) {

        // Declare and assign a variable that runs the method getUserNumber() and saves the user input
        // as a variable called number.
        int number = getUserNumber();

        rightAngleLoop(number); //calls method rightAngleLoop and passes in the number that the user input.
    }

    //getUserNumber method reads the input from the user that is of int type variable.
    public static int getUserNumber() {

        // Initialize Scanner
        Scanner in = new Scanner(System.in); // Call scanner, create an instance in scanner called in. make this instance
        // equal to a new Scanner input driven from the input from the user.
        // Declare the variable type
        int input;

        // Prompt the user for input
        System.out.print("Please input a number : ");

        // Assign the variable
        input = in.nextInt(); // in ---> calls the instance in we made in scanner above on (18).
        // nextInt() --> returns the integer value input from the user.

        return input;
    }


    //rightAngleLoop method displays the pattern like right angle triangle with a number.
    // This method receives input from getUserNumber, that is why it is in the parenthesis (int input).
    public static void rightAngleLoop(int input) {

        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();

        }

    }

}

