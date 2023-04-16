package ElectricBillCalculatorwithUserInputVerification;

import java.util.Scanner;

public class ElectricBillCalculatorwithUserInputVerification {

	public static void main(String[] args) {
	    
	    // Creating an object of Scanner class to get input from the user
	    Scanner scanner = new Scanner(System.in);
	    
	    // Ask the user to input the number of watts the device uses
	    System.out.print("Please Enter the Wattage of Your Device: ");
	    float watts = scanner.nextFloat();
	    
	    // Ask the user if the input was correct y for Yes n for No
	    System.out.print("The Device's Wattage is " + watts + " Correct? Type y for Yes or n for No: ");
	    String yesNo = scanner.next();
	    
	    // If the input was not correct
	    if (yesNo.equals("n")) {
	        
	        // Re-ask the user for the input
	        System.out.print("Please Enter the Wattage of Your Device: ");
	        watts = scanner.nextFloat();
	        
	        // Ask the user to input the number of hours the device will be on in a day
	        System.out.print("How Many Hour's in a Day Does it Run? ");
	        float hours = scanner.nextFloat();
	        
	        // Ask the user to input the electric rate in cents per kilowatt per hour
	        System.out.print("How Much is Your Electric Rate Per Kilowatt an Hour in Cents? ");
	        float centsPerKWh = scanner.nextFloat();
	        
	        // Calculate the monthly rate by multiplying watts by the number of hours divided by 1000 
	        // multiplied by cents_per_kwh multiplied by 30
	        float monthly = watts * hours / 1000 * centsPerKWh * 30;
	        
	        // Print the monthly rate by rounding it to the nearest second decimal
	        System.out.println("You Will Pay Monthly $" + Math.round(monthly * 100.0) / 100.0 
	                           + " More on Your Electric Bill");
	        
	    } else {
	        
	        // Ask the user to input the number of hours the device will be on in a day
	        System.out.print("How Many Hour's in a Day Does it Run? ");
	        float hours = scanner.nextFloat();
	        
	        // Ask the user if the input was correct y for Yes n for No
	        System.out.print("The Device Will be Running for " + hours 
	                         + " in a Day Correct? Type y for Yes or n for No: ");
	        yesNo = scanner.next();
	        
	        // If the input was not correct
	        if (yesNo.equals("n")) {
	            
	            // Re-ask the user for the input
	            System.out.print("Please Re-Enter How Many Hour's in a Day Does it Run? ");
	            hours = scanner.nextFloat();
	            
	            // Ask the user to input the electric rate in cents per kilowatt per hour
	            System.out.print("How Much is Your Electric Rate Per Kilowatt an Hour in Cents? ");
	            float centsPerKWh = scanner.nextFloat();
	            
	            // Calculate the monthly rate by multiplying watts by the number of hours divided by 1000 
	            // multiplied by cents_per_kwh multiplied by 30
	            float monthly = watts * hours / 1000 * centsPerKWh * 30;
	            
	            // Print the monthly rate by rounding it to the nearest second decimal
	            System.out.println("You Will Pay Monthly $" + Math.round(monthly * 100.0) / 100.0 
	                               + " More on Your Electric Bill");
	       } else {
	        
	    	// Ask the user to input the electric rate in cents per kilowatt per hour
	           System.out.print("How Much is Your Electric Rate Per Kilowatt an Hour in Cents? ");
	           float centsPerKWh = scanner.nextFloat();
	           
	           // Ask the user if the input was correct y for Yes n for No
	           System.out.print("Your Electric Rate Per Kilowatt an Hour is " + centsPerKWh 
	                            + " Correct? Type y for Yes or n for No: ");
	           yesNo = scanner.next();
	           
	           // If the input was not correct
	           if (yesNo.equals("n")) {
	               
	               // Re-ask the user for the input
	               System.out.print("Please Re-Enter Your Electric Rate Per Kilowatt an Hour in Cents? ");
	               centsPerKWh = scanner.nextFloat();
	               
	               // Calculate the monthly rate by multiplying watts by the number of hours divided by 1000 
	               // multiplied by cents_per_kwh multiplied by 30
	               float monthly = watts * hours / 1000 * centsPerKWh * 30;
	               
	               // Print the monthly rate by rounding it to the nearest second decimal
	               System.out.println("You Will Pay Monthly $" + Math.round(monthly * 100.0) / 100.0 
	                                  + " More on Your Electric Bill");            

	           } else {
	               
	               // Calculate the monthly rate by multiplying watts by the number of hours divided by 1000 
	               // multiplied by cents_per_kwh multiplied by 30
	               float monthly = watts * hours / 1000 * centsPerKWh * 30;

	               // Print the monthly rate by rounding it to the nearest second decimal
	               System.out.println("You Will Pay Monthly $" + Math.round(monthly * 100.0) / 100.0 
	                                  + " More on Your Electric Bill");
	           }
	       }
	   }
	}
}