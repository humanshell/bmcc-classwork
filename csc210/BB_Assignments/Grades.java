/**
 *
 * Assignment 1 - Part 2 - 9/15/2011
 *
 * This program asks the user to enter a score. It then uses an if-else statment
 * and a switch statement to determine the user's letter grade.
 * 
 * @author Dominic Giglio, CSC 210 Sec 121
 *
 * For this program the following integers will be used to determine the letter grade:
 *
 * 1 = D
 * 2 = C
 * 3 = B
 * 4 = A
 *
 */

import java.util.Scanner;

public class Grades
{

    public static void main(String[] args)
    {

      // declare variables
      float score_input = 0.0F; // try to save memory wherever you can!
      int score_output = 0;
      Scanner keyboard = new Scanner(System.in);
      
      // ask the user for their score
      System.out.print("Please enter your score: ");
      
      // make sure the user entered a number that's below 100
      if (keyboard.hasNextFloat()) {
        score_input = keyboard.nextFloat();
        if (score_input < 0 || score_input > 100) {
          System.out.println("You must enter your score as a non-negative number between 0 and 100!");
          System.exit(0);
        }
      } else {
        System.out.println("You must enter your score as a non-negative number between 0 and 100!");
        System.exit(0);
      }
      
      // use an if-else-if statement to assign an integer to the user's score
      if (score_input >= 90)
        score_output = 4; // the user got an A
      else if (score_input >= 80 && score_input <= 89)
        score_output = 3; // the user got a B
      else if (score_input >= 70 && score_input <= 79)
        score_output = 3; // the user got a C
      else if (score_input >= 60 && score_input <= 69)
        score_output = 1; // the user got a D
      else
        score_output = 0; // the user got an F
      
      // use a switch statement to output the user's letter grade
      switch (score_output) {
        case 4:  System.out.println("You got an A!"); break;
        case 3:  System.out.println("You got an B!"); break;
        case 2:  System.out.println("You got an C!"); break;
        case 1:  System.out.println("You got an D!"); break;
        default: System.out.println("You got an F!"); break;
      }

    } // end main()

} // end Grades class
