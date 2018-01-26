package Chapter5;

import java.util.*;

/**
 * code to show a String in reverse.
 *
 * @author Donovan Green
 */
public class C5_46 /**
 * Main Method
 *
 * @param args arguments from command line prompt
 */
{

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a message");

        String message = input.nextLine();
        String reverse = new StringBuffer(message).reverse().toString();
        String rev = reverse.toUpperCase();

        System.out.println(rev);

    }

}
