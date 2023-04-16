package BMICalculator;

import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// The variable lbs ask's the user to input the weight in pounds
		System.out.print("Please Enter Weight in Pounds: ");
		double lbs = input.nextDouble();

		// The variable height ask's the user to input height in inches
		System.out.print("Please Enter Height in Inches: ");
		double height = input.nextDouble();

		// The variable kgs is set to the variable lbs multiplied by 0.454 to calculate the output
		double kgs = lbs * 0.45359237;

		// The variable meters is set to the variable lbs multiplied by 0.454 to calculate the output
		double meters = height * 0.0254;

		// The variable bmi is set to the variable kgs divided by the square of meters
		double bmi = kgs / Math.pow(meters, 2);

		// Print's the variable bmi calculated
		System.out.println("Your BMI is: " + String.format("%.4f", bmi));
	}
}