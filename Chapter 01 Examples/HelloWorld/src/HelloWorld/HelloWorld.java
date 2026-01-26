package HelloWorld; // (A package in Java is a mechanism for organizing related classes, interfaces, enumerations and annotations into a single, modular unit. It functions like a folder or directory in a file system, providing a structured way to manage large codebases.)


public class HelloWorld { //A class in Java is a blueprint or template used to create objects. It defines the structure (data and behavior) yhat all objects created from that class will share. The process of creating an object from a class is called instantiation, and each object is a specific instance of that class.) 

/*
public static void main(String[] args) is the main method signature in Java.  It is the entry point for any stand alone Java application,
	meaning it's the first method called when a Java program starts executing.
public: 
	This access modifier means the method can be accessed from anywhere, which is necessary for the Java Virtual Machine (JVM) 
	to find and execute the method when the program begins.
static:
	This keyword means the method belongs to the class itself rather than to an instance (object) of the class. 
	The JVM can call this method without creating an object of the class first. [1]
void:
	This specifies the method's return type. void means the method does not return any value after it finishes execution.
main: 
	This is the name of the method. It is a predefined, mandatory name that the JVM looks for as the starting point of the program.
(String[] args): 
	This declares a parameter for the method, which is an array of String objects named args. 
	This allows the program to accept command-line arguments when it is executed. [1] 
	The args array can be used within the program to access any input provided by the user at the command line. 

 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!"); //Prints Hello World in the code as a command print out
	}

}
