package TruAstoriaMenuOrderingSystem;

import java.util.Scanner;

public class TruAstoriaMenuOrderingSystem_Two {

	public static void main(String[] args) {
        // Welcome's the user to the establishment
        System.out.println("Hello Welcome to Tru Astoria");
        System.out.println("\nWhat Would You Enjoy Today?");

        // Ask's the user to input a number for one of the items
        Scanner scanner = new Scanner(System.in);
        int burgerSandwichesWraps;
        double salesTax = 0.0875;
        double price = 0;

        while (true) {
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
            burgerSandwichesWraps = scanner.nextInt();

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
                                + "This is $18.72");
                        break;
                    case 2:
                        price += 16.64;
                        System.out.println("Classic Cheeseburger - Lettuce, tomato, onion,"
                                + "and American cheese on brioche bun."
                                + "This is $16.64");
                        break;
                    case 3:
                        price += 19.76;
                        System.out.println("Salmon Burger"
                                + "- char-grilled wild-caught Atlantic salmon burger with a"
                                + "\nsignature Worcestershire sauce, shredded cabbage,"
                                + "\nand mustard aioli. This is $19.76");
                        break;
                    case 4:
                        price += 15.60;
                        System.out.println("Vegetable Panini - farmers pick of fresh grilled,"
                                + "\nvegetables, sun dried tomato aioli on a pressed Italian roll."
                                + "This is $15.60");
                        break;
                    case 5:
                        price += 17.68;
                        System.out.println("Greek Roast Chicken Panini - breaded chicken breast,"
                                + "\namerican cheese, guacamole spread, tomatoes,"
                                + "\nhoney mustard, on a brioche."
                                + "\nThis is $17.68");
                        break;
                    case 6:
                        price += 17.68;
                        System.out.println("Fried Chicken Sandwich - breaded chicken breast, american cheese,"
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
                        System.out.println("Falafel Wrap - Bhummus, tabbouleh, tahini sauce,"
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

                System.out.println("Would You Like Something Else?"
                        + "\nPlease Enter Y For Yes or N For No:");
                scanner.nextLine(); // Consume newline left-over
                String anythingElse = scanner.nextLine();

                if (anythingElse.equalsIgnoreCase("N")) {
                    break;
                }
            }
        }

        double tax = price * salesTax;
        double total = price + tax;
        double tenTip = total * 0.10;
        double fifteenTip = total * 0.15;
        double twentyTip = total * 0.20;

        System.out.printf("Total: %.2f, Tax: %.2f, Tip (10%%): "
        		+ "%.2f, Tip (15%%): %.2f, Tip (20%%): %.2f%n", 
        		total, tax, tenTip, fifteenTip, twentyTip);
    }
}