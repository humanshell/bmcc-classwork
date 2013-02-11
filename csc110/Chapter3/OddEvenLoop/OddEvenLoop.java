/**
  Write a java program that will ask the user to input a number 10 times.
  Then print out if the number is odd or even
*/

import java.util.Scanner;

public class OddEvenLoop
{
    public static void main(String[] args)
    {
        // declare our variables
        int number = 0, counter = 0;
        Scanner userInput = new Scanner(System.in);
        
        // our while loop
        while(counter < 10)
        {
          // ask the user for a number
          System.out.print("Please enter an integer: ");
          
          // check to see if the user entered a valid number
          if (userInput.hasNextInt())
          {
            number = userInput.nextInt();
          }
          else
          {
            System.out.println("Please enter a valid number, the whole program will now terminate.");
            System.exit(0);
          }
          
          // try and get a remainder
          number %= 2;
          
          // print out if it's odd or even
          if (number != 0)
            System.out.println("The number is odd.");
          else
            System.out.println("The number is even.");
            
          counter++;
        }        
    }
}

