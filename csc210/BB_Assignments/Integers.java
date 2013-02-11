/**
 *
 * Assignment 4 - Part 2 - 10/17/2011.
 *
 * This program reads in a list of integers and outputs their sum as well as all
 * the numbers read in, with each number annotated to say what percentage it
 * contributes to the sum. 
 *
 * @author Dominic Giglio, CSC 210 Sec 121
 *
 */

import java.util.Scanner;
import java.text.NumberFormat;

public class Integers {

  public static void main (String [] args) {
    
    // ask the user how many numbers they will enter
    System.out.print("\nHow many numbers will you enter? ");

    // store that number in a constant
    Scanner kb = new Scanner(System.in);
    final int NUMBERS = kb.nextInt();
    kb.nextLine(); // clear the carrage return from the scanner's buffer

    // create an int array with the size the user entered
    int[] intArray = new int[NUMBERS];

    // ask the user to enter the amount of numbers indicated
    System.out.print("\nEnter " + NUMBERS + " numbers: ");
    
    // store those numbers in an array and then add them to the intArray
    String[] strArray = kb.nextLine().split(" ");

    for (int i = 0; i < NUMBERS; i++) {
      intArray[i] = Integer.parseInt(strArray[i]);
    }

    // print out the sum of all the numbers
    System.out.println("\nThe sum is: " + sum(intArray));

    // print out the table of averages
    System.out.println("\nThe numbers are:");
    NumberFormat nf = NumberFormat.getPercentInstance();
    double percentage = 0.0;

    for (int i = 0; i < NUMBERS; i++) {
      percentage = (double)intArray[i] / (double)sum(intArray);
      System.out.println(intArray[i] + "   " + nf.format(percentage) + " of the sum.");
    }

  } // end main method

  // PRIVATE METHODS //

  /**
   * This method calculates the sum of the integers in the array passed to it.
   *
   * @param array An array of integers to sum
   * @return The total as an integer
   *
   */
  private static int sum(int[] array) {
    int sum = 0;
    for (int num : array){
      sum += num;
    }
    return sum;
  }
  
} // end Integer class

