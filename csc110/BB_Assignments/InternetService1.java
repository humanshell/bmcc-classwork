/**
*
* This program asks the user for their current internet service level (A, B or C)
* and how many minutes they used their service this month. It then claculates what
* their current bill is.
*
* Package A: $9.95/mo  - 10 hours of access included. $2.00 each additional hour
* Package B: $13.95/mo - 20 hours of access included. $1.00 each additional hour
* Package C: $19.95/mo - Unlimited access
*
*/

import java.util.Scanner;
import java.util.regex.*;

public class InternetService1
{
  public static void main(String[] args)
  {
    // declare the variables we'll need
		Scanner userInput = new Scanner(System.in);
		String internetPackage = "";
		int hoursOnline = 0;
	
		// declare constants to keep the code cleaner and easier to maintain
		final double PKGA_MONTHLY =  9.95;
		final double PKGB_MONTHLY = 13.95;
		final double PKGC_MONTHLY = 19.95;
		final double PKGA_HOURLY  =  2.00;
		final double PKGB_HOURLY  =  1.00;
	
		// create a regex pattern so we can check the user's input
		Pattern p = Pattern.compile("[abcABC]");
	
		// ask the user for their current internet access package
		System.out.print("\nEnter your current internet access package (A, B or C): ");
	
		// make sure the user entered something useful
		if (userInput.hasNext(p))
		{
			// if they can follow directions, read the input into our package variable
			internetPackage = userInput.next();
			internetPackage = internetPackage.toUpperCase();
		}
		else // yell at them and exit...
		{
			System.out.println("\nPlease restart this program and enter A, B or C.\n");
			System.exit(1);
		}
	
		// lets try and catch "Package C" here. We can get outa this whole program and tell
		// the user they have an unlimited plan before running our if statements below
		if (internetPackage.contentEquals("C"))
		{
			System.out.println("\nYou have an unlimited package. Your bill for this month is $" + PKGC_MONTHLY + "\n");
			System.exit(0);
		}
	
		// ask the user for the total number of hours spent online
		System.out.print("\nEnter the total number of hours you spent online this month: ");
	
		// make sure the user entered something useful
		if (userInput.hasNextInt())
		{
			// read the input into our package variable
			hoursOnline = userInput.nextInt();
		}
		else // yell at them and exit
		{
			System.out.println("\nPlease restart this program and enter a valid number of hours spent online.\n");
			System.exit(1);
		}
	
		// now that we have both of our variables lets calculate the users bill
		if (internetPackage.contentEquals("A"))
		{
			// Check to see if the hours spent online are more than 10.
			if (hoursOnline > 10)
			  System.out.println("\nYour total bill for this month comes to $" + (((hoursOnline - 10) * PKGA_HOURLY) + PKGA_MONTHLY));
			else // the user only owes the monthly fee
			  System.out.println("\nYour total bill for this month is $" + PKGA_MONTHLY);
		}
		else // the only possibility left is "Package B"
		{	
		  if (hoursOnline > 20)
			  System.out.println("\nYour total bill for this month comes to $" + (((hoursOnline - 20) * PKGB_HOURLY) + PKGB_MONTHLY));
			else
			  System.out.println("\nYour total bill for this month is $" + PKGB_MONTHLY);
		}
  }
}

