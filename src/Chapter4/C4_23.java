package Chapter4;

import java.util.*;

/**
 * Code to simulate an employee
 *
 * @author Donovan Green
 */
public class C4_23 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the employee name");
        String name = input.next();
        System.out.println("Enter the amont of hours worked");
        double hoursWorked = input.nextDouble();
        System.out.println("Enter pay rate");
        double payRate = input.nextDouble();
        System.out.println("Enter federal withholding tax rate");
        double holdingTax = input.nextDouble();
        System.out.println("Enter state withholding tax rate");
        double stateTax = input.nextDouble();
        double grossPay = hoursWorked * payRate;
        double deduction1 = grossPay * holdingTax;
        double deduction2 = grossPay * stateTax;
        System.out.printf("Employee name: %s", name);
        System.out.printf("\n Hours Worked: %.2f", hoursWorked);
        System.out.printf("\n Pay Rate: $%.2f", payRate);
        System.out.printf("\n Gross Pay: $%.2f", grossPay);
        System.out.println("Deductions:");
        System.out.printf("\n Federal Withholding Tax: $%.2f", deduction1);
        System.out.printf("\n State Withholding Tax: $%.2f", deduction2);
        System.out.printf("\nTotal Deduction $ " + (deduction1 + deduction2));
        System.out.printf("\nNet Pay $ " + (grossPay - deduction1 - deduction2));
    }
}
