package Chapter3;

import java.util.*;

/**
 * Code to compare prices of rice
 *
 * @author Donovan Green
 */
public class C3_33 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String args[]) {
// ask for weight and price of 1st rice 
        Scanner input1 = new Scanner(System.in);
        System.out.println("Please enter the weight of the rice in lbs");
        double num1 = input1.nextDouble();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Please enter the price rice in dollars");
        double num2 = input2.nextDouble();
// ask for waight and prce of 2nd rice
        Scanner input3 = new Scanner(System.in);
        System.out.println("Please enter the weight of the second rice in lbs");
        double num3 = input3.nextDouble();
        Scanner input4 = new Scanner(System.in);
        System.out.println("Please enter the price of the second rice in dollars");
        double num4 = input4.nextDouble();
// compare the values
        if (num1 % num2 > num3 % num4) {
            System.out.println("the second rice has a better value");
        }
        if (num3 % num4 > num1 % num2) {
            System.out.println("the first rice has the better ");
        }
        if (num1 % num2 == num3 % num4) {
            System.out.println("they both have the same value");
        }

    }
}
