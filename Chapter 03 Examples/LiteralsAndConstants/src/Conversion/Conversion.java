// Kyle Ray
// January 27, 2026
// Description : Input a measurement in inches, convert to cm, and then display the results.

package Conversion; // defining a package

import java.util.Scanner; //importing a scanner class

public class Conversion { //define a class

	public static void main(String[] args) { //same thing on every class, first thing we do.
		
		//declare and define variables
		int inch; // Variable declaration
		double cm; // Variable declaration
		Scanner in = new Scanner(System.in); // Create the Scanner.
		final double CM_PER_INCH = 2.54; // declaring a variable with final in front of it allows this variable to never be re-defined and set as a constant
		// By convention, names for constants are all uppercase, with the underscore character (_) between words.
		//Variable Assignment
		
		System.out.print("How many inches? ");
		inch = in.nextInt(); // Assign variable inch
		
		cm = inch * CM_PER_INCH; // Conversion
		System.out.print(inch + " in = ");
		System.out.println(cm + " cm");

	}

}
