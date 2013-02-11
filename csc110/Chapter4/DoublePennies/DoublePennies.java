/**
*
* This program asks the user for the number of days they worked and then calculates
* what their pay would be if they were paid a penny on the first day and then doubled
* each subsequent day.
*
*/

import java.util.Scanner;
import java.text.NumberFormat;

public class DoublePennies
{
    public static void main(String[] args)
    {
        // declare the needed variables
        int daysWorked = 0;
        double dailyPay = 0.01, totalPay = 0.0;
        Scanner userInput = new Scanner(System.in);
        NumberFormat cf = NumberFormat.getCurrencyInstance();
        
        // ask the user for the number of days they worked
        System.out.print("Enter the number of days you worked: ");
        
        // make sure the user gave us a number
        if (userInput.hasNextInt())
          daysWorked = userInput.nextInt();
        else
        {
          System.out.println("I asked for a number dummy.");
          System.exit(0);
        }
        
        // if we got a number make sure it's greater than 1
        if ( daysWorked < 1)
        {
          System.out.println("I need a number larger than 1 to calculate your pay.");
          System.exit(0);
        }
        
        // start by printing the header for our table
        System.out.println("\n");
        System.out.println("Days  " + "  $Pay  ");
        System.out.println("----  " + "  ----  ");
        
        // use a for loop to calculate how much the user will be paid & print the rest of our table
        for (int i = 1; i <= daysWorked; i++)
        {
          System.out.println( i + "       " + cf.format(dailyPay) );
          totalPay += dailyPay;
          dailyPay *= 2;
        }
        
        // now print the total for all days worked
        System.out.println("\n\nThe total amount you earned is: " + cf.format(totalPay) + "\n");
    }
}

