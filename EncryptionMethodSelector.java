package EncryptionMethodSelector;

import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.util.Scanner;

public class EncryptionMethodSelector {

    public static void main(String[] args) {

        // Create an instance of Scanner
        Scanner input = new Scanner(System.in);

        // Ask user to choose an encryption method from the list presented or help if they need help
        System.out.println("Please Choose an Encryption Method.\n"
                + "Please Enter One of The Following.\n"
                + "SHA-384, SHA-512,"
                + "\nMD5, SHA-256, SHA-224, SHA1,"
                + "\nor help for Assistance in Choosing: ");

        String hashMethod = input.nextLine();

        // If help is entered list's the algorithms and what they are
        if (hashMethod.equals("help")) {
            System.out.println("\nSHA Stand's for Secure Hash Algorithm\n"
                    + "\nSHA1, SHA2 are all different algorithms\n"
                    + "\nsha1 has one hash function and is similar to MD5,\n"
                    + "sha1 is 10 bytes long.\n"
                    + "\nsha2 has two hash functions available SHA-224 is 28 bytes,\n"
                    + "SHA-256 is 32 bytes/n, SHA-384 is 48 bytes,\n");

            // Re ask's the user to input encription method if help was chosen
            System.out.println("Now Please re Choose an Encryption Method.\n"
                    + "From The List Presented\n"
                    + "SHA-384, SHA-512,"
                    + "\nMD5, SHA-256, SHA-224, SHA1,"
                    + "\nor help for Assistance in Choosing:");
            hashMethod = input.nextLine();
        }

        // Requests the item that the user want's to encrypt
        System.out.println("What Would you Like To Encrypt? Please Enter It Now: ");
        String hashObject = input.nextLine();

        try {
            // Hash the input using the selected algorithm
            MessageDigest md = MessageDigest.getInstance(hashMethod);
            md.update(hashObject.getBytes());
            byte[] digest = md.digest();

            // Convert the byte string to hex
            StringBuilder hexString = new StringBuilder();
            for (byte b : digest) {
                hexString.append(String.format("%02x", b));
            }

            // Print the hexadecimal representation of the hash
            System.out.println("The hash of the input using " + hashMethod + " is:");
            System.out.println(hexString.toString());
        } catch (Exception e) {
            // If an exception is thrown, print an error message
            System.out.println("\n\nSorry Wrong Encryption Method Inputed."
                    + "\nPlease Try Again. \nNow Exiting!!!");
        }
    }
}