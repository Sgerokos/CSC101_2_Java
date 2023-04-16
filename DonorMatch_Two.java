package DonorMatch_Two;

import java.util.Scanner;

public class DonorMatch_Two {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello");
        System.out.println("Welcome to the Donor Match Program");

        // Requests the user to input the type of blood they have
        // The input can be A+. A-, B+, B-, O+, O-, AB+, AB-
        System.out.println("\nPlease Input The Donor's Blood Type." +
                " You May Enter A+, A-, B+, B-, O+, O-, AB+, AB-: ");
        String bloodType = input.nextLine();

        // This line will ask for the recipient's blood type
        System.out.println("\nPlease Input The Recipient's Blood Type." +
                " You May Enter A+, A-, B+, B-, O+, O-, AB+, AB-: ");
        String recipientBloodType = input.nextLine();

        if ((bloodType.equals("A+")) && (recipientBloodType.equals("A+")
                || recipientBloodType.equals("AB+"))) {
            System.out.println(bloodType + " And " + recipientBloodType + " Are Compatible");

        } else if ((bloodType.equals("A+")) && (recipientBloodType.equals("A-")
                || recipientBloodType.equals("B+")
                || recipientBloodType.equals("B-")
                || recipientBloodType.equals("O+")
                || recipientBloodType.equals("O-")
                || recipientBloodType.equals("AB-"))) {
            System.out.println(bloodType + " And " + recipientBloodType + " Are Not Compatible");

        } else if ((bloodType.equals("A-")) && (recipientBloodType.equals("A+")
                || recipientBloodType.equals("A-")
                || recipientBloodType.equals("AB+")
                || recipientBloodType.equals("AB-"))) {
            System.out.println(bloodType + " And " + recipientBloodType + " Are Compatible");

        } else if ((bloodType.equals("A-")) && (recipientBloodType.equals("B+")
                || recipientBloodType.equals("B-")
                || recipientBloodType.equals("O+")
                || recipientBloodType.equals("O-"))) {
            System.out.println(bloodType + " And " + recipientBloodType + " Are Not Compatible");

        } else if ((bloodType.equals("B+")) && (recipientBloodType.equals("B+")
                || recipientBloodType.equals("AB-"))) {
            System.out.println(bloodType + " And " + recipientBloodType + " Are Compatible");

        } else if ((bloodType.equals("B+")) && (recipientBloodType.equals("A+")
                || recipientBloodType.equals("A-")
                || recipientBloodType.equals("B-")
                || recipientBloodType.equals("O+")
                || recipientBloodType.equals("O-")
                || recipientBloodType.equals("AB-"))) {
            System.out.println(bloodType + " And " + recipientBloodType + " Are Not Compatible");

        } else if ((bloodType.equals("B-")) && (recipientBloodType.equals("B+")
                || recipientBloodType.equals("B-")
                || recipientBloodType.equals("AB+")
                || recipientBloodType.equals("AB-"))) {
            System.out.println(bloodType + " And " + recipientBloodType + " Are Compatible");

        } else if ((bloodType.equals("B-")) && (recipientBloodType.equals("A+")
                || recipientBloodType.equals("A-")
                || recipientBloodType.equals("O+")
                || recipientBloodType.equals("O-"))) {
        	System.out.println(bloodType + " And " + recipientBloodType + " Are Not Compatible");
        } else if ((bloodType.equals("O+")) && (recipientBloodType.equals("A+")
        || recipientBloodType.equals("B+")
        || recipientBloodType.equals("O+")
        || recipientBloodType.equals("AB+"))) {
        System.out.println(bloodType + " And " + recipientBloodType + " Are Compatible");
        } else if ((bloodType.equals("O+")) && (recipientBloodType.equals("A-")
        || recipientBloodType.equals("B-")
        || recipientBloodType.equals("O-")
        || recipientBloodType.equals("AB-"))) {
        System.out.println(bloodType + " And " + recipientBloodType + " Are Not Compatible");
        } else if ((bloodType.equals("O-")) && (recipientBloodType.equals("A+")
        || recipientBloodType.equals("A-")
        || recipientBloodType.equals("B+")
        || recipientBloodType.equals("B-")
        || recipientBloodType.equals("AB+")
        || recipientBloodType.equals("AB-"))) {
        System.out.println(bloodType + " And " + recipientBloodType + " Are Compatible");
        } else if ((bloodType.equals("AB+")) && (recipientBloodType.equals("AB+"))) {
        System.out.println(bloodType + " And " + recipientBloodType + " Are Compatible");
        } else if ((bloodType.equals("AB+")) && (recipientBloodType.equals("A+")
        || recipientBloodType.equals("A-")
        || recipientBloodType.equals("B+")
        || recipientBloodType.equals("B-")
        || recipientBloodType.equals("O+")
        || recipientBloodType.equals("O-")
        || recipientBloodType.equals("AB-"))) {
        System.out.println(bloodType + " And " + recipientBloodType + " Are Not Compatible");
        } else if ((bloodType.equals("AB-")) && (recipientBloodType.equals("AB-")
        || recipientBloodType.equals("AB+"))) {
        System.out.println(bloodType + " And " + recipientBloodType + " Are Compatible");
        } else if ((bloodType.equals("AB-")) && (recipientBloodType.equals("A+")
        || recipientBloodType.equals("A-")
        || recipientBloodType.equals("B+")
        || recipientBloodType.equals("B-")
        || recipientBloodType.equals("O+")
        || recipientBloodType.equals("O-"))) {
        System.out.println(bloodType + " And " + recipientBloodType + " Are Not Compatible");
        } else {
        System.out.println("You have entered:\nDonor's blood type: " + bloodType
        + "\nRecipient's blood type: " + recipientBloodType
        + "\nThis is an improper input. Please enter one of the selections listed:\n"
        + "A+, A-, B+, B-, O+, O-, AB+, AB- for the donor and recipient.");
        
        }
    }
}
