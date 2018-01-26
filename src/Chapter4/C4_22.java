package Chapter4;

import java.util.*;

/**
 * Code to display substrings
 *
 * @author Donovan Green
 */
public class C4_22 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String args[]) {
        System.out.println("Enter two strings");
        Scanner input = new Scanner(System.in);
        String s1 = input.next();
        String s2 = input.next();
        if (s1.contains(s2)) {
            System.out.println(s2 + " Is a substring of " + s1);
        } else {
            System.out.println(s2 + " Is not a substing of " + s1);
        }
    }
}
