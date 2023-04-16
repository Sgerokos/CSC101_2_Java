package EmployeePaycheckCalculator;

import java.util.Scanner;

public class EmployeePaycheckCalculator {

	public static void main(String[] args) {
	    
	    // Creating an object of Scanner class to get input from the user
	    Scanner scanner = new Scanner(System.in);
	    
	    // Request the user to input the employee's name
	    System.out.print("Please Enter The Employee's Name: ");
	    String employeeName = scanner.nextLine();
	    
	    // Request the user to input number of hours the employee worked
	    System.out.print("Please Enter The Number of Hours Worked in a Week: ");
	    float hoursWorked = scanner.nextFloat();
	    
	    // If the hours are zero or less than zero a message will prompt telling the user wrong input
	    if (hoursWorked <= 0) {
	        System.out.println("Sorry You Have Entered a Wrong Input");
	    }
	    else {
	        // Request the user to input hourly pay rate
	        System.out.print("Please Enter Hourly Pay Rate: ");
	        float payRate = scanner.nextFloat();
	        
	        // If the pay rate is zero or less than zero a message will prompt telling the user wrong input
	        if (payRate <= 0) {
	            System.out.println("Sorry You Have Entered a Wrong Input");
	        }
	        else {
	            // Request the user to input federal tax withholding rate
	            System.out.print("Please Enter Federal Tax Withholding Rate: ");
	            float fedTax = scanner.nextFloat();
	            
	            // If the federal tax is zero or less than zero a message will prompt telling the user wrong input
	            if (fedTax <= 0) {
	                System.out.println("Sorry You Have Entered a Wrong Input");
	            }
	            else {
	                // Request the user to input state tax withholding rate
	                System.out.print("Please Enter State Tax Withholding Rate: ");
	                float stateTax = scanner.nextFloat();
	                
	                // If the state tax is zero or less than zero a message will prompt telling the user wrong input
	                if (stateTax <= 0) {
	                    System.out.println("Sorry You Have Entered a Wrong Input");
	                }
	                else {
	                    // Calculate gross pay by multiplying hours worked by pay rate
	                    float grossPay = hoursWorked * payRate;
	                    
	                    // Calculate federal withholdings by multiplying gross pay by federal tax
	                    float fedWith = grossPay * fedTax;
	                    
	                    // Calculate state withholdings by multiplying gross pay by state tax
	                    float stateWith = grossPay * stateTax;
	                    
	                    // Calculate total deductions by adding state withholdings and federal withholdings
	                    float totalDeductions = stateWith + fedWith;
	                    
	                    // Calculate net pay by subtracting gross pay by total deductions
	                    float netPay = grossPay - totalDeductions;
	                    
	                    // Print out the results
	                    System.out.println("The Employee's Name is: " + employeeName);
	                    System.out.println("The Number of Hours Worked is: $" + hoursWorked);
	                    System.out.println("The Employee's Pay Rate is: $" + payRate);
	                    System.out.println("The Federal Tax Withholding Rate is: $" + fedTax);
	                    System.out.println("The State Tax is: $" + stateTax);
	                    System.out.println("Deductions Are:");
	                    System.out.println("\t Federal Withholding: $" + fedWith);
	                    System.out.println("\t State Withholding: $" + stateWith);
	                    System.out.println("\t Total Deduction: $" + totalDeductions);
	                    System.out.println("Net Pay: $" + netPay);
	                }
	            }
	        }
	    }
	}
}
