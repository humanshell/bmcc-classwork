/**
*
* This program will repeatedly ask you to enter an amount.
* Calculate and print the tax amount
* to stop the repetition enter -1 as the amount
*
*/

import java.util.Scanner;

public class LoopSentinel
{
    public static void main(String[] args)
    {
        // declare our variables
        Scanner userInput = new Scanner(System.in);
        double amt     = 0.0,
               taxRate = 0.08,
               taxAmt  = 0.0;
               
        do{
          // ask the user for the first number
          System.out.print("Please enter an amount to calculate (enter -1 to quit): ");
          amt = userInput.nextInt();
          
          // calculate and print the tax amount
          taxAmt = amt * taxRate;
          System.out.println("The amount you entered was: " + amt);
          System.out.println("The current tax rate is: " + taxRate);
          System.out.println("The total tax amount is: " + taxAmt);
          
        } while (amt != -1);
        
    }
}

