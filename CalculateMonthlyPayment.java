package CalculateMonthlyPayment;

import java.util.Scanner;

public class CalculateMonthlyPayment {

	public static void main(String[] args) {
		// create Scanner object
		Scanner input = new Scanner(System.in);
		
		// The variable balance ask's the user to input the balance they wish to calculate
	    System.out.print("Please Enter The Balance You Wish to Calculate: ");
	    double balance = input.nextDouble();

	    // The variable annualInterestRate ask's the user to input the annual interest
	    System.out.print("Please Enter The Annual Interest Rate Percentage: ");
	    double annualInterestRate = input.nextDouble();

	    // The variable interest calculates the balance and annual interest
	    double interest = balance * annualInterestRate / 1200;

	    // Print's the interest calcualted to the 5th decimal number
	    System.out.printf("The Annual Interest Rate is: %.5f", interest);
	}
}
