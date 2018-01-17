package Chapter3;

import java.util.*;

/**
 * Code to simulate a heads and tails coin flip
 *
 * @author Donovan
 */
public class C3_14 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    {
        // ask for a guess
        System.out.println("Enter a guess 0 = Heads and 1 = Tails");
        // generate a random number and accept the user input
        int num = (int) (Math.random() * 2);
        Scanner input = new Scanner(System.in);
        int guess = input.nextInt();
        // heads if statement
        if (num == 0 && guess == 0) {
            System.out.println("It was Heads!");
        } else if (num == 0 && guess != 0) {
            System.out.println("Sorry it was Tails");
        }
        // tails if statement
        if (num == 1 && guess == 1) {
            System.out.println("It was Tails!");
        } else if (num == 1 && guess == 0) {
            System.out.println("Sorry it was Heads");
        }

    }
}
