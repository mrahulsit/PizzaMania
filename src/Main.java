import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to PizzaMania! Please select the type of pizza:");
        System.out.println("1. Veg Pizza - Rs.300");
        System.out.println("2. Non-Veg Pizza - Rs.400");
        System.out.println("3. Delux Veg Pizza - Rs.550");
        System.out.println("4. Delux Non-Veg Pizza - Rs.650");

        int pizzaChoice = scanner.nextInt();

        Pizza pizza = null;
        switch (pizzaChoice) {
            case 1:
                pizza = new Pizza("Veg Pizza", 300);
                break;
            case 2:
                pizza = new Pizza("Non-Veg Pizza", 400);
                break;
            case 3:
                pizza = new DeluxPizza("Delux Veg Pizza", 550);
                break;
            case 4:
                pizza = new DeluxPizza("Delux Non-Veg Pizza", 650);
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
        System.out.println();
        if (!(pizza instanceof DeluxPizza)) {
            System.out.println("Would you like to add extra cheese? (Y/N)");
            String extraCheese = scanner.next();
            if (extraCheese.equalsIgnoreCase("Y")) {
                pizza.addExtraCheese();
            }

            System.out.println("Would you like to add extra toppings? (Y/N)");
            String extraToppings = scanner.next();
            if (extraToppings.equalsIgnoreCase("Y")) {
                pizza.addExtraToppings();
            }
        }

        System.out.println("Would you like to opt for take away (packaging charges Rs.20)? (Y/N)");
        String takeAway = scanner.next();
        if (takeAway.equalsIgnoreCase("Y")) {
            pizza.addTakeAway();
        }

        // Bill Generator
        System.out.println("\nPizza Ordered : " + pizza.getName());
        System.out.println("Pizza Base Price : Rs." + pizza.getBasePrice());
        if (pizza.getName() == "Veg Pizza" || pizza.getName() == "Non-Veg Pizza") {
            if (pizza.getExtraCheese() && pizza.getExtraToppings()) {
                System.out.println("Additional Toppings Price : Rs." + pizza.getToppingPrice());
                System.out.println("Additional Cheese Price : Rs." + pizza.getCheesePrice());
            } else if (pizza.getExtraCheese() && !(pizza.getExtraToppings())) {
                System.out.println("Additional Cheese Price : Rs." + pizza.getCheesePrice());
            } else if (!(pizza.getExtraCheese()) && pizza.getExtraToppings()) {
                System.out.println("Additional Toppings Price : Rs." + pizza.getToppingPrice());
            } else {
                System.out.println("No Additional Toppings or Cheese is added !");
            }
        } else {
            System.out.println("Delux Pizza Additional Toppings Price inclusive !");
            System.out.println("Delux Pizza Additional Cheese Price inclusive !");
        }
        if (pizza.getTakeaway() == true) {
            System.out.println("Takeaway Price : Rs." + pizza.getTakeawayPrice());
        } else {
            System.out.println("No Takeaways !");
        }
        System.out.println("Your total bill is: Rs." + pizza.calculateTotal());

        // Thank u Message
        System.out.println("\nThank u for Ordering from us !!! Visit Again....\n");
        scanner.close();
    }
}
