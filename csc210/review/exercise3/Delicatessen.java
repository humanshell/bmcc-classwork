/**
 * This program takes orders from the internet to get the price and overnight shipping
 * for orders from a delicatessen.
 *
 * Regular shipping under $10 is $2.00
 * Regular shipping over $10 is $3.00
 * Over night shipping is an additional $5.00
 *
 * Ask the user what item they want and then ask if they want overnight shipping
 * Then display an invoice for what they want and how much it cost
 * Then display the shipping cost
 * and finally the total
 *
 */
 
import java.util.*;
import java.text.*;

public class Delicatessen
{

    public static void main(String[] args)
    {

      // declare variables
      String item_name;
      double item_price = 0.0, shipping_price = 0.0, total_price = 0.0;
      int overnight_shipping = 0;
      Scanner keyboard = new Scanner(System.in);
      
      // currency formatter
      NumberFormat cf = NumberFormat.getCurrencyInstance();
      
      // ask the user what item they want
      System.out.print("Enter the item: ");
      item_name = keyboard.next();
      
      // ask fo the price of the item
      System.out.print("Enter the price: ");
      item_price = keyboard.nextDouble();
      
      // ask the user if they want overnight shipping
      System.out.print("Would you like over night shipping? (enter 1 for yes 0 for no) ");
      overnight_shipping = keyboard.nextInt();
      
      // calculate the user's shipping cost
      if (item_price <= 10) {
        
        if (overnight_shipping == 1) {
          shipping_price = 7;
        } else {
          shipping_price = 2;
        }
        
      } else {
        
        if (overnight_shipping == 1) {
          shipping_price = 8;
        } else {
          shipping_price = 3;
        }
        
      }
      
      // calculate total price
      total_price = item_price + shipping_price;
      
      // print out the user's invoice
      System.out.println("Invoice:");
      System.out.println(item_name + " " + cf.format(item_price));
      System.out.println("Shipping: " + cf.format(shipping_price));
      System.out.println("Total: " + cf.format(total_price));

    } // end main()

} // end delicatessen class








