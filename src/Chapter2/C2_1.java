package Chapter2;

import java.util.*;

/**
 * Code to show Celsius to Fahrenheit
 *
 * @author Donovan
 */
public class C2_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a degree in Celsius");
        double cel = input.nextDouble();
        double far = (9.0 / 5.0 * cel) + 32;
        System.out.println(cel + " Celsius is " + far + " Fahrenheit");
    }
}
