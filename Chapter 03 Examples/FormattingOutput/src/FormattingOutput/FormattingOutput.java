// Kyle Ray
// January 27, 2026
// Description : FormattingOutput

package FormattingOutput

public class FormattingOutput { //define a class

	public static void main(String[] args) { //same thing on every class, first thing we do.
		
		//declare and define variables
		int inch = 100; // Variable declaration
		double cm; // Variable declaration
		final double CM_PER_INCH = 2.54; // declaring a variable with final in front of it allows this variable to never be re-defined and set as a constant
		// By convention, names for constants are all uppercase, with the underscore character (_) between words. (Constants)
		
		//Variable Assignment
		
		cm = inch * CM_PER_INCH; // Conversion
		System.out.printf("%d in = %f cm\n", inch, cm);
	}

}
