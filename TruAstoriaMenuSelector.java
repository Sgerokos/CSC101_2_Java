package TruAstoriaMenuSelector;

import java.util.Scanner;

public class TruAstoriaMenuSelector {

    public static void main(String[] args) {
        // Welcome's the user to the establishment
        System.out.println("Hello Welcome to Tru Astoria");
        System.out.println("\nWhat Would You Enjoy Today?");

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

        Scanner scanner = new Scanner(System.in);
        int burgerSandwichesWraps = scanner.nextInt();

        // The choice selected will print out what the item is and the price
        switch (burgerSandwichesWraps) {
            case 1:
                System.out.println("Tru Burger - sautéed onions, roasted red pepper, bacon," +
                        "\nSwiss cheese, sriracha maple mayo, brioche bun." +
                        "This is $18.72");
                break;

            case 2:
                System.out.println("Classic Cheeseburger - Lettuce, tomato, onion," +
                        "and American cheese on brioche bun." +
                        "This is $16.64");
                break;

            case 3:
                System.out.println("Salmon Burger" +
                        "- char-grilled wild-caught Atlantic salmon burger with a" +
                        "\nsignature Worcestershire sauce, shredded cabbage," +
                        "\nand mustard aioli. This is $19.76");
                break;

            case 4:
                System.out.println("Vegetable Panini - farmers pick of fresh grilled," +
                        "\nvegetables, sun dried tomato aioli on a pressed Italian roll." +
                        "This is $15.60");
                break;

            case 5:
                System.out.println("Greek Roast Chicken Panini - breaded chicken breast," +
                        "\namerican cheese, guacamole spread, tomatoes," +
                        "\nhoney mustard, on a brioche. " +
                        "\nThis is $17.68");
                break;

            case 6:
                System.out.println("Fried Chicken Sandwich - breaded chicken breast, american cheese," +
                        "\nguacamole spread, tomatoes, honey mustard, on a brioche. " +
                        "\nThis is $17.68");
                break;

            case 7:
                System.out.println("Cubano - pulled pork, deli ham," +
                        "Swiss cheese, pickles, and mustard." +
                        "\nThis is $17.68");
                break;

            case 8:
                System.out.println("Falafel Wrap - Bhummus, tabbouleh, tahini sauce," +
                        "rugula, falafel fritters." +
                        "\nThis is $16.64");
                break;
                
            case 9:
                System.out.println("Grilled Chicken Wrap - roasted sliced turkey, Swiss cheese, bacon," +
                        "\nromaine hearts, sliced tomato, avocado," +
                        "sriracha mayo, on toasted wheat bread." +
                        "\nThis is $16.64");
                break;

            case 10:
                System.out.println("Turkey Avocado BLT - roasted sliced turkey, Swiss cheese, bacon," +
                        "\nromaine hearts, sliced tomato, avocado," +
                        "\nsriracha mayo, on toasted wheat bread." +
                        "\nThis is $18.72");
                break;

            default:
                System.out.println("You have Inputed an Invalid Number For Burgers, Sandwiches," +
                        "and Wraps." +
                        "\nPlease Enter a number Between 1 - 10 For This Selection");
                break;
        }
    }
}