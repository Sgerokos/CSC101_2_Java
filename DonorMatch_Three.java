package DonorMatch_Three;

import java.util.Scanner;

public class DonorMatch_Three {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prints a hello and welcomes the user to donor match
        System.out.println("Hello");
        System.out.println("Welcome to the Donor Match Program");
        
        // Requests the user to input the type of blood they have
        // The input can be A+, A-, B+, B-, O+, O-, AB+, AB-
        System.out.println("\nPlease Input The Donor's Blood Type."
                           + " You May Enter A+, A-, B+, B-, O+, O-, AB+, AB-: ");
        String bloodType = scanner.nextLine();
        
        if (!(bloodType.equals("A+") || bloodType.equals("A-") ||
              bloodType.equals("B+") || bloodType.equals("B-") ||
              bloodType.equals("O+") || bloodType.equals("O-") ||
              bloodType.equals("AB+") || bloodType.equals("AB-"))) {
            System.out.println("Incorrect input. Enter one of A+, A-, B+, B-, O+, O-, AB+, AB-");
            System.exit(0);
        }
        
        // This line will ask for the recipient's blood type
        System.out.println("\nPlease Input The Recipient's Blood Type." 
                         + " You May Enter A+, A-, B+, B-, O+, O-, AB+, AB-: ");
        String recipientBloodType = scanner.nextLine();
        
        if (!(recipientBloodType.equals("A+") || recipientBloodType.equals("A-") ||
              recipientBloodType.equals("B+") || recipientBloodType.equals("B-") ||
              recipientBloodType.equals("O+") || recipientBloodType.equals("O-") ||
              recipientBloodType.equals("AB+") || recipientBloodType.equals("AB-"))) {
            System.out.println("Incorrect input. Enter one of A+, A-, B+, B-, O+, O-, AB+, AB-");
            System.exit(0);
        }
        
        if (bloodType.equals("A+") && (recipientBloodType.equals("A+") || recipientBloodType.equals("AB+"))) {
            System.out.println(bloodType + " And " + recipientBloodType + " Are Compatible");
        } else if (bloodType.equals("A-") && (recipientBloodType.equals("A+") || recipientBloodType.equals("A-")
                                               || recipientBloodType.equals("AB+") || recipientBloodType.equals("AB-"))) {
            System.out.println(bloodType + " And " + recipientBloodType + " Are Compatible");
        } else if (bloodType.equals("B+") && (recipientBloodType.equals("B+") || recipientBloodType.equals("AB-"))) {
            System.out.println(bloodType + " And " + recipientBloodType + " Are Compatible");
        } else if (bloodType.equals("B-") && (recipientBloodType.equals("B+") || recipientBloodType.equals("B-")
                                               || recipientBloodType.equals("AB+") || recipientBloodType.equals("AB-"))) {
            System.out.println(bloodType + " And " + recipientBloodType + " Are Compatible");
        } else if (bloodType.equals("O+") && (recipientBloodType.equals("A+") || recipientBloodType.equals("B+")
                                               || recipientBloodType.equals("O+") || recipientBloodType.equals("AB+"))) {
            System.out.println(bloodType + " And " + recipientBloodType + " Are Compatible");
        } else if (bloodType.equals("O-") && (recipientBloodType.equals("A+") || recipientBloodType.equals("A-") || recipientBloodType.equals("B+") ||
        		recipientBloodType.equals("B-") || recipientBloodType.equals("AB+") ||
        		recipientBloodType.equals("AB-"))) {
        		System.out.println(bloodType + " And " + recipientBloodType + " Are Compatible");
        		} else if (bloodType.equals("AB+") && recipientBloodType.equals("AB+")) {
        		System.out.println(bloodType + " And " + recipientBloodType + " Are Compatible");
        		} else if (bloodType.equals("AB-") && (recipientBloodType.equals("AB-") ||
        		recipientBloodType.equals("AB+"))) {
        		System.out.println(bloodType + " And " + recipientBloodType + " Are Compatible");
        		} else {
        		System.out.println("Blood types are not compatible.");
        		
                }
            }
        }