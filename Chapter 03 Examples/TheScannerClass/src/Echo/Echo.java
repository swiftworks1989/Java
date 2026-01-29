package Echo; // defining a package

import java.util.Scanner; //importing a scanner class

public class Echo { //define a class

	public static void main(String[] args) { //same thing on every class, first thing we do.
		String line; //Declare and assign a variable with type string, assigned as line.
		Scanner in = new Scanner(System.in); // In is your Scanner object, think of in as : "The Scanner that is listening to the keyboard."
		//Scanner is a class in Java, that lives in java.util.Scanner. Its job is to read input and turn it into useful data.
		//in is just the name I am giving the Scanner object, could be called scanner, or input, or keyboard, or anything.
		//new Scanner(System.in)
			//new creates a new object in memory, This is where the Scanner actually comes into existence. Without new, nothing is created.
			//System is a built-in Java Class and it gives access to system-level stuff
			//in is an input stream (the keyboard). So System.in is the input from the keyboard
		
		System.out.println(System.out);
		
		System.out.println("Type something: ");
		line = in.nextLine(); //Defining the variable line. In is a variable that holds a scanner object. 
		System.out.println("You said: " + line);
		
		System.out.println("Type something else: ");
		line = in.nextLine();
		System.out.println("You said: " + line);

	}

}
