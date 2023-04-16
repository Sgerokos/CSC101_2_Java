package fahrenheitToCelsiusfahrenheitToCelsius;

import java.util.Scanner;

public class fahrenheitToCelsius {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Prompt user to enter temperature in Fahrenheit
        System.out.print("Please Enter the Temperature in Fahrenheit: ");

        // Read user input as a floating-point number and cast to float
        float fahrenheit = (float) input.nextDouble();

        // Convert Fahrenheit to Celsius using formula: (F - 32) / 1.8
        float celsius = (fahrenheit - 32) / 1.8f;

        // Display the temperature in Celsius
        System.out.println("The Temperature in Celsius is: " + celsius);
	}
}