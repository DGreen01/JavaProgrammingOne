package Chapter5;

import java.util.*;

/**
 * Code to simulate Rock Paper Scissors
 *
 * @author Donovan Green
 */
public class C5_34 /**
 * Main Method
 *
 * @param args arguments from command line prompt
 */
{

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int computerGuess;
        int playerGuess;
        double computerCount = 0;
        double playerCount = 0;
        System.out.println("Welcome to RPS 0 is rock, 1 is paper, 2 is scissors..best of 3 good luck!!");
        System.out.println("Press enter to continue");
        String a = input.nextLine();

        // 0 = rock 
        // 1 = paper
        // 2 = scissors
        do {
            System.out.println("Chose a number out of 0 1 2");
            playerGuess = input.nextInt();
            computerGuess = (int) (Math.random() * 2);
            switch (playerGuess) {
                case 0:
                    if (computerGuess == 0) {
                        System.out.println("Its a tie");
                    }
                    if (computerGuess == 1) {
                        System.out.println("You lose");
                        ++computerCount;
                    }
                    if (computerGuess == 2) {
                        System.out.println("You win");
                        ++playerCount;
                    }
                    break;
            }
            switch (playerGuess) {
                case 1:
                    if (computerGuess == 0) {
                        System.out.println("You win");
                        ++playerCount;
                    }
                    if (computerGuess == 1) {
                        System.out.println("Its a tie");
                    }

                    if (computerGuess == 2) {
                        System.out.println("You lose");
                        ++computerCount;
                    }
                    break;
            }
            switch (playerGuess) {
                case 2:
                    if (computerGuess == 0) {
                        System.out.println("You lose");
                        ++computerCount;
                    }
                    if (computerGuess == 1) {
                        System.out.println("You win");
                        ++playerCount;
                    }
                    if (computerGuess == 2) {
                        System.out.println("Its a tie");
                    }
                    break;
            }

        } while (playerCount < 2 && computerCount < 2);
        if (playerCount == 2) {
            System.out.println("You have won!!");
        } else {
            System.out.println("The computer won");
        }

    }

}
