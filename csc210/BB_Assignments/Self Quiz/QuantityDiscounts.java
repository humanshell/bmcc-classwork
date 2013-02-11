/**
 *
 * A software company sells a package that retails for $99.
 * Quantity discounts are given according to the following table:
 *
 *   Quantity       Discount
 *   10-19          20%
 *   20-49          30%
 *   50-99          40%
 *   100+           50%
 *
 * Write a program that asks the user to enter the number of packages purchased.
 * The program should then display the amount of the discount and the total amount
 * of the purchase after the discount.
 *
 */

import java.util.Scanner;

public class QuantityDiscounts
{

    public static void main(String[] args)
    {

      // declare variables
      Scanner keyboard = new Scanner(System.in);
      int packages_purchased = 0;
      
      // ask for total packages purchased
      System.out.print("Please enter the number of packages ordered: ");
      if (keyboard.hasNextInt()) {
        packages_purchased = keyboard.nextInt();
      } else {
        System.out.println("You must enter a number!");
        System.exit(1);
      }
      
      // if the quantity is less than 10 or greater than 99 we can print and exit now
      // saving ourselves from having to execute the rest of the code
      if (packages_purchased < 10) {
        System.out.println("Discount: none Total: $" + (packages_purchased * 99));
        System.exit(0);
      } 
      
      if (packages_purchased > 99) {
        System.out.println("Discount: $" + (packages_purchased * 99 * .5) + " Total: $" + (packages_purchased * 99));
        System.exit(0);
      }
      
      // output the discount and total amount if the quantity is between 10 and 99
      if (packages_purchased >= 10 && packages_purchased <= 19) {
        System.out.println("Discount: $" + (packages_purchased * 99 * .2) + " Total: $" + (packages_purchased * 99));
      } else if (packages_purchased >= 20 && packages_purchased <= 49) {
        System.out.println("Discount: $" + (packages_purchased * 99 * .3) + " Total: $" + (packages_purchased * 99));
      } else {
        System.out.println("Discount: $" + (packages_purchased * 99 * .4) + " Total: $" + (packages_purchased * 99));
      }

    } // end main()

} // end QuantityDiscounts class
