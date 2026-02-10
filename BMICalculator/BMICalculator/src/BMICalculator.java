import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight in pounds: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height in inches: ");
        double height = scanner.nextDouble();

        double bmi = (weight * 703) / (height * height);

        System.out.printf("Your BMI is: %.2f\n", bmi);

        if (bmi < 18.5)
            System.out.println("Category: Underweight");
         else if (bmi < 25)
            System.out.println("Category: Normal weight");
         else if (bmi < 30)
            System.out.println("Category: Overweight");
         else
            System.out.println("Category: Obese");


    }
}