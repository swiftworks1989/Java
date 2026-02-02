// Author : Kyle Ray
// Date : 02/01/26
// Project : The goal of this exercise is to create an interactive greeter.

import java.util.Scanner; // import the Scanner module.

public class InteractiveGreeter {
    public static void main(String[] args) {

        // declare variables
        String nameIn; // This is the variable the user inputs for their name
        String locationIn; // This is the variable the user inputs for their location
        int ageIn; // This is the variable the user inputs for their age
        String activityIn;// This is the variable the user inputs for Activity In
        double moneyIn; //This is the variable the user inputs for money In

        // Scanner Code & Declare Variables for scanner
        Scanner in_name = new Scanner(System.in); // Declare and assign Scanner
        Scanner in_location = new Scanner(System.in); // Declare and assign Scanner
        Scanner in_age = new Scanner(System.in); // Declare and assign Scanner
        Scanner in_activity = new Scanner(System.in); // Declare and assign Scanner
        Scanner in_money = new Scanner(System.in); // Declare and assign Scanner

        //prompt user and get the value
        System.out.print("What is your name ?");
        nameIn = in_name.nextLine(); // Assign the user input to the variable. in ,means read the keyboard. nextLine() reads up to Enter being pressed
        System.out.print("Where are you from ?");
        locationIn = in_location.nextLine(); // Assign the user input to the variable. in ,means read the keyboard. nextLine() reads up to Enter being pressed
        System.out.print("How old are you (years) ?");
        ageIn = in_age.nextInt(); // Assign the user input to the variable. in ,means read the keyboard. nextLine() reads up to Enter being pressed

        //Print Out name, where they are from and how old they are based on their input
        System.out.println("Hello " + nameIn + " from " + locationIn + "." + " You are " + ageIn + " years old.");

        //prompt user and get the values
        System.out.print("What's something you like to do? : ");
        activityIn = in_activity.nextLine(); // Assign the user input to the variable. in ,means read the keyboard. nextLine() reads up to Enter being pressed

        //Print out a response
        System.out.println("Have fun the next time you " + activityIn + ".");

        //prompt user and get the values
        System.out.print("How much would you like to donate? : ");
        moneyIn = in_money.nextDouble(); // Assign the user input to the variable. in ,means read the keyboard. nextLine() reads up to Enter being pressed

        //Print out a response
        System.out.println("You will donate $" + moneyIn + " today. Yay!");
    }
}