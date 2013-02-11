/**
 *
 * Write a program that asks the user input a series of non-negative integers.
 * The user should enter -1 to signal the end of the series. After all the numbers
 * have been entered, the program should display the largest and the smallest number entered.
 *
 */

import java.util.Scanner;

public class NonNegative
{

    public static void main(String[] args)
    {

      // declare variables
      Scanner kb = new Scanner(System.in);
      int currentNum = 0, smallestNum = 0, largestNum = 0;
      
      // ask the user for the first integer
      System.out.print("Please enter a non-negative integer (enter a -1 to end): ");
      currentNum = kb.nextInt();
      
      // set largest and smallest to the first number entered
      if (currentNum != -1) {
        smallestNum = largestNum = currentNum;
      }
      
      while (currentNum != -1) {
        
        // ask the user for another integer
        System.out.print("Please enter a non-negative integer (enter a -1 to end): ");
        currentNum = kb.nextInt();
        
        // check integer size & store if larger than largestNum
        if (currentNum > largestNum) {
          largestNum = currentNum;
        }
        
        // check integer size & store if smaller than smallestNum
        if (currentNum < smallestNum && currentNum != -1) {
          smallestNum = currentNum;
        }
        
      }
      
      // print the largest and smallest numbers entered
      System.out.println("The largest integer entered was: " + largestNum);
      System.out.println("The smallest integer entered was: " + smallestNum);

    } // end main()

} // end NonNegative class


