// Author : Kyle Ray
// Date : January 27, 2026
// Purpose : Print a code that inputs a name and age and prints to console

import java.util.Scanner; // import the Scanner module
public class TheScannerBug {
    public static void main(String[] args) { // This goes in every program

        //declare varaibles

        int age; // declare age an integer
        String name; // declare name a String
        Scanner in = new Scanner(System.in); // Declare and assign Scanner

        // prompt user and get the values
        System.out.print("What is your age? ");
        age = in.nextInt(); // assigning variable name to be input from keyboard and nextInt() waits for the user to type
        // and reads only integers, stops as soon as it hits something thats not a number, returns an int value
        in.nextLine(); // read the newline, This is required, or the program will run, but with an error..
        System.out.print("What is your name? ");
        name = in.nextLine(); // assigning variable name to be input from keyboard and nextLine() waits for the user to
            // type and reads everythingo nt aht line, stops when the user presses enter, and returns it as a String.45
        System.out.printf("Hello %s, age %d\n", name, age); // System = Java built in system stuff. out is the output
            // stream which is our console. This means print to the screen.
            // .printf means print with formatting.
            // "Hello %s, age %d", this is a "template" for what will be printed.
                // Hello --> prints exactly this text
                // %s --> placeholder for a string
                //, age --> prints exactly this text
                // %d ---> placeholder for an integer (int)
                // \n ---> new line)
            // So this template means : Hello [String], age [int] then go to a new line
            // The comma separated values after the string name and age
                // %s gets replaced by name
                // %d gets replaced by age
    }

}