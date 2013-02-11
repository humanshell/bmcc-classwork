/**
 *
 * Assignment 4 - Part 1 - 10/17/2011.
 *
 * This class defines a Lottery object that holds a randomly generated array of winning
 * lottery numbers and a method that accepts an array of 5 integers. The method compares
 * the array passed in with the array of winning numbers and returns the number of matches.
 * 
 * @author Dominic Giglio, CSC 210 Sec 121
 *
 */

import java.util.Random;

public class Lottery {
  
  // declare a 5 integer array to store the winning numbers
  int[] lotteryNumbers = new int[5];

  // no-arg constructor that randomly generates 5 winning numbers
  public Lottery() {
    Random quickPick = new Random();
    for (int i = 0; i < lotteryNumbers.length; i++) {
      lotteryNumbers[i] = quickPick.nextInt(9);
    }
  }

  /**
   * Accessor for the lotteryNumbers array.
   *
   * @return The lotteryNumbers array
   */
  public int[] getWinningNumbers() {
    return lotteryNumbers;
  }

  /**
   * public method to compare a user's lottery picks to the winning numbers.
   * Each time through the inner loop if a match is found the numbers are
   * changed so they can't be matched again on subsequent iterations.
   *
   * @param array An array of 5 integers to compare to the winning numbers
   * @return The number of matches
   */
  public int compare(int[] userNumbers) {
    int matches = 0;

    for (int i = 0; i < lotteryNumbers.length; i++) {
      for (int j = 0; j < userNumbers.length; j++) {
        if (userNumbers[j] == lotteryNumbers[i]) {
          // change the matched indexes in both arrays so they can't be matched again
          userNumbers[j] = -1;
          lotteryNumbers[i] = -2;

          // increment the matches accumulator
          matches++;
        }
      }
    }

    return matches;
  }

}
