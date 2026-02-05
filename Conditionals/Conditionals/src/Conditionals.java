import java.util.Scanner; // import the Java Scanner

public class Conditionals {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // #2 Positive/Negative + Odd/Even
        checkNumber();

        // #3 Greatest of three numbers
        int g = greatestNumber();
        System.out.println("The greatest number is " + g);

        // #4 Floating number classification
        Size();

        // #5 Day of week
        weekdayProgram();

        System.out.println("That's All Folks!");
    }

    // ------------------------------
    // #2 Procedure
    // ------------------------------
    public static void checkNumber() {
        System.out.print("Enter an integer: ");
        int num = input.nextInt();

        if (isPositive(num))
            System.out.print("Positive and ");
        else
            System.out.print("Negative and ");

        if (isOdd(num))
            System.out.println("odd.");
        else
            System.out.println("even.");
    }

    public static boolean isPositive(int num) {
        return num >= 0;
    }

    public static boolean isOdd(int num) {
        return num % 2 != 0;
    }

    // ------------------------------
    // #3 Procedure
    // ------------------------------
    public static int greatestNumber() {
        System.out.print("Enter first number: ");
        int a = input.nextInt();

        System.out.print("Enter second number: ");
        int b = input.nextInt();

        System.out.print("Enter third number: ");
        int c = input.nextInt();

        int max = a;

        if (b > max) max = b;
        if (c > max) max = c;

        return max;
    }

    // ------------------------------
    // #4 Procedure (Size class behavior)
    // ------------------------------
    public static void Size() {
        System.out.print("Enter a floating-point number: ");
        double num = input.nextDouble();

        if (num == 0) {
            System.out.println("zero");
            return;
        }

        if (num > 0)
            System.out.print("positive ");
        else
            System.out.print("negative ");

        double abs = Math.abs(num);

        if (abs < 1)
            System.out.println("small");
        else if (abs > 1_000_000)
            System.out.println("large");
        else
            System.out.println();
    }

    // ------------------------------
    // #5 Procedure
    // ------------------------------
    public static void weekdayProgram() {
        System.out.print("Enter a number (1-7): ");
        int day = input.nextInt();

        System.out.println(getWeekDay(day));
    }

    public static String getWeekDay(int day) {
        switch (day) {
            case 1: return "Sunday";
            case 2: return "Monday";
            case 3: return "Tuesday";
            case 4: return "Wednesday";
            case 5: return "Thursday";
            case 6: return "Friday";
            case 7: return "Saturday";
            default: return "Invalid day";
        }
    }
}
