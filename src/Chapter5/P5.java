package Chapter5;

import java.util.*;

/**
 * Code to simulate voting.
 * @author Donovan Green
 */
public class P5 /**
 * Main Method
 *
 * @param args arguments from command line prompt
 */
{

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        String vote = "";
        int yesVote = 0;
        int noVote = 0;

        do {
            System.out.println("Enter Y for yes, N for no, or Q to quit voting.");
            vote = input.next().toUpperCase();

            if (vote.equals("Y")) {
                ++yesVote;
            } else if (vote.equals("N")) {
                ++noVote;
            }
        } while (!vote.equals("Q"));

        System.out.println("The vote is over");
        System.out.println("yes votes " + yesVote);
        System.out.println("no votes " + noVote);

    }
}
