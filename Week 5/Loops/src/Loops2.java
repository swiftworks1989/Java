// Author :     Kyle Ray
// Date :       02/10/26
// Purpose :    2. Write a program to print Fibonacci series of n terms where n is input by user:  0 1 1 2 3 5 8 13 24...
//                 a. Use a for loop (Call the method forFibonacci)
//                 b. Use a while loop (Call the method (whileFibonacci)

import java.util.Scanner; // import the Scanner module.
public class Loops2 {

    public static void main(String args[]) {
       forFibonacci();
       whileFibonacci();
    }

    public static void forFibonacci() {

        // Declare Variables
        int input;
        int first;
        int second;
        int next;

        // Assign Varibles
                    // Input is defined in scanner bring in below
        first = 0;  // Define the first variable as 0 (First # of Fib Sequence)
        second = 1; // Define the second variable as 1 (Second # of Fib Sequence)

        //Bring in Scanner Code and declare varibles.
        Scanner in = new Scanner(System.in); // Create an instance in Scanner called input. This scans user input.

        //Prompt User to input the nth term they want printed
        System.out.print(" Enter the n terms of the Fib sequence you want to see printed : ");
        input = in.nextInt();

        //Print to console
        System.out.println("Fibonacci sequence : ");

        //Do the for loop
        for (int i = 0; i < input; i++) {       // Start at i = 0, go to the ith value user input, increment by 1 each time
            System.out.print(first + " ");      // Print out the first number with a space after it

            next = first + second;             // Variable next becomes first number + second number
            first = second;                    // First variable becomes second number
            second = next;                     // Second variable becomes next number
        }
    }

    public static void whileFibonacci() {

        // Declare Variables

        int input;
        int first;
        int second;
        int next;
        int i;

        // Assign Varibles
                            // input is defined in scanner bring in below
        first = 0;          // the first number of the Fib Sequence
        second = 1;         // the second number of the Fib sequence
        i  = 0;             // the start of the loop counter

        //Bring in Scanner Code and declare varibles.
        Scanner in = new Scanner(System.in); // Create an instance in Scanner called input. This scans user input.

        //Prompt User to input the nth term they want printed
        System.out.print("\nEnter the n terms of the Fib sequence you want to see printed : ");
        input = in.nextInt(); //declaring the input variable

        //Print to console
        System.out.println("Fibonacci sequence : ");

        //Do the while loop
        while (i<input) {

            System.out.print(first + " ");      // Print out the first number with a space after it

            next = first + second;             // Variable next becomes first number + second number
            first = second;                    // First variable becomes second number
            second = next;                     // Second variable becomes next number

            i++; //iterate the counter forward
        }

    }
}