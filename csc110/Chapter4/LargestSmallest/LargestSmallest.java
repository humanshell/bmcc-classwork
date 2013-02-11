/**
*
* This program asks the user to enter a series of integers and then dosplays the largest and smallest of the integers entered.
* The program should stop taking integers when -99 is entered by the user.
*
*/

import java.util.Scanner;

public class LargestSmallest
{
    public static void main(String[] args)
    {
        // declare variables
        Scanner userInput = new Scanner(System.in);
        int number = 0, largest = 0, smallest = 0;
        
        // ask the user for the first integer
        System.out.print("\nPlease enter an integer (enter -99 to stop): ");
        
        // check to see if the user entered a valid number, if they did then
        // assign it to all of our variables initially
        if (userInput.hasNextInt())
          largest = smallest = number = userInput.nextInt();
        else
        {
          System.out.println("I said enter an integer you IDIOT!!!!.");
          System.exit(0);
        }
          
        // run a while loop to ask the user for the rest of the integers
        while (number != -99)
        {
          System.out.print("Please enter an integer (enter -99 to stop): ");
          
          // check to see if the user entered a valid number
          if (userInput.hasNextInt())
            number = userInput.nextInt();
          else
          {
            System.out.println("Are you a complete MORON????.");
            System.exit(0);
          }
          
          // check to see if the number is larger or smaller than "largest" and "smallest"
          if (number > largest)
            largest = number;
            
          if (number < smallest)
            smallest = number;
        }
        
        // when the user exits the while loop with a -99 we print out the largest
        // and smallest numbers they entered
        System.out.println("The largest number entered was: " + largest);
        System.out.println("The smallest number entered was: " + smallest);
    }
}

