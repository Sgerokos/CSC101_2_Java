package unitConversion;

import java.util.Scanner;

public class unitConversion {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // The variable feet ask's the user to input the number for feet
        System.out.print("Please Enter the Value for Feet: ");
        float feet = input.nextFloat();
        
        // The variable meters multiplies the number of feet by 0.305
        float meters = feet * 0.305f;
        
        // The variable inch multiplies feet by 12 to calculate inches
        float inch = feet * 12;
        
        // The variable centimetre multiplies inch by 0.3937 to calculate centimetre
        float centimetre = inch * 0.3937f;
        
        //Print's the output feet and show's it's conversion in meter's as well
        System.out.printf("%.2f Feet Are %.2f In Meters, %.2f In Inches, and %.2f In Centimeters", feet, meters, inch, centimetre);
    }
}