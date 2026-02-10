/*
Author : Kyle Ray
Date : 02/09/26
Purpose :

Procedure 1:
Write a Java program that will call each of the following procedures. When completed, have it print "That's All Folks!"

Procedure 2:
Write a Java procedure to get a number from the user and print whether it is positive or negative and odd or even.
main() should have two calls:
    a method named  isPositive(num) that will return whether the number is positive.
    a method named  isOdd(num) that will return whether the number is odd.

Procedure 3:
Write a procedure named greatestNumber()  that asks for three numbers from the user and returns the greatest number.
    The main program should print "The greatest number is <returnedNumber>."

Procedure 4:
Write a Java procedure that reads a floating-point number and prints "zero" if the number is zero.
    Otherwise, print "positive" or "negative" if the number is positive or negative respectively.
    Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000
    (Call the class Size)

Procedure 5:
Write a Java procedure that reads a number from the user between 1 and 7, calls a method called getWeekDay() to get the
day of the week corresponding to the number and displays the name of the weekday

*/

import java.util.Scanner; // Load The java scanner

public class Conditionals {


    // ------------------------------
    // Procedure #1
    // ------------------------------

    public static void main(String[] args) {

        // Run Procedure 2
        System.out.println("Procedure 2 :");
        checkNumber();

        // Run Procedure 3

        System.out.println("\nProcedure 3 :");
        greatestNumber();

        // Run Procedure 4
        System.out.println("\nProcedure 4 :");
        Size();

        //Run Procedure 5
        System.out.println("\nProcedure 5 :");
        weekdayProgram();

        //Close out the program with an ending message
        System.out.print("That's all folks!");
    }


    // ------------------------------
    // Procedure #2
    // ------------------------------

    public static void checkNumber() {

        // Bring in Scanner Code & declare variable
        Scanner input = new Scanner(System.in); // Create an instance in Scanner called input. This scans user input.
        int num;
        boolean isPositive;

        // Prompt the User for Input
        System.out.print("Please enter a number : ");

        // Check if the input is a Number
        if (!input.hasNextDouble()) {
            String word = input.next();
            System.err.println(word + " is not a number");
        }

        // Read the input and assign variable
        num = input.nextInt();

        // Figure out if the number is positive or negative by calling method isPositive
        if (isPositive(num) == true) {
            System.out.print("The number that you input is Positive.\n");
        } else {
            System.out.print("The number you input is Negative\n");
        }

        // Figure out if the number is odd or even by calling method isOdd
        if (isOdd(num) == true) {
            System.out.println("The number that you input is Odd.");
        } else {
            System.out.println("The number you input is Even");
        }
    }

    // Method to determine if the number is positive or negative.
    public static boolean isPositive(int num) {
        return num > 0; // This is the same thing as doing an if statement (see CH 5 - Boolean Methods Section)
    }

    // Method to determine if the number is odd or even.
    public static boolean isOdd(int num) {
        return num % 2 != 0; // This is the same thing as doing an if statement (see CH 5 - Boolean Methods Section)
    }

    // ------------------------------
    // Procedure #3
    // ------------------------------

    public static void greatestNumber() {

        // Declare variables
        int a, b, c, largest;

        //Initialize the Scanner.
        Scanner input = new Scanner(System.in); // Create an instance in Scanner called input. This scans user input.

        // Prompt the User for Input and declare a scanner variable
        System.out.print("Please enter a number : ");
        a = input.nextInt();

        // Prompt the User for Input and declare a scanner variable
        System.out.print("Please enter another number : ");
        b = input.nextInt();

        // Prompt the User for Input and declare a scanner variable
        System.out.print("Please enter another number : ");
        c = input.nextInt();

        if (a >= b && a >= c) {
            largest = a;
        } else if (b >= a && b >= c) {
            largest = b;
        } else {
            largest = c;
        }

        System.out.println("The largest number of your input is : " + largest);

    }

    // ------------------------------
    // Procedure #4
    // ------------------------------

    public static void Size() {

        //Declare the variable

        float num;

        //Initialize the Scanner.
        Scanner input = new Scanner(System.in); // Create an instance in Scanner called input. This scans user input.

        // Prompt the User for Input and declare a scanner variable
        System.out.print("Please enter a number : ");

        num = input.nextFloat();
        float abs;

        // Determine is the number is zero, positive, or negative.
        // Note with if statements or else statements, curly brackets are not required!!

        if (num == 0)
            System.out.println("The number you input was zero.");

        if (num > 0)
            System.out.println("The number is positive.");
        else if (num == 0)
            System.out.println(" ");
        else
            System.out.println("The number is negative.");

        // Assign a variable to absolute value

        abs = Math.abs(num);

        // Determine if number is less than 1 and print small
        if (abs < 1)
            System.out.println("Small.");
        else if (abs > 1_000_000)
            System.out.println("Large.");
        else
            System.out.println(" ");

    }

    // ------------------------------
    // Procedure #5
    // ------------------------------

    public static void weekdayProgram() {

        //Declare the variables

        int day;

        //Initialize the Scanner.
        Scanner input = new Scanner(System.in); // Create an instance in Scanner called input. This scans user input.

        // Prompt the User for Input and declare a scanner variable
        System.out.println("Enter a number (1-7) : ");
        day = input.nextInt();

        // Call the new method getWeekDay and return the value
        System.out.println(getWeekDay(day));
    }

    // Create a method called getWeekday that takes an input parameter and returns a value based on the integer input.

    public static String getWeekDay(int day) {
        // public --> any other class can call this method.
        // static -->you can call it without creating an object first (ex: MyClass.getWeekDay(3)).
        // String --> the method returns a String (like "Monday").
        // getWeekDay --> the method name
        // int day --> it takes one input parameter named day, and it must be an integer.

        // Do switch case to determine day based on integer input by user
        switch (day) {
            // A switch checks the value of day and jumps to the matching case. (what was input by the user in this case.)
            case 1:
                return "Sunday";
            case 2:
                return "Monday";
            case 3:
                return "Tuesday";
            case 4:
                return "Wednesday";
            case 5:
                return "Thursday";
            case 6:
                return "Friday";
            case 7:
                return "Saturday";
            default:
                return "Invalid day";
        }
    }
}