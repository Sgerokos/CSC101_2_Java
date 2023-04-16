package PoundstoKilogramsConverter;

import java.util.Scanner;

public class PoundstoKilogramsConverter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter weight in pounds
	    System.out.print("Please Enter Weight to be Converted in Pounds: ");

	    // Read user input as a floating-point number
	    float lbs = input.nextFloat();

	    // Convert pounds to kilograms using formula: pounds * 0.454
	    float kgs = lbs * 0.454f;

	    // Display the weight in kilograms rounded to the 3rd decimal place
	    System.out.println("The Weight in Kilograms is " + String.format("%.3f", kgs) + " kgs");
	}
}
