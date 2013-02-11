/**
 * 
 * Assignment 4 - Part 1 - 10/17/2011.
 *
 * This program demonstrates the use of the Lottery class. It asks the user to
 * enter 5 lottery picks and then compares those to the randomly picked winners
 * in the lottery class. It then displays the number of matching numbers to the
 * user and if they got them all right it proclaims them to be the Grand Prize Winner
 *
 * @author Dominic Giglio, CSC 210 Sec 121
 *
 */

import java.util.Scanner;

public class LotteryDemo {
  
  public static void main (String[] args) {

    // create a Lottery object
    Lottery lotto = new Lottery();

    // create an array to hold the user's picks
    int[] userPicks = new int[5];

    // ask the user for their lotto picks
    System.out.print("\nPlease enter your 5 lotto picks separated by spaces: ");
    Scanner kb = new Scanner(System.in);
    String[] userInput = kb.nextLine().split(" ");

    for (int index = 0; index < userInput.length; index++) {
      userPicks[index] = Integer.parseInt(userInput[index]);
    }

    // print the winning lotto numbers
    System.out.println("\nWinning lotto numbers:");
    int[] winningNumbers = lotto.getWinningNumbers();
    for (int num : winningNumbers ) {
      System.out.print(" " + num);
    }
    System.out.println();

    // print the user's lotto numbers
    System.out.println("\nYour lotto numbers:");
    for (int num : userPicks ) {
      System.out.print(" " + num);
    }
    System.out.println();

    // tell the user how many numbers they matched 
    int matches = lotto.compare(userPicks);
    if (matches == 5) {
      System.out.println("\nYou got all 5 numbers correct! You are the Grand Prize Winner!!!");
    } else if (matches == 1) {
      System.out.println("\nYou got " + matches + " number correct.");
    } else {
      System.out.println("\nYou got " + matches + " numbers correct.");
    }

  }

}
