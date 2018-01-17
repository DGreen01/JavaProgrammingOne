
package Chapter6;
import java.util.*;
/**
 * Code to calculate change in currencies.
 * @author Donovan Green
 */
public class P6

{
    public static void main(String args[])
    /** * Main Method
 *
 * @param args arguments from command line prompt
 */
    {
        Scanner input = new Scanner(System.in);
  
        System.out.println("How many Euros will a dollar buy? ");
        double euroRate = input.nextDouble();
        
        System.out.println("How many Pound Sterling will a dollar buy? ");
        double poundSterlingRate = input.nextDouble();
        
        System.out.println("How many Yen will a dollar buy? ");
        double yenRate = input.nextDouble();
        
        // Currencies you are buying
        double eurosBought, poundSterlingBought, yenBought;
        
        // Currency codes E-Euro, P-Pound, Y-Yen
        String currency;
        // User reply if they want to perform more conversions
        String reply;
        
        do 
        {
            System.out.print("Please enter the number of dollars you want to convert: $");
            double dollars = input.nextDouble();
            System.out.print("Enter \"E\" to buy Euros, \"P\" to buy Pounds or \"Y\" to buy Yen: ");
            currency = input.next().toUpperCase();

            // Chosing a conversion to perform based on the user selection
            switch (currency) 
            {
                case "E":
                    eurosBought = conversion(dollars, euroRate);
                    System.out.printf("For %.2f dollars, you will be able to buy %.2f Euros.\n", dollars, eurosBought);
                    break;
                case "P":
                    poundSterlingBought = Conversion(dollars, poundSterlingRate);
                    System.out.printf("For %.2f dollars, you will be able to buy %.2f Pound Sterlings.\n", dollars, poundSterlingBought);
                    break;
                case "Y":
                    yenBought = Conversions(dollars, yenRate);
                    System.out.printf("For %.2f dollars, you will be able to buy %.2f Yen.\n", dollars, yenBought);
                    break;
            }

            // Asking the user if they want to perform more conversions
            do 
            {
                System.out.print("Are there more conversions to perform? ");
                reply = input.next();
            } while (!reply.equalsIgnoreCase("yes") && !reply.equalsIgnoreCase("no"));
                    
        } while (reply.equalsIgnoreCase("yes"));
    }
    public static double conversion(double dollars, double euroRate)
        {
        double eurosBought = 0;
       
            if(dollars > 100)
            {
                double fee1 = dollars * .05;
                eurosBought = (dollars - fee1) * euroRate;
            }
            else if(dollars < 100)
            {
                double fee2 = dollars * .10;
                eurosBought = (dollars - fee2) * euroRate;
            }
            else if(dollars == 1000)
            {
                dollars = 950;
                eurosBought = dollars * euroRate;
            }
        return eurosBought;
        }
    public static double Conversion(double dollars, double  poundSterlingRate)
        {
      double poundSterlingBought = 0;
       
            if(dollars > 100)
            {
                double fee1 = dollars * .05;
                poundSterlingBought = (dollars - fee1) * poundSterlingRate;
            }
            else if(dollars < 100)
            {
                double fee2 = dollars * .10;
                poundSterlingBought = (dollars - fee2) * poundSterlingRate;
            }
            else if(dollars == 1000)
            {
                dollars = 950;
                poundSterlingBought = dollars * poundSterlingRate;
            }
        return poundSterlingBought;
        }
       
    public static double Conversions(double dollars, double  yenRate)
        {
        double yenBought = 0;
       
            if(dollars > 100)
            {
                double fee1 = dollars * .05;
                yenBought = (dollars - fee1) * yenRate;
            }
            else if(dollars < 100)
            {
                double fee2 = dollars * .10;
                yenBought = (dollars - fee2) * yenRate; 
            }
            else if(dollars == 1000)
            {
                dollars = 950;
                yenBought = dollars * yenRate;
            }
        return yenBought;
        }
                
}

