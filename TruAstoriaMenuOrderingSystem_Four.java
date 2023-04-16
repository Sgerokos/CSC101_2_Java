package TruAstoriaMenuOrderingSystem;

import java.util.Scanner;

public class TruAstoriaMenuOrderingSystem_Four {

    public static void main(String[] args) {
        // Welcome's the user to the establishment
        System.out.println("Hello Welcome to Tru Astoria");
        System.out.println("\nWhat Would You Enjoy Today?");

        // This variable is the tax 8.75%
        double salesTax = 0.0875;
        // The price is 0 but will be changed as the loop continue's or end's
        double price = 0;
        // anything_Else will be set to Y till the user change's it in line 270
        String anythingElse = "Y";
        // variable order will be set as an empty string till all selections are made
        String order = "";
        Scanner scanner = new Scanner(System.in);
        String yn;

        // As long as anything_Else is Y the loop will continue from here
        while (anythingElse.equalsIgnoreCase("Y")) {

            // Ask's the user to input a number for one of the items
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
            scanner.nextLine();

            // If the input is below 1 or above 10 an error message will print
            if (burgerSandwichesWraps < 1 || burgerSandwichesWraps > 10) {
                System.out.println("You have Inputed an Invalid Number For Burgers, Sandwiches,"
                        + "and Wraps."
                        + "\nPlease Enter a number Between 1 - 10 For This Selection");
            }
            // If 1 is selected the the item will be displayed
            else if (burgerSandwichesWraps == 1) {

                System.out.println("Tru Burger - sautéed onions, roasted red pepper, bacon,"
                        + "\nSwiss cheese, sriracha maple mayo, brioche bun."
                        + "\nThis is $18.72");

                // The user will be asked if they want to add this to the order
                System.out.print("Do You Want to Add This to Your order? "
                        + "Y For Yes N For No: ");
                String yN = scanner.nextLine();

                // If Y is selected the price will be added to the variable price
                // The order variable will be added to the variable order
                if (yN.equalsIgnoreCase("Y")) {
                    price += 18.72;
                    order += "\nTru Burger: $18.72";
                }
                // If N is selected no price will be added to the price variable
                // order variable will remain as it did before
                else if (yN.equalsIgnoreCase("N")) {
                    order += "";
                }
            }
            // If 2 is selected the the item will be displayed
            else if (burgerSandwichesWraps == 2) {

                System.out.println("Classic Cheeseburger - Lettuce, tomato, onion,"
                        + "and American cheese on brioche bun."
                        + "\nThis is $16.64");

                // The user will be asked if they want to add this to the order
                System.out.print("Do You Want to Add This to Your order? "
                        + "Y For Yes N For No: ");
                yn = scanner.next();

                // If Y is selected the price will be added to the variable price
                // The order variable will be added to the variable order
                if (yn.equalsIgnoreCase("Y")) {
                    price += 16.64;
                    order += "\nClassic Cheeseburger: $16.64";
                }
                // If N is selected no price will be added to the price variable
                // order variable will remain as it did before
                else if (yn.equalsIgnoreCase("N")) {
                    order += "";
                }
            }
            // If 3 is selected the the item will be displayed
            else if (burgerSandwichesWraps == 3) {

                System.out.println("Salmon Burger"
                        + "- char-grilled wild-caught Atlantic salmon burger with a"
                        + "\nsignature Worcestershire sauce, shredded cabbage,"
                        + "\nand mustard aioli."
                        + "\nThis is $19.76");

                // The user will be asked if they want to add this to the order
                System.out.print("Do You Want to Add This to Your order? "
                        + "Y For Yes N For No: ");
                yn = scanner.next();

                // If Y is selected the price will be added to the variable price
                // The order variable will be added to the variable order
                if (yn.equalsIgnoreCase("Y")) {
                    price += 19.76;
                    order += "\nSalmon Burger: $19.76";
                }
                // If N is selected no price will be added to the price variable
                // order variable will remain as it did before
                else if (yn.equalsIgnoreCase("N")) {
                    order += "";
                }
            }
            // If 4 is selected, the item will be displayed
            else if (burgerSandwichesWraps == 4) {

            	System.out.println("Grilled Chicken Sandwich - marinated grilled chicken breast,"
            	        + "lettuce, tomato, avocado, and chipotle mayo on a ciabatta roll."
            	        + "\nThis is $15.32");

            	// The user will be asked if they want to add this to the order
            	System.out.print("Do You Want to Add This to Your order? "
            	        + "Y For Yes N For No: ");
            	yn = scanner.next();

            	// If Y is selected the price will be added to the variable price
            	// The order variable will be added to the variable order
            	if (yn.equalsIgnoreCase("Y")) {
            	    price += 15.32;
            	    order += "\nGrilled Chicken Sandwich: $15.32";
            	}
            	// If N is selected no price will be added to the price variable
            	// order variable will remain as it did before
            	else if (yn.equalsIgnoreCase("N")) {
            	    order += "";
            	}
            }
	        // If 5 is selected, the item will be displayed
	        else if (burgerSandwichesWraps == 5) {
	        	
	        	System.out.println("Veggie Wrap - assorted fresh vegetables, avocado, hummus,"
	        	        + "and a creamy cucumber sauce wrapped in a spinach tortilla."
	        	        + "\nThis is $12.47");

	        	// The user will be asked if they want to add this to the order
	        	System.out.print("Do You Want to Add This to Your order? "
	        	        + "Y For Yes N For No: ");
	        	yn = scanner.next();

	        	// If Y is selected the price will be added to the variable price
	        	// The order variable will be added to the variable order
	        	if (yn.equalsIgnoreCase("Y")) {
	        	    price += 12.47;
	        	    order += "\nVeggie Wrap: $12.47";
	        	}
	        	// If N is selected no price will be added to the price variable
	        	// order variable will remain as it did before
	        	else if (yn.equalsIgnoreCase("N")) {
	        	    order += "";
	        	}
	        } 
            	
    		// If 6 is selected, the item will be displayed
	        else if (burgerSandwichesWraps == 6) {
	        	
	        	System.out.println("Turkey Club - oven-roasted turkey breast, bacon, lettuce,"
	        	        + "tomato, and mayo on toasted sourdough bread."
	        	        + "\nThis is $14.20");

	        	// The user will be asked if they want to add this to the order
	        	System.out.print("Do You Want to Add This to Your order? "
	        	        + "Y For Yes N For No: ");
	        	yn = scanner.next();

	        	// If Y is selected the price will be added to the variable price
	        	// The order variable will be added to the variable order
	        	if (yn.equalsIgnoreCase("Y")) {
	        	    price += 14.20;
	        	    order += "\nTurkey Club: $14.20";
	        	}
	        	// If N is selected no price will be added to the price variable
	        	// order variable will remain as it did before
	        	else if (yn.equalsIgnoreCase("N")) {
	        	    order += "";
	        	}
	        }
	        // If 7 is selected, the item will be displayed
			else if (burgerSandwichesWraps == 7) {
				
				System.out.println("Philly Cheesesteak - thinly sliced beefsteak, sautéed onions,"
				        + "green bell peppers, and provolone cheese on a hoagie roll."
				        + "\nThis is $16.89");
				
				// The user will be asked if they want to add this to the order
				System.out.print("Do You Want to Add This to Your order? "
				        + "Y For Yes N For No: ");
				yn = scanner.next();

				// If Y is selected the price will be added to the variable price
				// The order variable will be added to the variable order
				if (yn.equalsIgnoreCase("Y")) {
				    price += 16.89;
				    order += "\nPhilly Cheesesteak: $16.89";
				}
				// If N is selected no price will be added to the price variable
				// order variable will remain as it did before
				else if (yn.equalsIgnoreCase("N")) {
				    order += "";
				}
			}
				
			// If 8 is selected, the item will be displayed
			else if (burgerSandwichesWraps == 8) {
				
				System.out.println("Buffalo Chicken Wrap - crispy chicken tossed in buffalo sauce,"
				        + "lettuce, tomato, and blue cheese dressing in a flour tortilla."
				        + "\nThis is $13.45");

				// The user will be asked if they want to add this to the order
				System.out.print("Do You Want to Add This to Your order? "
				        + "Y For Yes N For No: ");
				yn = scanner.next();

				// If Y is selected the price will be added to the variable price
				// The order variable will be added to the variable order
				if (yn.equalsIgnoreCase("Y")) {
				    price += 13.45;
				    order += "\nBuffalo Chicken Wrap: $13.45";
				}
				// If N is selected no price will be added to the price variable
				// order variable will remain as it did before
				else if (yn.equalsIgnoreCase("N")) {
				    order += "";
				}
			}
				
			// If 9 is selected, the item will be displayed
			else if (burgerSandwichesWraps == 9) {
				
				System.out.println("Cuban Sandwich - roasted pork, ham, Swiss cheese,"
				        + "pickles, and mustard pressed between Cuban bread."
				        + "\nThis is $14.95");

				// The user will be asked if they want to add this to the order
				System.out.print("Do You Want to Add This to Your order? "
				        + "Y For Yes N For No: ");
				yn = scanner.next();

				// If Y is selected the price will be added to the variable price
				// The order variable will be added to the variable order
				if (yn.equalsIgnoreCase("Y")) {
				    price += 14.95;
				    order += "\nCuban Sandwich: $14.95";
				}
				// If N is selected no price will be added to the price variable
				// order variable will remain as it did before
				else if (yn.equalsIgnoreCase("N")) {
				    order += "";
				}
			}
				
			// If 10 is selected, the item will be displayed
			else if (burgerSandwichesWraps == 10) {
				
				System.out.println("Caprese Panini - fresh mozzarella, tomatoes, basil,"
				        + "and a balsamic glaze on ciabatta bread."
				        + "\nThis is $13.10");

				// The user will be asked if they want to add this to the order
				System.out.print("Do You Want to Add This to Your order? "
				        + "Y For Yes N For No: ");
				yn = scanner.next();

				// If Y is selected the price will be added to the variable price
				// The order variable will be added to the variable order
				if (yn.equalsIgnoreCase("Y")) {
					price += 13.10;
					order += "\nCaprese Panini: $13.10";
					}
					// If N is selected no price will be added to the price variable
					// order variable will remain as it did before
					else if (yn.equalsIgnoreCase("N")) {
					order += "";
				}
			}

            // After the last item, ask if the user wants to add more items
            System.out.print("Would You Like Something Else? "
                    + "\nPlease Enter Y For Yes or N For No: ");
            anythingElse = scanner.next();

            // If N is selected, the following calculations will be made
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

                // This will print total along with the sales tax
                // As well as the recommended tips and then exit
                System.out.printf("Order's: %s\nTotal Without Tax: $%.2f"
                        + "\nThe Total With Tax is: $%.2f"
                        + "\nThe Sale's Tax 8.75%% is: $%.2f"
                        + "\n10%% Tip is: $%.2f"
                        + "\n15%% Tip is: $%.2f"
                        + "\n20%% Tip is: $%.2f",
                        order, price, total, tax, tenTip, fifteenTip, twentyTip);
                System.exit(0);
            }
            // If anything besides Y or N is selected, an error message will be printed
            else if (!anythingElse.startsWith("Y") && !anythingElse.startsWith("N")) {
            	System.out.println("Invalid Input! Please Enter Y For Yes or N For No.");
            }
        }
    }

}