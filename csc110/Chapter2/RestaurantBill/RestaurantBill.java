/**
*
* This program will ask the user for the total amount of their restaurant bill (before tax) and
* then calculate how much they owe after applying 6.75% tax and a 15% tip
*
*/

import java.util.Scanner;

public class RestaurantBill
{
    public static void main(String[] args)
    {
        // First we need to define our variables and constants
        final float TAX = 0.0675F,
                    TIP = 0.15F;
        
        Scanner userInput = new Scanner(System.in);
        
        float charge = 0.0F,
              tmpTax = 0.0F,
              tmpTip = 0.0F,
              finalBill = 0.0F;
        
        // Ask the user for the amount they were charged for their meal
        System.out.print("\nHow much were you charged for your meal before tax and tip: ");
        charge = userInput.nextFloat();
        
        // Calculate the final bill, TAX and TIP and display the amounts to the user
        tmpTax = charge * TAX;
        System.out.println("\n6.75% tax on your bill of $" + charge + " comes to: $" + tmpTax);
        
        tmpTip = (charge + tmpTax) * TIP;
        System.out.println("\nAfter tax your bill is $" + (charge + tmpTax) + ", which makes a 15% tip: $" + tmpTip);
        
        finalBill = charge + tmpTax + tmpTip;
        System.out.println("\nYour final bill after tax and tip comes to: $" + finalBill + "\n");
    }
}

