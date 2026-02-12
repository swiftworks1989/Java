public class Loops {

    public static void main (String args[]) {
        sumOfForNumbers();
        sumOfWhileNumbers();

    }
    public static void sumOfForNumbers() {

        // Declare Variables
        int i;
        int sum;

        //Assign Variables
        sum = 0;

        // Run the for loop
        for (i = 0 ; i <= 10 ; i++)

            sum = sum + i;

        System.out.println("The sum of the first ten natural numbers is : " + sum);
    }


public static void sumOfWhileNumbers() {

    // Declare Variables
    int i;
    int sum;

    //Assign Variables
    sum = 0;
    i = 0;

    // Run the while loop
    while (i<10) {
        i++; // add 1 to i
        sum = sum + i; // Take the previous sum and make it sum + the new number

    }

    System.out.println("The sum of the first ten natural numbers is : " + sum);

}
}