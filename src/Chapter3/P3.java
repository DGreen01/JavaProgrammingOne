package Chapter3;

import java.util.*;

/**
 * code to determine grades and dividing evenly
 *
 * @author Donovan Green
 */
public class P3 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a number");
        double num1 = input.nextDouble();
        System.out.println("please enter another number");
        double num2 = input.nextDouble();
        if (num1 < num2) {
            System.out.println(num1 + " is less than " + num2);
        }
        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        }
        if (num1 == num2) {
            System.out.println(num1 + " is equal to " + num2);
        }
        if (num1 <= num2) {
            System.out.println(num1 + " is less than or equal to " + num2);
        }
        if (num1 != num2) {
            System.out.println(num1 + " does not equal " + num2);
        }
        if (num2 == 0) {
            System.out.println(" can not divide by 0 ");
        }
        if (num1 / num2 < 1) {
            System.out.println(" Proper fraction ");
        } else if (num1 / num2 > 1) {
            System.out.println(" Improper fraction ");
        }
        if (num1 >= 90) {
            System.out.println(" A");
        } else if (num1 >= 80) {
            System.out.println(" B");
        } else if (num1 >= 70) {
            System.out.println(" C");
        } else if (num1 >= 60) {
            System.out.println(" D");
        } else if (num1 >= 50) {
            System.out.println(" F");
        }
        if (num2 <= 100 && num2 >= 1) {
            System.out.println(" In range");
        } else {
            System.out.println(" Out of range");
        }

    }
}
