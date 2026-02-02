// Author : Kyle Ray
// Date : 02/02/26
// Project : The goal of this exercise is to create a temperature conversion program.

import java.util.Scanner; //Import the Scanner Module

public class TemperatureConversion {
        public static void main (String[] args) {

            //declare String variables.
            double farhrenheitIn, celsius, kelvin;
            final double conversionFahrenheitToCelsius;
            final double conversionCelsiusToKelvin;

            //Bring in Scanner Code and declare varibles.
            Scanner user_input = new Scanner(System.in); // Create an instance in Scanner called input. This scans user input.

            //Prompt User to input Temperature in °F
            System.out.print("Enter the temperature in Farenheit : ");
            farhrenheitIn = user_input.nextDouble();

            //Conversions

                //F to C Conversion and print it.
                conversionFahrenheitToCelsius = (farhrenheitIn-32.0)*(5.0/9.0); // have to have .0 b/c otherwise 0.0 is answer.
                celsius = conversionFahrenheitToCelsius;
                    //%.2f is rounded to 2 decimal places.
                    //%n is new line after.

                //C to K Conversion and print it.
                conversionCelsiusToKelvin = celsius + 273.15;
                kelvin = conversionCelsiusToKelvin;

            //End Conversions

            //Print To Console
            System.out.printf("The temperature in Celsius is : %.2f%n", + celsius);
            System.out.printf("The temperature in Kelvin is : %.2f", + kelvin);
        }
}
