package ElectricBillCalculator;

import java.util.Scanner;

public class ElectricBillCalculator {

	public static void main(String[] args) {
		
		// Create a new scanner object to take user input
	    Scanner sc = new Scanner(System.in);
	    
	    // Prompt the user to enter the wattage of their device and store it in the 'watts' variable
	    System.out.print("Please Enter the Wattage of Your Device: ");
	    float watts = sc.nextFloat();
	    
	    // Prompt the user to enter the number of hours per day the device runs and store it in the 'hours' variable
	    System.out.print("How Many Hour's in a Day Does it Run? ");
	    float hours = sc.nextFloat();
	    
	    // Prompt the user to enter the electric rate per kilowatt per hour and store it in the 'cents_kwh' variable
	    System.out.print("How Much is Your Electric Rate Per Kilowatt an Hour in Cents? ");
	    float cents_kwh = sc.nextFloat();
	    
	    // Calculate the monthly cost by multiplying the wattage by hours, dividing by 1000, multiplying by the electric rate per kwh, and multiplying by 30
	    float monthly = watts * hours / 1000 * cents_kwh * 30;
	    
	    // Print the monthly cost to the nearest second decimal place
	    System.out.printf("You Will Pay Monthly $%.2f More on Your Electric Bill%n", monthly);
	    
	    // Close the scanner object
	    sc.close();
	
	}
}
