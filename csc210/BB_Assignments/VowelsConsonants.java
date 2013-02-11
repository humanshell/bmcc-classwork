/**
 *
 * Assignment 1 - Part 1 - 9/15/2011
 *
 * This program asks the user to enter a letter of the alphabet at the terminal and
 * determines if it's a vowel or a consonant. It uses an if-else statment and a switch.
 * 
 * @author Dominic Giglio, CSC 210 Sec 121
 *
 */

import java.util.Scanner;
import java.util.regex.Pattern;

public class VowelsConsonants
{

    public static void main(String[] args)
    {

      // declare variables
      Scanner keyboard = new Scanner(System.in);
      String letter_input = "";
      int letter_output = 0;
      
      // compile a regular expression for validating user input
      Pattern input_pattern = Pattern.compile("[a-zA-Z]");
      
      // ask the user to enter a letter
      System.out.print("Please enter a letter from a-z: ");
      
      // make sure the user entered a valid letter
      if (keyboard.hasNext(input_pattern)) {
        letter_input = keyboard.next();
      } else {
        System.out.println("You must enter a letter between a-z or A-Z");
        System.exit(1);
      }
      
      // first we use an if-else statement to assign a 1 to vowels and a 0 to consonants
      if (letter_input.matches("[aeiouyAEIOUY]")) {
        letter_output = 1;
      } else {
        letter_output = 0;
      }
      
      // now use a switch statement to tell the user what kind of letter they entered
      switch (letter_output) {
        case 0:  System.out.println("You entered a consonant!"); break;
        case 1:  System.out.println("You entered a vowel!"); break;
        default: System.out.println("Something went REALLY wrong!!");
      }

    } // end main()

} // end VowelsConsonants class
