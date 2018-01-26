package Chapter4;

import java.util.Scanner;

/**
 * Code to show number of hours and cost
 *
 * @author Donovan Green
 */
public class P4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String args[]) {

        {
            Scanner input = new Scanner(System.in);

            System.out.println("What is the name of the first company?");
            String name1 = input.next();

            System.out.println("How many hours of work will " + name1 + " require?");
            int hours1 = input.nextInt();

            System.out.println("How much does " + name1 + " charge per hour?");
            double charge1 = input.nextDouble();

            System.out.println("What is the name of the second company?");
            String name2 = input.next();

            System.out.println("How many hours of work will " + name2 + " require?");
            int hours2 = input.nextInt();

            System.out.println("How much does " + name2 + " charge per hour?");
            double charge2 = input.nextDouble();

            double rate1 = hours1 * charge1;
            double rate2 = hours2 * charge2;

            if (rate1 < rate2) {
                System.out.println("The winner is " + name1);
                System.out.printf("Total Cost:$%.2f", rate1);
            } else if (rate1 > rate2) {
                System.out.println("The winner is " + name2);
                System.out.printf("Total Cost:$%.2f", rate2);
            } else if (rate1 == rate2 && hours1 < hours2) {
                System.out.println("The winner is " + name1);
                System.out.printf("Total Cost:$%.2f", rate1);
                System.out.println("Number of hours: " + hours1);
            } else if (rate1 == rate2 && hours1 > hours2) {
                System.out.println("The winner is " + name2);
                System.out.printf("Total Cost:$%.2f", rate2);
                System.out.println("Number of hours: " + hours2);
            } else if (rate1 == rate2 && hours1 == hours2) {
                System.out.println("Same offer");
            }
            System.out.printf("Total Cost:$%.2f", rate2);
            System.out.println("Number of hours: " + hours2);

        }
    }
}
