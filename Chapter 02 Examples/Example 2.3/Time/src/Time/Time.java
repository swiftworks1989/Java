package Time; // (A package in Java is a mechanism for organizing related classes, interfaces, enumerations and annotations into a single, modular unit. It functions like a folder or directory in a file system, providing a structured way to manage large codebases.)

public class Time { //A class in Java is a blueprint or template used to create objects. It defines the structure (data and behavior) yhat all objects created from that class will share. The process of creating an object from a class is called instantiation, and each object is a specific instance of that class.)

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

		//declare variables
		int 
			hour,
			minute,
			second
			;

		double  
			NumberOfSecondsSinceMidnight,
			NumberOfSecondsRemainingInDay,
			percentage,
			CurrentSeconds,
			CurrentHour, 
			CurrentMinute, 
			CurrentSecond,
			ElapsedTime
			;
		
		
		//define int variables
		hour = 23;
		minute = 17; 
		second = 50;
		
		//Current Time 11:50:01 PM for #6
		
		//define float variables.
		NumberOfSecondsSinceMidnight = (hour*3600) + (minute*60) + second; // calculate the number of seconds since midnight, 3600 seconds in 1 hours, 60 seconds in 1 minute
		NumberOfSecondsRemainingInDay = (24*3600) - NumberOfSecondsSinceMidnight;
		percentage = (NumberOfSecondsSinceMidnight/(NumberOfSecondsSinceMidnight + NumberOfSecondsRemainingInDay)*100);
		
		CurrentHour = 23;
		CurrentMinute = 50;
		CurrentSecond = 01;
		
		CurrentSeconds = (CurrentHour*3600) + (CurrentMinute*60) + CurrentSecond;
		
		ElapsedTime = CurrentSeconds - NumberOfSecondsSinceMidnight;
		
		//Print The Values
		
		System.out.println("The number of seconds since midnight is : " + (int) NumberOfSecondsSinceMidnight); // can get rid of floating # by defining it as an int in the print statement
		System.out.println("The number of seconds remaining to midnight is : " + (int) NumberOfSecondsRemainingInDay); // can get rid of floating # by defining it as an int in the print statement
		System.out.println("The percentage of the day that is complete is : " + (String.format("%.2f", percentage)) + "%."); // can round by using string.format in the print statement)
		System.out.println("The number of seconds right now is : " + (int) CurrentSeconds); // can get rid of floating # by defining it as an int in the print statement
		System.out.println("The number of seconds it took to do this project is : " + (int) ElapsedTime); // can get rid of floating # by defining it as an int in the print statement
		
	}

}
