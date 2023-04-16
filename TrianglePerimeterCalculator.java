package TrianglePerimeterCalculator;

import java.util.Scanner;

public class TrianglePerimeterCalculator {

	public static void main(String[] args) {
	    // Creating a scanner object to get user input
	    Scanner scanner = new Scanner(System.in);

	    // Asking the user to input the first side of the triangle
	    System.out.print("Please Enter The First Side of The Triangle: ");
	    double a = scanner.nextDouble();

	    // Asking the user to input the second side of the triangle
	    System.out.print("Please Enter The Second Side of The Triangle: ");
	    double b = scanner.nextDouble();

	    // Asking the user to input the third side of the triangle
	    System.out.print("Please Enter The Third Side of The Triangle: ");
	    double c = scanner.nextDouble();

	    // Exiting if the sum of two sides is less than the third side
	    if (a + b < c || a + c < b || b + c < a) {
	        System.out.println("Two Sides Are Less Than The Third Please Try Again.\nNow Exiting!!!");
	        System.exit(0);
	    }

	    // Calculating the perimeter of the triangle
	    double p = a + b + c;

	    // Displaying the perimeter of the triangle
	    System.out.println("The Perimeter is " + p);

	    // Closing the scanner
	    scanner.close();
	}
}
