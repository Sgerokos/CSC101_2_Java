package TruAstoriaMenuOrderingSystem;

import java.util.Scanner;

public class TruAstoriaMenuOrderingSystem {

	public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Welcome the user to the establishment
        System.out.println("Hello Welcome to Tru Astoria");
        System.out.println("\nWhat Would You Enjoy Today?");

        // This variable is the tax 8.75%
        double salesTax = 0.0875;

        // The price is 0 but will be changed as the loop continues or ends
        double price = 0;

        // anythingElse will be set to 'Y' till the user changes it
        String anythingElse = "Y";

        // As long as anythingElse is 'Y', the loop will continue from here
        while (anythingElse.equalsIgnoreCase("Y")) {

            // Ask the user to input a number for one of the items
            System.out.println("Please Choose \n1 For Tru Burger"
                    + "\n2 For Classic Cheeseburger,"
                    + "\n3 For Salmon Burger,"
                    + "\n4 For Vegetable Panini,"
                    + "\n5 For Greek Roast Chicken Panini,"
                    + "\n6 For Fried Chicken Sandwich,"
                    + "\n7 For Cubano,"
                    + "\n8 For Falafel Wrap"
                    + "\n9 For Grilled Chicken Wrap,"
                    + "\n10 For Turkey Avocado BLT:");
            int burgerSandwichesWraps = scanner.nextInt();

            // If the input is below 1 or above 10, an error message will print
            if (burgerSandwichesWraps < 1 || burgerSandwichesWraps > 10) {
                System.out.println("You have Inputed an Invalid Number For Burgers, Sandwiches,"
                        + "and Wraps."
                        + "\nPlease Enter a number Between 1 - 10 For This Selection");
            } else {
                switch (burgerSandwichesWraps) {
                    case 1:
                        price += 18.72;
                        System.out.println("Tru Burger - sautéed onions, roasted red pepper, bacon,"
                                + "\nSwiss cheese, sriracha maple mayo, brioche bun."
                                + "\nThis is $18.72");
                        break;
                    case 2:
                        price += 16.64;
                        System.out.println("Classic Cheeseburger - Lettuce, tomato, onion,"
                                + "and American cheese on brioche bun."
                                + "\nThis is $16.64");
                        break;
                    case 3:
                        price += 19.76;
                        System.out.println("Salmon Burger"
                                + "- char-grilled wild-caught Atlantic salmon burger with a"
                                + "\nsignature Worcestershire sauce, shredded cabbage,"
                                + "\nand mustard aioli."
                                + "\nThis is $19.76");
                        break;
                    case 4:
                        price += 15.60;
                        System.out.println("Vegetable Panini - farmers pick of fresh grilled,"
                                + "\nvegetables, sun dried tomato aioli on a pressed Italian roll."
                                + "\nThis is $15.60");
                        break;
                    case 5:
                        price += 17.68;
                        System.out.println("Greek Roast Chicken Panini - breaded chicken breast,"
                                + "\nAmerican cheese, guacamole spread, tomatoes,"
                                + "\nhoney mustard, on a brioche."
                                + "\nThis is $17.68");
                        break;
                    case 6:
                        price += 17.68;
                        System.out.println("Fried Chicken Sandwich - breaded chicken breast, American cheese,"
                                + "\nguacamole spread, tomatoes, honey mustard, on a brioche."
                                + "\nThis is $17.68");
                        break;
                    case 7:
                        price += 17.68;
                        System.out.println("Cubano - pulled pork, deli ham,"
                                + "Swiss cheese, pickles, and mustard."
                                + "\nThis is $17.68");
                        break;
                    case 8:
                        price += 16.64;
                        System.out.println("Falafel Wrap - hummus, tabbouleh, tahini sauce,"
                                + "rugula, falafel fritters."
                                + "\nThis is $16.64");
                        break;
                    case 9:
                        price += 16.64;
                        System.out.println("Grilled Chicken Wrap - roasted sliced turkey, Swiss cheese, bacon,"
                                + "\nromaine hearts, sliced tomato, avocado,"
                                + "sriracha mayo, on toasted wheat bread."
                                + "\nThis is $16.64");
                        break;
                    case 10:
                        price += 18.72;
                        System.out.println("Turkey Avocado BLT - roasted sliced turkey, Swiss cheese, bacon,"
                                + "\nromaine hearts, sliced tomato, avocado,"
                                + "\nsriracha mayo, on toasted wheat bread."
                                + "\nThis is $18.72");
                        break;
                }
            }

            // This variable will change the value of anythingElse
            System.out.print("Would You Like Something Else? "
                    + "\nPlease Enter Y For Yes or N For No:");
            anythingElse = scanner.next();

            // If 'N' is selected, the following will be used
            if (anythingElse.equalsIgnoreCase("N")) {

                // Variables used
                // Tax will be calculated by price times salesTax
                double tax = price * salesTax;

                // Total will add price and tax
                double total = price + tax;

                // This is 10% tip, total times 10%
                double tenTip = total * 0.10;

                // This is 15% tip, total times 15%
                double fifteenTip = total * 0.15;

                // This is 20% tip, total times 20%
                double twentyTip = total * 0.20;

                // This will print the total along with the sales tax
                // As well as the recommended tips and then exit
                System.out.printf("The Total is: %.2f"
                        + "\nThe Sale's Tax is: %.2f"
                        + "\n10%% Tip is: %.2f"
                        + "\n15%% Tip is: %.2f"
                        + "\n20%% Tip is: %.2f%n",
                        total, tax, tenTip, fifteenTip, twentyTip);
            } else if (!anythingElse.equalsIgnoreCase("Y")) {
                // If anything besides 'Y' or 'N' is selected, an error message will be printed
                System.out.println("Bad Input: " + anythingElse);
            }
        }
        // Close the Scanner object
        scanner.close();
    }
}

