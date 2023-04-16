package HashAlchemist;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class HashAlchemist {

    public static void main(String[] args) {

        // Ask the user to choose an encryption method from the list presented or help if they need help
        Scanner input = new Scanner(System.in);
        System.out.print("Please Choose an Encryption Method.\n" +
                "Please Enter One of The Following.\n" +
                "sha384, sha512, sha256, sha224, sha1, md5,\n" +
                "or help for Assistance in Choosing:");

        String hash = input.nextLine();

        // If help is entered, list the algorithms and what they are
        if (hash.equalsIgnoreCase("help")) {
            // (Print the help text here)
            // Re-ask the user to input the encryption method if help was chosen
            System.out.print("Now Please re Choose an Encryption Method.\n" +
                    "Please Enter One of The Following.\n" +
                    "sha384, sha512, sha256, sha224, sha1, md5:");
            hash = input.nextLine();
        }

        // Request the item that the user wants to encrypt
        System.out.print("What Would you Like To Encrypt? Please Enter It Now: ");
        String hashObject = input.nextLine();

        try {
            // Hash the input using the selected algorithm
            MessageDigest md = MessageDigest.getInstance(hash);
            md.update(hashObject.getBytes());
            byte[] digest = md.digest();

            // Convert the byte string to hex
            StringBuilder hexString = new StringBuilder();
            for (byte b : digest) {
                hexString.append(String.format("%02x", b));
            }

            // Print the hexadecimal representation of the hash
            System.out.println("The hash of the input using " + hash + " is:");
            System.out.println(hexString.toString());
        } catch (NoSuchAlgorithmException e) {
            // If an exception is thrown, print an error message
            System.out.println("\n\nSorry Wrong Encryption Method Inputted." +
                    "\nPlease Try Again. \nNow Exiting!!!");
        }
    }
}