/**
 *
 * Rock, Paper, Scissors Game - prog 17 pg 294
 * This program lets the user play the game Rock, Paper, Scissors against the computer.
 * When the program runs a random number of 1-3 is generated. If the number is 1 then the computer has chosen rock,
 * if it's 2 the computer has chosen paper and if it's 3 the computer chose scissors. Don't display the computer's choice yet.
 * Next the user enters their choice at the keyboard. Then the computers choice is displayed.
 * A winner is selected based on the following rules:
 *
 * 1 - if the player chooses rock and the computer chooses scissors then rock wins
 * 2 - if the player chooses scissors and the computer chooses paper than scissors wins
 * 3 - if the player chooses paper and the computer chooses rock then paper wins
 * 4 - if both players choose the same then the game should run again
 *
 */

import java.util.Scanner;
import java.util.Random;
import java.util.regex.*;

public class RockPaperScissors
{

    public static void main(String[] args)
    {

      // generate the random number for the computer's choice
      int computerChoice = generateRandomNumber(3);
      
      // ask the user for their choice
      System.out.println("\nWelcome to Ro Cham Beau! Also known as Rock Paper Scissors.");
      System.out.println("The computer has already made its choice. Now it's your turn...\n");
      System.out.print("Please enter \"Rock\", \"Paper\" or \"Scissors\": ");
      int playerChoice = getPlayerChoice();
      
      // if the choices are the same then restart the game otherwise print out the results
      if (computerChoice == playerChoice)
      {
        System.out.println("\nThe game was a draw. Starting over...");
        main(args);
      }
      else
      {
        printResults(playerChoice, computerChoice);
      }

    } // end main()
    
    // Methods:
    
    /**
     *
     * generateRandomNumber() - generates a random number
     * @param An integer used to limit the return value
     * @return A random number
     *
     */ 
    public static int generateRandomNumber(int i)
    {
      
      // instantiate a random number generator
      Random generator = new Random();
      
      // return a random number constrained by the limit parameter
      return generator.nextInt(i) + 1;
      
    } // end generateRandomNumber()
    
    
    /**
     *
     * getPlayerChoice() - get the player's choice from the keyboard
     * @return The input entered at the keyboard as an integer
     *
     */
      public static int getPlayerChoice()
      {

        // instantiate a scanner, a regex to test input and a variable to hold the input
        Scanner keyboard = new Scanner(System.in);
        Pattern p = Pattern.compile("Rock|rock|Paper|paper|Scissors|scissors");
        String input;
        int x = 0;

        // if the user did not enter one of the allowed choices then tell them and exit
        if (!keyboard.hasNext(p)) { System.out.println("You must enter one of the choices listed."); System.exit(1); }

        // store the value entered and convert it to lowercase letters
        input = keyboard.next().toLowerCase();

        // convert the player's choice to a number and return it
        if (input.contentEquals("rock"))     { x = 1; }
        if (input.contentEquals("paper"))    { x = 2; }
        if (input.contentEquals("scissors")) { x = 3; }

        return x;

      } // end getPlayerChoice()
     
     
     /**
      *
      * printResults() - print out the results of the game
      * @param The player's choice
      * @param The computer's choice
      *
      */ 
      public static void printResults(int p, int c)
      {

        // if one player chooses rock and the other chooses scissors then rock wins
        if (p == 1 && c == 3)
        {
          System.out.println("\nYou chose rock and the computer chose scissors...");
          System.out.println("YOU WIN!!!\n");
        }
        else if (p == 3 && c == 1)
        {
          System.out.println("\nYou chose scissors and the computer chose rock...");
          System.out.println("YOU LOSE!!!\n");
        }

        // if one player chooses scissors and the other chooses paper then scissors wins
        if (p == 3 && c == 2)
        {
          System.out.println("\nYou chose scissors and the computer chose paper...");
          System.out.println("YOU WIN!!!\n");
        }
        else if (p == 2 && c == 3)
        {
          System.out.println("\nYou chose paper and the computer chose scissors...");
          System.out.println("YOU LOSE!!!\n");
        }

        // if one player chooses paper and the other chooses rock then paper wins
        if (p == 2 && c == 1)
        {
          System.out.println("\nYou chose paper and the computer chose rock...");
          System.out.println("YOU WIN!!!\n");
        }
        else if (p == 1 && c == 2)
        {
          System.out.println("\nYou chose rock and the computer chose paper...");
          System.out.println("YOU LOSE!!!\n");
        }

      } // end printResults()

} // end RockPaperScissors class














