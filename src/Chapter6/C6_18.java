package Chapter6;

import java.util.*;

/**
 * Code to check a password requirements.
 * @author Donovan Green
 */
public class C6_18 /**
 * Main Method
 *
 * @param args arguments from command line prompt
 * @param checkPassword checks password requirements
 * @return if password is valid
 */
{

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a password");
        String password = input.next();
        checkPassword(password);
    }

    public static boolean checkPassword(String password) {

        boolean valid = false, checkLength = false, letDig = false, twoDigits = false;

        int list = 0;
        int numList = 0;
        if (password.length() >= 8) {
            checkLength = true;
        } else {
            System.out.println("Password must have a minimun of 8 charaters");
            checkLength = false;
        }
        for (int x = 0; x < password.length(); ++x) {
            if (Character.isLetterOrDigit(password.charAt(x))) {
                list++;
            }
        }
        if (list >= password.length()) {
            letDig = true;
        }
        if (!letDig) {
            System.out.println("Password can only contain letters and digits");
            letDig = false;
        }
        for (int x = 0; x < password.length(); ++x) {
            if (Character.isDigit(password.charAt(x))) {
                numList++;
            }
        }
        if (numList >= 2) {
            twoDigits = true;
        } else {
            System.out.println("Passwrod must contain two digits");
            twoDigits = false;
        }
        if (checkLength && letDig && twoDigits) {
            valid = true;
            System.out.println("Valid password entry.");
        }
        return valid;
    }
}
