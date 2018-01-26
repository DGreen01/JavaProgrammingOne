package Chapter2;

import java.util.*;

/**
 * Code to show the volume of a cylinder
 *
 * @author Donovan Green
 */
public class C2_2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        final double PIE = 3.14;
        System.out.println("Please enter the Radius");
        double rad = input.nextDouble();
        System.out.println("PLease enter the Length");
        double len = input.nextDouble();
        double area = Math.pow(rad, 2) * PIE;
        double vol = area * len;
        System.out.print("The area of the cylinder is " + area);
        System.out.println("The volume of the cylinder is " + vol);

    }
}
