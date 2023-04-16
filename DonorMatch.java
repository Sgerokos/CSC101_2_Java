package DonorMatch;

import java.util.Scanner;

public class DonorMatch {
	
	public static void main(String[] args) {
		
		// create scanner object to get user input
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user for their blood type
        System.out.println("Hello");
        System.out.println("Welcome to the Doner Match Program");
        System.out.print("\nPlease Input Your Blood Type. You May Enter A+, A-, B+, B-, O+, O-, AB+, AB-: ");
        
        // Check the user's input and provide information based on their blood type
        String bloodType = sc.nextLine();

        // Check the user's blood type and provide information accordingly
        if (bloodType.equals("A+")) {
            System.out.println("\nYou Input A+.");
            System.out.print("What Would You Like to Know About This Blood Type? Input 1 For Fact's, 2 to Give Blood, 3 to Recieve Blood: ");
            int info = sc.nextInt();

            // Provide information based on the user's choice
            if (info == 1) {
                System.out.println("You Have Requested 1 For Fact's");
                System.out.println("1 in 3 People are Blood Type A+. This Blood Type is One of The Most Common Blood Types.");
            } else if (info == 2) {
                System.out.println("You Have Requested 2 to Give Blood");
                System.out.println("You Can Give to Anyone With A+, and AB+.");
            } else if (info == 3) {
                System.out.println("You Have Requested 3 to Recieve Blood");
                System.out.println("You Can Recieve From Anyone With A+, A-, O+, O-");
            } else {
                System.out.println("Sorry Wrong Input Please Input 1, 2, or 3 For This Selection");
            }
        } else if (bloodType.equals("A-")) {
            System.out.println("\nYou Input A-.");
            System.out.print("What Would You Like to Know About This Blood Type? Input 1 For Fact's, 2 to Give Blood, 3 to Recieve Blood: ");
            int info = sc.nextInt();

            // Provide information based on the user's choice
            if (info == 1) {
                System.out.println("You Have Requested 1 For Fact's");
                System.out.println("Only 1 in 16 Have Blood Type A-");
            } else if (info == 2) {
                System.out.println("You Have Requested 2 to Give Blood");
                System.out.println("You Can Give to Anyone With A, and AB Regardless of Them Being Negative or Positive");
            } else if (info == 3) {
                System.out.println("You Have Requested 3 to Recieve Blood");
                System.out.println("You Can Recieve From Anyone With A-, O-");
            } else {
                System.out.println("Sorry Wrong Input Please Input 1, 2, or 3 For This Selection");
            }
        } else if (bloodType.equals("B+")) {
            System.out.println("\nYou Input B+.");
            System.out.print("What Would You Like to Know About This Blood Type? Input 1 For Fact's, 2 to Give Blood, 3 to Recieve Blood: ");
            int info = sc.nextInt();

            // Provide information based on the user's choice
            if (info == 1) {
                System.out.println("You Have Requested 1 For Fact's");
                System.out.println("Around 9% of The Population Has Blood Type B+");
            } else if (info == 2) {
            	System.out.println("You Have Requested 2 to Give Blood");
            	System.out.println("You Can Give to Anyone With B+, and AB+.");
            	} else if (info == 3) {
            	System.out.println("You Have Requested 3 to Recieve Blood");
            	System.out.println("You Can Recieve From Anyone With B+, B-, O+, O-");
            	} else {
            	System.out.println("Sorry Wrong Input Please Input 1, 2, or 3 For This Selection");
            	}
            	} else if (bloodType.equals("B-")) {
            	System.out.println("\nYou Input B-.");
            	System.out.print("What Would You Like to Know About This Blood Type? Input 1 For Fact's, 2 to Give Blood, 3 to Recieve Blood: ");
            	int info = sc.nextInt();
            	
            	 // Provide information based on the user's choice
            	 if (info == 1) {
                     System.out.println("You Have Requested 1 For Fact's");
                     System.out.println("Only 2% of The Population Has Blood Type B-");
                 } else if (info == 2) {
                     System.out.println("You Have Requested 2 to Give Blood");
                     System.out.println("You Can Give to Anyone With B, and AB");
                 } else if (info == 3) {
                     System.out.println("You Have Requested 3 to Recieve Blood");
                     System.out.println("You Can Recieve From Anyone With B-, O-");
                 } else {
                     System.out.println("Sorry Wrong Input Please Input 1, 2, or 3 For This Selection");
                 }
             } else if (bloodType.equals("O+")) {
                 System.out.println("\nYou Input O+.");
                 System.out.print("What Would You Like to Know About This Blood Type? Input 1 For Fact's, 2 to Give Blood, 3 to Recieve Blood: ");
                 int info = sc.nextInt();

                 // Provide information based on the user's choice
                 if (info == 1) {
                     System.out.println("You Have Requested 1 For Fact's");
                     System.out.println("Around 40% of The Population Has Blood Type O+");
                 } else if (info == 2) {
                     System.out.println("You Have Requested 2 to Give Blood");
                     System.out.println("You Can Give to Anyone With A, B, AB, and O+");
                 } else if (info == 3) {
                     System.out.println("You Have Requested 3 to Recieve Blood");
                     System.out.println("You Can Recieve From Anyone With O+, and O-");
                 } else {
                     System.out.println("Sorry Wrong Input Please Input 1, 2, or 3 For This Selection");
                 }
             } else if (bloodType.equals("O-")) {
                 System.out.println("\nYou Input O-.");
                 System.out.print("What Would You Like to Know About This Blood Type? Input 1 For Fact's, 2 to Give Blood, 3 to Recieve Blood: ");
                 int info = sc.nextInt();

                 if (info == 1) {
                     System.out.println("You Have Requested 1 For Fact's");
                     System.out.println("Only 7% of The Population Has Blood Type O-");
                 } else if (info == 2) {
                     System.out.println("You Have Requested 2 to Give Blood");
                     System.out.println("You Can Give to Anyone With A, B, AB, and O");
                 } else if (info == 3) {
                     System.out.println("You Have Requested 3 to Recieve Blood");
                     System.out.println("You Can Recieve From Anyone With O-");
                 } else {
                	 System.out.println("Sorry Wrong Input Please Input 1, 2, or 3 For This Selection");
                 }
             } else if (bloodType.equals("O+")) {
                 System.out.println("\nYou Input O+.");
                 System.out.print("What Would You Like to Know About This Blood Type? Input 1 For Fact's, 2 to Give Blood, 3 to Recieve Blood: ");
                 int info = sc.nextInt();

                 // Provide information based on the user's choice
                 if (info == 1) {
                     System.out.println("You Have Requested 1 For Fact's");
                     System.out.println("Around 37% of The Population Has Blood Type O+");
                 } else if (info == 2) {
                     System.out.println("You Have Requested 2 to Give Blood");
                     System.out.println("You Can Give to Anyone With O+, A+, B+, AB+");
                 } else if (info == 3) {
                     System.out.println("You Have Requested 3 to Recieve Blood");
                     System.out.println("You Can Recieve From Anyone With O-, O+, A-, A+");
                 } else {
                     System.out.println("Sorry Wrong Input Please Input 1, 2, or 3 For This Selection");
                 }
             } else if (bloodType.equals("AB+")) {
                 System.out.println("\nYou Input AB+.");
                 System.out.print("What Would You Like to Know About This Blood Type? Input 1 For Fact's, 2 to Give Blood, 3 to Recieve Blood: ");
                 int info = sc.nextInt();

                 if (info == 1) {
                     System.out.println("You Have Requested 1 For Fact's");
                     System.out.println("Only 3% of The Population Has Blood Type AB+");
                 } else if (info == 2) {
                     System.out.println("You Have Requested 2 to Give Blood");
                     System.out.println("You Can Give to Anyone With AB+");
                 } else if (info == 3) {
                     System.out.println("You Have Requested 3 to Recieve Blood");
                     System.out.println("You Can Recieve From Anyone With A-, B-, O-, AB-, A+, B+, O+, AB+");
                 } else {
                     System.out.println("Sorry Wrong Input Please Input 1, 2, or 3 For This Selection");
                 }
             } else
            	 if (bloodType.equals("O+")) {
            		 System.out.println("\nYou Input O+.");
            		 System.out.print("What Would You Like to Know About This Blood Type? Input 1 For Fact's, 2 to Give Blood, 3 to Recieve Blood: ");
            		 int info = sc.nextInt();
            		 if (info == 1) {
            		        System.out.println("You Have Requested 1 For Fact's");
            		        System.out.println("Around 37% of The Population Has Blood Type O+");
            		    } else if (info == 2) {
            		        System.out.println("You Have Requested 2 to Give Blood");
            		        System.out.println("You Can Give to Anyone With O+, A+, B+, AB+.");
            		    } else if (info == 3) {
            		        System.out.println("You Have Requested 3 to Recieve Blood");
            		        System.out.println("You Can Recieve From Anyone With O+, O-");
            		    } else {
            		        System.out.println("Sorry Wrong Input Please Input 1, 2, or 3 For This Selection");
            		    }
            		} else if (bloodType.equals("O-")) {
            		    System.out.println("\nYou Input O-.");
            		    System.out.print("What Would You Like to Know About This Blood Type? Input 1 For Fact's, 2 to Give Blood, 3 to Recieve Blood: ");
            		    int info = sc.nextInt();

            		    if (info == 1) {
            		        System.out.println("You Have Requested 1 For Fact's");
            		        System.out.println("Only 7% of The Population Has Blood Type O-");
            		    } else if (info == 2) {
            		        System.out.println("You Have Requested 2 to Give Blood");
            		        System.out.println("You Can Give to Anyone With A+, A-, B+, B-, AB+, AB-, O+, O-.");
            		    } else if (info == 3) {
            		        System.out.println("You Have Requested 3 to Recieve Blood");
            		        System.out.println("You Can Recieve From Anyone With O-");
            		    } else {
            		        System.out.println("Sorry Wrong Input Please Input 1, 2, or 3 For This Selection");
            		    }
            		} else if (bloodType.equals("AB+")) {
            		    System.out.println("\nYou Input AB+.");
            		    System.out.print("What Would You Like to Know About This Blood Type? Input 1 For Fact's, 2 to Give Blood, 3 to Recieve Blood: ");
            		    int info = sc.nextInt();

            		    if (info == 1) {
            		        System.out.println("You Have Requested 1 For Fact's");
            		        System.out.println("AB+ is the Universal Recipient.");
            		    } else if (info == 2) {
            		        System.out.println("You Have Requested 2 to Give Blood");
            		        System.out.println("You Can Only Give to AB+.");
            		    } else if (info == 3) {
            		        System.out.println("You Have Requested 3 to Recieve Blood");
            		        System.out.println("You Can Recieve From Anyone With A+, A-, B+, B-, O+, O-, AB+, AB-");
            		    } else {
            		        System.out.println("Sorry Wrong Input Please Input 1, 2, or 3 For This Selection");
            		    }
            		} else if (bloodType.equals("AB-")) {
            		    System.out.println("\nYou Input AB-.");
            		    System.out.print("What Would You Like to Know About This Blood Type? Input 1 For Fact's, 2 to Give Blood, 3 to Recieve Blood: ");
            		    int info = sc.nextInt();

            		    // Provide information based on the user's choice
            		    if (info == 1) {
            		    	
            		    	System.out.println("You Have Requested 1 For Fact's");
            		    	System.out.println("AB- is the rarest blood type and only around 1% of the population have it.");
            		    	} else if (info == 2) {
            		    	System.out.println("You Have Requested 2 to Give Blood");
            		    	System.out.println("You Can Give to Anyone With AB+ and AB-.");
            		    	} else if (info == 3) {
            		    	System.out.println("You Have Requested 3 to Recieve Blood");
            		    	System.out.println("You Can Recieve From Anyone With AB-, A-, B-, O-");
            		    	} else {
            		    	System.out.println("Sorry Wrong Input Please Input 1, 2, or 3 For This Selection");
            		    	}
            		    	} else {
            		    	System.out.println("Invalid Blood Type. Please Input A+, A-, B+, B-, O+, O-, AB+, or AB-.");
            		    	}

            		    	// close the scanner
            		    	sc.close();
            		    }
                 }