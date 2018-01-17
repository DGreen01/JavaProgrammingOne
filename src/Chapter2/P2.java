package Chapter2;

import java.util.*;

/**
 * Code to simulate the price of a meal
 *
 * @author Donovan
 */
public class P2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        double meal = 0;
        double drink = 0;
        double dessert = 0;
        double tax = 0;
        double tip = 0;
        double total = 0;
        double tax_total = 0;

        System.out.println("Please enter the price of your MEAL");
        meal = input.nextDouble();
        System.out.println("Please enter the price of your DRINK");
        drink = input.nextDouble();
        System.out.println("Please enter the price of your DESSERT");
        dessert = input.nextDouble();
        total = meal + drink + dessert;
        System.out.println("The total for your meal without TAX or TIP is " + total);
        tax = total * .10;
        tip = (total + tax) * .15;
        tax_total = total + tax + tip;
        System.out.println("The TAX of your meal is " + tax);
        System.out.println("The TIP of your meal is " + tip);
        System.out.println("The actual TOTAL of your meal is " + tax_total);

    }
}
