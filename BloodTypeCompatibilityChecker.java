package BloodTypeCompatibilityChecker;

import java.util.Scanner;

public class BloodTypeCompatibilityChecker {

	public static void main(String[] args) {
		
		// create scanner object for user input
		Scanner input = new Scanner(System.in); 
		
		// Prints a hello and welcomes the user to doner match
	    System.out.println("Hello");
	    System.out.println("Welcome to the Donor Match Program");

	    // Requests the user to input the type of blood they have 
	    // The input can be A+. A-, B+, B-, O+, O-, AB+, AB-
	    System.out.print("\nPlease Input The Donor's Blood Type." 
	                       + "You May Enter A+, A-, B+, B-, O+, O-, AB+, AB-: ");
	    String blood_Type = input.nextLine(); // get user input for donor's blood type
	    
	    // If the user chooses one of the selected blood types 
	    // The user will be asked to input the recipient's blood type
	    if (blood_Type.equals("A+")) {
	        System.out.println("\nYou Input A+.");
	        
	        // This line will ask for the recipient's blood type
	        System.out.print("\nPlease Input The Recipient's Blood Type." 
	                             + "You May Enter A+, A-, B+, B-, O+, O-, AB+, AB-: ");
	        String recipient_Blood_type = input.nextLine(); // get user input for recipient's blood type
	        
	        // Once the recipient's blood type is entered 
	        // it will print if it is compatible or not lines 22-44 will determine this
	        if (recipient_Blood_type.equals("A+")) {
	            System.out.println("A+ And A+ Are Compatible");
	        } else if (recipient_Blood_type.equals("A-")) {
	            System.out.println("A+ And A- Are Not Compatible");
	        } else if (recipient_Blood_type.equals("B+")) {
	            System.out.println("A+ And B+ Are Not Compatible");
	        } else if (recipient_Blood_type.equals("B-")) {
	            System.out.println("A+ And B- Are Not Compatible");
	        } else if (recipient_Blood_type.equals("O+")) {
	            System.out.println("A+ And O+ Are Not Compatible");
	        } else if (recipient_Blood_type.equals("O-")) {
	            System.out.println("A+ And O- Are Not Compatible");
	        } else if (recipient_Blood_type.equals("AB+")) {
	            System.out.println("A+ And AB+ Are Compatible");        
	        } else if (recipient_Blood_type.equals("AB-")) {
	            System.out.println("A+ And AB- Are Not Compatible");
	        } else {
	        	
	        
	            // If anything besides the listed blood types is typed in 
	            // An error message will print and will explain to the user what to type in   
	            System.out.println("Sorry Wrong Input Please Input A+, A-, B+, B-, O+, O-, AB+, AB-");
	        }
	        
	    } else if (blood_Type.equals("A-")) {
	        System.out.println("\nYou Input A-.");
	        
	        // This line will ask for the recipient's blood type
	        System.out.print("\nPlease Input The Recipient's Blood Type." 
	                             + "You May Enter A+, A-, B+, B-, O+, O-, AB+, AB-: ");
	        
	        // get user input for recipient's blood type
	        String recipient_Blood_type = input.nextLine(); 
	        
	     // Once the recipient's blood type is entered
	     // it will print if it is compatible or not lines 60-82 will determine this
	     if (recipient_Blood_type.equals("A+")) {
	     System.out.println("A- And A+ Are Compatable");
	     } else if (recipient_Blood_type.equals("A-")) {
	     System.out.println("A- And A- Are Compatable");
	     } else if (recipient_Blood_type.equals("B+")) {
	     System.out.println("A- And B+ Are Not Compatable");
	     } else if (recipient_Blood_type.equals("B-")) {
	     System.out.println("A- And B- Are Not Compatable");
	     } else if (recipient_Blood_type.equals("O+")) {
	     System.out.println("A- And O+ Are Not Compatable");
	     } else if (recipient_Blood_type.equals("O-")) {
	     System.out.println("A- And O- Are Not Compatable");
	     } else if (recipient_Blood_type.equals("AB+")) {
	     System.out.println("A- And AB+ Are Compatable");
	     } else if (recipient_Blood_type.equals("AB-")) {
	     System.out.println("A- And AB- Are Not Compatable");
	     } else {
	     System.out.println("Sorry Wrong Input Please Input A+, A-, B+, B-, O+, O-, AB+, AB-");
	     }

	     } else if (blood_Type.equals("B+")) {
	     System.out.println("\nYou Input B+.");
	     
	  // This line will ask for the recipient's blood type
	     System.out.print("\nPlease Input The Recipient's Blood Type. " 
	                      + "You May Enter A+, A-, B+, B-, O+, O-, AB+, AB-: ");
	     String recipient_Blood_type = input.nextLine();

	     // Once the recipient's blood type is entered 
	     // it will print if it is compatible or not lines 97-119 will determine this    
	     if (recipient_Blood_type.equals("A+")) {
	         System.out.println("B+ And A+ Are Not Compatable");
	     } else if (recipient_Blood_type.equals("A-")) {
	         System.out.println("B+ And A- Are Not Compatable");
	     } else if (recipient_Blood_type.equals("B+")) {
	         System.out.println("B+ And B+ Are Compatable");
	     } else if (recipient_Blood_type.equals("B-")) {
	         System.out.println("B+ And B- Are Not Compatable");
	     } else if (recipient_Blood_type.equals("O+")) {
	         System.out.println("B+ And O+ Are Not Compatable");
	     } else if (recipient_Blood_type.equals("O-")) {
	         System.out.println("B+ And O- Are Not Compatable");
	     } else if (recipient_Blood_type.equals("AB+")) {
	         System.out.println("B+ And AB+ Are Compatable");        
	     } else if (recipient_Blood_type.equals("AB-")) {
	         System.out.println("B+ And AB- Are Not Compatable");
	     } else {
	         System.out.println("Sorry Wrong Input Please Input A+, A-, B+, B-, O+, O-, AB+, AB-");
	     }    
	     
	     } else if (blood_Type.equals("B-")) {
	    	 System.out.println("\nYou Input B-.");
	    	
	    	// This line will ask for the donor's blood type
	    	 System.out.print("Please Input The Donor's Blood Type. " 
	    	                  + "You May Enter A+, A-, B+, B-, O+, O-, AB+, or AB-: ");

	    	 // This line will read the input from the user
	    	 String donor_Blood_type = input.nextLine();

	    	 // This line will print the donor's blood type
	    	 System.out.println("\nDonor Blood Type: " + donor_Blood_type);

	    	 // This line will ask for the recipient's blood type
	    	 System.out.print("\nPlease Input The Recipient's Blood Type. " 
	    	                  + "You May Enter A+, A-, B+, B-, O+, O-, AB+, or AB-: ");

	    	 // This line will read the input from the user
	    	 String recipient_Blood_type = input.nextLine();

	    	 // This block of code will determine if the recipient's blood type is compatible with the donor's blood type
	    	 if (recipient_Blood_type.equals("A+") && (donor_Blood_type.equals("A+") || donor_Blood_type.equals("AB+"))) {
	    	     System.out.println("The donor's blood type is compatible with the recipient's blood type.");
	    	 } else if (recipient_Blood_type.equals("A-") && (donor_Blood_type.equals("A+") || donor_Blood_type.equals("A-") || donor_Blood_type.equals("AB+") || donor_Blood_type.equals("AB-"))) {
	    	     System.out.println("The donor's blood type is compatible with the recipient's blood type.");
	    	 } else if (recipient_Blood_type.equals("B+") && (donor_Blood_type.equals("B+") || donor_Blood_type.equals("AB+"))) {
	    	     System.out.println("The donor's blood type is compatible with the recipient's blood type.");
	    	 } else if (recipient_Blood_type.equals("B-") && (donor_Blood_type.equals("B+") || donor_Blood_type.equals("B-") || donor_Blood_type.equals("AB+") || donor_Blood_type.equals("AB-"))) {
	    	     System.out.println("The donor's blood type is compatible with the recipient's blood type.");
	    	 } else if (recipient_Blood_type.equals("O+") && (donor_Blood_type.equals("A+") || donor_Blood_type.equals("B+") || donor_Blood_type.equals("O+") || donor_Blood_type.equals("AB+"))) {
	    	     System.out.println("The donor's blood type is compatible with the recipient's blood type.");
	    	 } else if (recipient_Blood_type.equals("O-") && (donor_Blood_type.equals("A+") || donor_Blood_type.equals("A-") || donor_Blood_type.equals("B+") || donor_Blood_type.equals("B-") || donor_Blood_type.equals("O+") || donor_Blood_type.equals("O-") || donor_Blood_type.equals("AB+") || donor_Blood_type.equals("AB-"))) {
	    	     System.out.println("The donor's blood type is compatible with the recipient's blood type.");
	    	 } else if (recipient_Blood_type.equals("AB+") && donor_Blood_type.equals("AB+")) {
	    	     System.out.println("The donor's blood type is compatible with the recipient's blood type.");
	    	 } else if (recipient_Blood_type.equals("AB-") && (donor_Blood_type.equals("AB+") || donor_Blood_type.equals("AB-"))) {
	    	     System.out.println("The donor's blood type is compatible with the recipient's blood type.");
	    	 } else {
	    	 System.out.println("The donor's blood type is not compatible with the recipient's blood type.");
	    	 }

	    	 // This line will close the Scanner object
	    	 input.close();

	    	 // End of the program
	    	 System.out.println("\nThank you for using the blood type compatibility checker.");
	    	 
	     }
    }
}   