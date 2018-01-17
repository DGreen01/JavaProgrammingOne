package Chapter3;

import java.util.*;

/**
 * Code to determine in numbers are divisible in certain circumstances
 *
 * @author Donovan
 */
public class C3_26 /**
 * Main Method
 *
 * @param args arguments from command line prompt
 */
{

    public static void main(String args[]) {
        // ask for input from the user
        System.out.println("Please enter a number");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        // is the number divisible by 5 and 6
        if (num % 5 == 0 && num % 6 == 0) {
            System.out.println("is " + num + " divisible by 5 and 6? True");
        }
        if (num % 5 != 0 || num % 6 != 0) {
            System.out.println("is " + num + " divisible by 5 and 6? False");
        }

        //is the number divisible by 5 0r 6 
        if (num % 5 == 0 || num % 6 == 0) {
            System.out.println("is " + num + " divisible by 5 or 6? True");
        }

        if (num % 5 != 0 && num % 6 != 0) {
            System.out.println("is " + num + " divisible by 5 or 6? Flase");
        }
        // is the number divisible by 5 or 6 but not both 
        if (num % 5 == 0 ^ num % 6 == 0) {
            System.out.println("is " + num + " divisible by 5 or 6, but not both? True");
        } else {
            System.out.println("is " + num + " divisible by 5 or 6, but not both? False");
        }

    }

}
