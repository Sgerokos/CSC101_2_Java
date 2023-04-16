package ElectricityCostCalculator_Two;

import java.util.Scanner;

public class ElectricityCostCalculator_Two {

	public static void main(String[] args) {
        // Creating an object of Scanner class to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input the number of watts the device uses
        System.out.print("Please Enter the Wattage of Your Device: ");
        float watts = scanner.nextFloat();

        // If less than or equal to zero, the program will terminate and print exit
        if (watts <= 0) {
            System.out.println("Sorry The Input Must Be Above 0.\nPlease Try Again.\nNow Exiting!!!");
            System.exit(0);
        }

        // Ask the user to input the number of hours the device will be on in a day
        System.out.print("How Many Hour's in a Day Does it Run? ");
        float hours = scanner.nextFloat();

        // If less than or equal to zero, the program will terminate and print exit
        if (hours <= 0) {
            System.out.println("Sorry The Input Must Be Above 0.\nPlease Try Again.\nNow Exiting!!!");
            System.exit(0);
        }

        // Ask the user to input the electric rate in cents per kilowatt per hour
        System.out.print("How Much is Your Electric Rate Per Kilowatt an Hour in Cents? ");
        float centsPerKWh = scanner.nextFloat();

        // If less than or equal to zero, the program will terminate and print exit
        if (centsPerKWh <= 0) {
            System.out.println("Sorry The Input Must Be Above 0.\nPlease Try Again.\nNow Exiting!!!");
            System.exit(0);
        }

        // Calculate the monthly rate by multiplying watts by the number of hours divided by 1000 
        // multiplied by centsPerKWh multiplied by 30
        float monthly = watts * hours / 1000 * centsPerKWh * 30;

        // Print the monthly rate by rounding it to the nearest second decimal
        System.out.println("You Will Pay Monthly $" + Math.round(monthly * 100.0) / 100.0 
                           + " More on Your Electric Bill");
    }
}