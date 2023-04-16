package TruAstoriaMenuOrderingSystem;

import java.util.Scanner;

public class TruAstoriaMenuOrderingSystem_Three {

    public static void main(String[] args) {
        // Welcome's the user to the establishment
        System.out.println("Hello Welcome to Tru Astoria");
        System.out.println("\nWhat Would You Enjoy Today?");

        // This variable is the tax 8.75%
        double sales_Tax = 0.0875;
        // The price is 0 but will be changed as the loop continue's or end's
        double price = 0;
        // anything_Else will be set to Y till the user change's it in line 270
        String anything_Else = "Y";
        // variable order will be set as an empty string till all selections are made
        String order = "";
        String moreItems = "Y";
        Scanner scanner = new Scanner(System.in);

        // As long as anything_Else is Y the loop will continue from here
        while (anything_Else.equalsIgnoreCase("Y")) {

            // Ask's the user to input a number for one of the items
            System.out.println("Please Choose \n1 For Tru Burger" +
                    "\n2 For Classic Cheeseburger," +
                    "\n3 For Salmon Burger," +
                    "\n4 For Vegetable Panini," +
                    "\n5 For Greek Roast Chicken Panini," +
                    "\n6 For Fried Chicken Sandwich," +
                    "\n7 For Cubano," +
                    "\n8 For Falafel Wrap" +
                    "\n9 For Grilled Chicken Wrap," +
                    "\n10 For Turkey Avocado BLT:");
            int burger_Sandwiches_Wraps = scanner.nextInt();
            scanner.nextLine();
            String yn;

            // If the input is below 1 or above 10 an error message will print
            if (burger_Sandwiches_Wraps < 1 || burger_Sandwiches_Wraps > 10) {
                System.out.println("You have Inputed an Invalid Number For Burgers, Sandwiches," +
                        "and Wraps." +
                        "\nPlease Enter a number Between 1 - 10 For This Selection");

            } else {
            	switch (burger_Sandwiches_Wraps) {
                case 1:
                    System.out.println("Tru Burger - sautéed onions, roasted red pepper, bacon," +
                            "\nSwiss cheese, sriracha maple mayo, brioche bun." +
                            "\nThis is $18.72");

                    System.out.print("Do You Want to Add This to Your order? "
                            + "Y For Yes N For No: ");
                    yn = scanner.next();

                    if (yn.equalsIgnoreCase("Y")) {
                        price += 18.72;
                        order += "\nTru Burger: $18.72";
                    }
                    break;
                case 2:
                    System.out.println("Classic Cheeseburger - Lettuce, tomato, onion," +
                            "and American cheese on brioche bun." +
                            "\nThis is $16.64");

                    System.out.print("Do You Want to Add This to Your order? "
                            + "Y For Yes N For No: ");
                    yn = scanner.next();

                    if (yn.equalsIgnoreCase("Y")) {
                        price += 16.64;
                        order += "\nClassic Cheeseburger: $16.64";
                    }
                    break;
                case 3:
                    System.out.println("Salmon Burger" +
                            "- char-grilled wild-caught Atlantic salmon burger with a" +
                            "\nsignature Worcestershire sauce, shredded cabbage," +
                            "\nand mustard aioli." +
                            "\nThis is $19.76");

                    System.out.print("Do You Want to Add This to Your order? "
                            + "Y For Yes N For No: ");
                    yn = scanner.next();

                    if (yn.equalsIgnoreCase("Y")) {
                        price += 19.76;
                        order += "\nSalmon Burger: $19.76";
                    }
                    break;
                case 4:
                    System.out.println("Vegetable Panini - farmers pick of fresh grilled," +
                            "\nvegetables, sun dried tomato aioli on a pressed Italian roll." +
                            "\nThis is $15.60");

                    System.out.print("Do You Want to Add This to Your order? "
                            + "Y For Yes N For No: ");
                    yn = scanner.next();

                    if (yn.equalsIgnoreCase("Y")) {
                        price += 15.60;
                        order += "\nVegetable Panini: $15.60";
                    }
                    break;
                case 5:
                    System.out.println("Greek Roast Chicken Panini - breaded chicken breast," +
                            "\namerican cheese, guacamole spread, tomatoes," +
                            "\nhoney mustard, on a brioche. " +
                            "\nThis is $17.68");

                    System.out.print("Do You Want to Add This to Your order? "
                            + "Y For Yes N For No: ");
                    yn = scanner.next();

                    if (yn.equalsIgnoreCase("Y")) {
                        price += 17.68;
                        order += "\nGreek Roast Chicken Panini: $17.68";
                    }
                    break;
                    case 6:
                        System.out.println("Fried Chicken Sandwich - breaded chicken breast, american cheese," 
                              + "\nguacamole spread, tomatoes, honey mustard, on a brioche. "
                              + "\nThis is $17.68");
                        
                        System.out.print("Do You Want to Add This to Your order? "
                              + "Y For Yes N For No: ");
                        yn = scanner.next();
                        
                        if (yn.equalsIgnoreCase("Y")) {
                            price += 17.68;
                            order += "\nFried Chicken Sandwich: $17.68";
                        } else if (yn.equalsIgnoreCase("N")) {
                            order += "";
                        }   
                        break;
                    case 7:
                        System.out.println("Cubano - pulled pork, deli ham," 
                              + "Swiss cheese, pickles, and mustard."
                              + "\nThis is $17.68");
                        
                        System.out.print("Do You Want to Add This to Your order? "
                              + "Y For Yes N For No: ");
                        yn = scanner.next();
                        
                        if (yn.equalsIgnoreCase("Y")) {
                            price += 17.68;
                            order += "\nCubano: $17.68";
                        } else if (yn.equalsIgnoreCase("N")) {
                            order += "";
                        }
                        break;
                    case 8:
                        System.out.println("Falafel Wrap - hummus, tabbouleh, tahini sauce," 
                              + "rugula, falafel fritters."
                              + "\nThis is $16.64");
                        
                        System.out.print("Do You Want to Add This to Your order? "
                              + "Y For Yes N For No: ");
                        yn = scanner.next();
                        
                        if (yn.equalsIgnoreCase("Y")) {
                            price += 16.64;
                            order += "\nFalafel Wrap: $16.64";
                        } else if (yn.equalsIgnoreCase("N")) {
                            order += "";
                        }
                        break;
                    case 9:
                        System.out.println("Grilled Chicken Wrap - roasted sliced turkey, Swiss cheese, bacon," 
                              + "\nromaine hearts, sliced tomato, avocado," 
                              + "sriracha mayo, on toasted wheat bread."
                              + "\nThis is $16.64");
                        System.out.print("Do You Want to Add This to Your order? "
                              + "Y For Yes N For No: ");
                        yn = scanner.next();
                        
                        if (yn.equalsIgnoreCase("Y")) {
                            price += 16.64;
                            order += "\nGrilled Chicken Wrap: $16.64";
                        } else if (yn.equalsIgnoreCase("N")) {
                            order += "";
                        }
                        break;
                    case 10:
                        System.out.println("Turkey Avocado BLT - roasted sliced turkey, Swiss cheese, bacon," 
                              + "\nromaine hearts, sliced tomato, avocado," 
                              + "\nsriracha mayo, on toasted wheat bread." 
                              + "\nThis is $18.72");
                        
                        System.out.print("Do You Want to Add This to Your order? "
                              + "Y For Yes N For No: ");
                        yn = scanner.next();
                        
                        if (yn.equalsIgnoreCase("Y")) {
                            price += 18.72;
                            order += "\nTurkey Avocado BLT : $18.72";
                        } else if (yn.equalsIgnoreCase("N")) {
                            order += "";
                        }
                        break;
                    default:
                    	System.out.println("You have Inputed an Invalid Number For Burgers, Sandwiches," 
                                + "and Wraps."
                                + "\nPlease Enter a number Between 1 - 10");
                          break;
              }
          } while (burger_Sandwiches_Wraps< 1 || burger_Sandwiches_Wraps > 10);

          System.out.print("Do you want to add more items to your order? Y for Yes, N for No: ");
          moreItems = scanner.next();

          if (moreItems.equalsIgnoreCase("N")) {
              break;
          }
      }

      System.out.println("\nYour Order:");
      System.out.println(order);
      System.out.printf("Total: $%.2f\n", price);

      scanner.close();
  }
}