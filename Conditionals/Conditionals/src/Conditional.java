import java.util.Scanner; // Load The java scanner

public class Conditional {

    /*
    // ------------------------------
    // Procedure #1
    // ------------------------------

    public static void main(String[] args) {
        checkNumber();

        greatestNumber();
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
        }
        else {
            System.out.print("The number you input is Negative\n");
        }

        // Figure out if the number is odd or even by calling method isOdd
        if (isOdd(num) == true) {
            System.out.println("The number that you input is Odd.");
        }
        else {
            System.out.println("The number you input is Even");
        }
    }

    // Method to determine if the number is positive or negative.
    public static boolean isPositive(int num) {
        return num > 0; // This is the same thing as doing an if statement (see CH 5 - Boolean Methods Section)
    }

    // Method to determine if the number is odd or even.
    public static boolean isOdd(int num) {
        return num % 2 !=0; // This is the same thing as doing an if statement (see CH 5 - Boolean Methods Section)
    }

    // ------------------------------
    // Procedure #3
    // ------------------------------

    public static void greatestNumber() {

        // Declare variables
        int a,b,c,largest;

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

        if (a >=b && a>=c) {
            largest = a;
        }
        else if (b >= a && b >=c) {
            largest = b;
        }
        else {
            largest = c;
        }

        System.out.print("The largest number of your input is : " + largest);

    }

    */

    // ------------------------------
    // Procedure #4
    // ------------------------------

    public static void main(String[] args) {

        //Initialize the Scanner.
        Scanner input = new Scanner(System.in); // Create an instance in Scanner called input. This scans user input.
    }
}