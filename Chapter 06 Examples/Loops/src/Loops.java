public class Loops {

    public static void main() {

        countdown(3); // Call the countdown method and define an input variable as 3 into the method.
    }

    public static void countdown(int n) { //The reason that parameters are int n is so that this method can be called.
                                            // It is declaring a variable n, but the assignment comes from outside of
                                            // this method.
        while (n > 0) {
            System.out.println(n); // First print out the number input by the other method calling this. (see above main).
            n = n - 1; // Reduce and redefine n by 1 until it hits the criteria in the while loop.
        }
        System.out.println("Blastoff!"); // Once the while loop is done, print blast off

}
        }