/**
*
* This program asks the user for the number of software packages they purchased
* and then calculates their discount based on the following table:
*
*  Quantity    Discount
*  10-19       20%
*  20-49       30%
*  50-99       40%
*  100+        50%
*
*/

import java.util.Scanner;

public class SoftwareSales
{
    public static void main(String[] args)
    {
        // define the constants for our 4 discount levels & price
        final double DISC1 = .2,
                     DISC2 = .3,
                     DISC3 = .4,
                     DISC4 = .5,
                     PRICE = 99.00;
        
        // declare our variables
        int packagesOrdered = 0;
        double userDiscount = 0.0, orderTotal = 0.0;
        Scanner userInput = new Scanner(System.in);
        
        // ask the user for the number of packages they purchased
        System.out.print("\nPlease enter the number of software packages you ordered: ");
        
        // make sure the user entered a valid number, if they didn't send them a message and then die
        if (userInput.hasNextInt())
          packagesOrdered = userInput.nextInt();
        else
        {
          System.out.println("\nYou messed something up, please re-enter a valid quantity.\n");
          System.exit(1);
        }
        
        // decide what discount to apply for the customer and then tell them
        if (packagesOrdered < 10)
          System.out.println("\nYou do not qualify for a discount.\nYour order comes to: $" + (packagesOrdered * PRICE) + "\n");
          
        else if (packagesOrdered >= 10 && packagesOrdered <= 19 )
        {
          userDiscount = packagesOrdered * PRICE * DISC1;
          orderTotal = packagesOrdered * PRICE - userDiscount;
          
          System.out.println("\nYou qualify for a 20% discount. The total discount for your order is: $" + userDiscount);
          System.out.println("Before the discount your total is: $" + packagesOrdered * PRICE);
          System.out.println("After the discount your total is: $" + orderTotal + "\n");
        }
        else if (packagesOrdered >= 20 && packagesOrdered <= 49 )
        {
          userDiscount = packagesOrdered * PRICE * DISC2;
          orderTotal = packagesOrdered * PRICE - userDiscount;
          
          System.out.println("\nYou qualify for a 30% discount. The total discount for your order is: $" + userDiscount);
          System.out.println("Before the discount your total is: $" + packagesOrdered * PRICE);
          System.out.println("After the discount your total is: $" + orderTotal + "\n");
        }
        else if (packagesOrdered >= 50 && packagesOrdered <= 99 )
        {
          userDiscount = packagesOrdered * PRICE * DISC3;
          orderTotal = packagesOrdered * PRICE - userDiscount;
          
          System.out.println("\nYou qualify for a 40% discount. The total discount for your order is: $" + userDiscount);
          System.out.println("Before the discount your total is: $" + packagesOrdered * PRICE);
          System.out.println("After the discount your total is: $" + orderTotal + "\n");
        }
        else // by now we know that the only choice left is that the user entered 100+
        {
          userDiscount = packagesOrdered * PRICE * DISC4;
          orderTotal = packagesOrdered * PRICE - userDiscount;
          
          System.out.println("\nYou qualify for a 50% discount. The total discount for your order is: $" + userDiscount);
          System.out.println("Before the discount your total is: $" + packagesOrdered * PRICE);
          System.out.println("After the discount your total is: $" + orderTotal + "\n");
        }
    }
}

