/**
 *
 * This program reads in integers from the terminal
 * and stops when a negative number has been entered
 *
 * Until a negative integer has been read in the program
 * calculates the average of all integers entered and
 * outputs that averaage and largest integer
 *
 */

import java.util.Scanner;

public class NonNegative
{

    public static void main(String[] args)
    {

      // declare variables
      Scanner terminalInput = new Scanner(System.in);
      int currentNum = 0, largestNum = 0, count = 0;
      double runningTotal = 0.0;
      
      do {
        
        // ask the user for an integer
        System.out.print("Please enter an integer (enter a negative integer to end): ");
        currentNum = terminalInput.nextInt();
        
        // check integer size & store if larger than largestNum
        if (currentNum > largestNum) {
          largestNum = currentNum;
        }
        
        // increment counter and update running total
        count++;
        runningTotal += currentNum;
        
      } while (currentNum >= 0);
      
      // print the average and largest number entered
      System.out.println("The largest integer entered is: " + largestNum);
      System.out.println("The average of all integers is: " + runningTotal / count);

    } // end main()

} // end NonNegative class


