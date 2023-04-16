package BloodTypeCompatibilityChecker_Two;

import java.util.Scanner;

public class BloodTypeCompatibilityChecker_Two {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create Scanner object

        // Prints a hello and welcomes the user to donor match program
        System.out.println("Hello");
        System.out.println("Welcome to the Donor Match Program");

        // Requests the user to input the type of blood they have 
        // The input can be A+, A-, B+, B-, O+, O-, AB+, AB-
        System.out.print("\nPlease Input The Donor's Blood Type." 
                           + "You May Enter A+, A-, B+, B-, O+, O-, AB+, AB-: ");
        String bloodType = input.nextLine();

        // This line will ask for the recipient's blood type
        System.out.print("\nPlease Input The Recipient's Blood Type." 
                             + "You May Enter A+, A-, B+, B-, O+, O-, AB+, AB-: ");
        String recipientBloodType = input.nextLine();

        // If the user chooses one of the selected blood types 
        // The user will be asked to input the recipient's blood type
        if (bloodType.equals("A+") && (recipientBloodType.equals("A+") 
                                        || recipientBloodType.equals("AB+"))) {
            System.out.println(bloodType + " And " + recipientBloodType + " Are Compatible");
        } else if (bloodType.equals("A+") && (recipientBloodType.equals("A-") 
                                                || recipientBloodType.equals("B+")
                                                || recipientBloodType.equals("B-")
                                                || recipientBloodType.equals("O+")
                                                || recipientBloodType.equals("O-")
                                                || recipientBloodType.equals("AB-"))) {
            System.out.println(bloodType + " And " + recipientBloodType + " Are Not Compatible");
        } else if (bloodType.equals("A-") && (recipientBloodType.equals("A+")
                                                || recipientBloodType.equals("A-")
                                                || recipientBloodType.equals("AB+")
                                                || recipientBloodType.equals("AB-"))) {
            System.out.println(bloodType + " And " + recipientBloodType + " Are Compatible");
        } else if (bloodType.equals("A-") && (recipientBloodType.equals("B+")
                                                || recipientBloodType.equals("B-")
                                                || recipientBloodType.equals("O+")
                                                || recipientBloodType.equals("O-"))) {
            System.out.println(bloodType + " And " + recipientBloodType + " Are Not Compatible");
        } else if (bloodType.equals("B+") && (recipientBloodType.equals("B+")
                                                || recipientBloodType.equals("AB-"))) {
            System.out.println(bloodType + " And " + recipientBloodType + " Are Compatible");
        } else if (bloodType.equals("B+") && (recipientBloodType.equals("A+")
                                                || recipientBloodType.equals("A-")
                                                || recipientBloodType.equals("B-")
                                                || recipientBloodType.equals("O+")
                                                || recipientBloodType.equals("O-")
                                                || recipientBloodType.equals("AB-"))) {
            System.out.println(bloodType + " And " + recipientBloodType + " Are Not Compatible");
        } else if (bloodType.equals("B-") && (recipientBloodType.equals("B+")
                                                || recipientBloodType.equals("B-")
                                                || recipientBloodType.equals("AB+")
                                                || recipientBloodType.equals("AB-"))) {
                                                System.out.println(bloodType + " And " + recipientBloodType + " Are Compatible");
                                                } else if (bloodType.equals("B-") && (recipientBloodType.equals("A+")
                                                || recipientBloodType.equals("A-")
                                                || recipientBloodType.equals("O+")
                                                || recipientBloodType.equals("O-"))) {
                                                System.out.println(bloodType + " And " + recipientBloodType + " Are Not Compatible");
                                                } else if (bloodType.equals("O+") && (recipientBloodType.equals("A+")
                                                || recipientBloodType.equals("B+")
                                                || recipientBloodType.equals("O+")
                                                || recipientBloodType.equals("AB+"))) {
                                                System.out.println(bloodType + " And " + recipientBloodType + " Are Compatible");
                                                } else if (bloodType.equals("O+") && (recipientBloodType.equals("A-")
                                                || recipientBloodType.equals("B-")
                                                || recipientBloodType.equals("O-")
                                                || recipientBloodType.equals("AB-"))) {
                                                System.out.println(bloodType + " And " + recipientBloodType + " Are Not Compatible");
                                                } else if (bloodType.equals("O-") && (recipientBloodType.equals("A+")
                                                || recipientBloodType.equals("B+")
                                                || recipientBloodType.equals("AB+")
                                                || recipientBloodType.equals("AB-"))) {
                                                System.out.println(bloodType + " And " + recipientBloodType + " Are Compatible");
                                                } else if (bloodType.equals("O-") && (recipientBloodType.equals("A-")
                                                || recipientBloodType.equals("B-")
                                                || recipientBloodType.equals("O-"))) {
                                                System.out.println(bloodType + " And " + recipientBloodType + " Are Compatible");
                                                } else if (bloodType.equals("AB+") && (recipientBloodType.equals("A+")
                                                || recipientBloodType.equals("B+")
                                                || recipientBloodType.equals("O+")
                                                || recipientBloodType.equals("AB+")
                                                || recipientBloodType.equals("A-")
                                                || recipientBloodType.equals("B-")
                                                || recipientBloodType.equals("O-")
                                                || recipientBloodType.equals("AB-"))) {
                                                System.out.println(bloodType + " And " + recipientBloodType + " Are Compatible");
                                                } else if (bloodType.equals("AB-") && (recipientBloodType.equals("A-")
                                                || recipientBloodType.equals("B-")
                                                || recipientBloodType.equals("AB-")
                                                || recipientBloodType.equals("O-"))) {
                                                System.out.println(bloodType + " And " + recipientBloodType + " Are Compatible");
                                                } else if (bloodType.equals("AB-") && (recipientBloodType.equals("A+")
                                                || recipientBloodType.equals("B+")
                                                || recipientBloodType.equals("AB+")
                                                || recipientBloodType.equals("O+"))) {
                                                System.out.println(bloodType + " And " + recipientBloodType + " Are Not Compatible");
                                                } else {
                                                System.out.println("You Have Entered\nDonor's Blood Type: " + bloodType
                                                + "\nAnd Recipient's Blood Type: " + recipientBloodType
                                                + "\nThis is an Improper Input.\nPlease Enter One of The Selections Listed A+, A-, O+, O-, AB+, AB-"
                                                + "\nFor The Donor and Recipient");
    }
  }
}   