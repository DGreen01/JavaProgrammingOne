package Chapter2;

import java.util.*;

/**
 * Code to show gratuity
 *
 * @author Donovan Green
 */
public class C2_5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the subtotal");
        double sub = input.nextDouble();
        System.out.println("Please enter the gratuity");
        double grat1 = input.nextDouble();
        double grat2 = sub * grat1 / 100;
        double total = sub + grat2;
        System.out.println("The gratuity is $" + grat2 + " The total is $" + total);
    }

}
