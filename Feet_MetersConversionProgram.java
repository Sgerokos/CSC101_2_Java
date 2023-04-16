package Feet_MetersConversionProgram;

import java.util.Scanner;

public class Feet_MetersConversionProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter length in feet
	    System.out.print("Please Enter the Value for Feet: ");

	    // Read user input as a floating-point number
	    float feet = input.nextFloat();

	    // Convert feet to meters using formula: feet * 0.305
	    float meters = feet * 0.305f;

	    // Display the length in feet and its equivalent in meters
	    System.out.println(feet + " Feet Are " + meters + " In Meters");
	}
}
