package Chapter7;

import java.util.*;

/**
 * Code to check if arrays are equal
 *
 * @author Donovan Green
 */
public class C7_26 /**
 * Main Method
 *
 * @param args arguments from command line prompt
 * @param equals check if arrays are equal returns false if not true
 */
{

    public static void main(String args[]) {
        int[] list1 = null;
        int[] list2 = null;
        boolean equals;
        equals = equals(list1, list2);
    }

    public static boolean equals(int[] list1, int[] list2) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter how many elements are in the array");

        int n = input.nextInt();

        for (int x = 0; x < n; x++) {
            list1 = new int[n];
            list1[x] = input.nextInt();
        }
        for (int x = 0; x < n; x++) {
            list2 = new int[n];
            list2[x] = input.nextInt();
        }
        if (list1 == list2) {
            System.out.println("The arrays are identical");
            return true;
        } else {
            System.out.println("The arrays are different");
        }
        return false;
    }

}
