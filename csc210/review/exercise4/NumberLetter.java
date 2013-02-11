/**
 * This program asks the user to enter a number.
 *
 * If it's less than 10 print the number.
 * IF it's greater than 9 print the ASCII number for the letter
 *
 */

import java.util.*;

public class NumberLetter
{

    public static void main(String[] args)
    {

      // declare variables
      int user_input = 0;
      char char_output;
      Scanner keyboard = new Scanner(System.in);
      
      // ask the user to enter a number
      System.out.print("Please enter a number: ");
      
      // check to see what the user entered
      if (!keyboard.hasNextInt()) {
        System.out.println("You must enter a number! Please restart the program.");
        System.exit(1);
      } else {
        user_input = keyboard.nextInt();
      }
      
      // print out what the user entered
      if (user_input < 10) {
        System.out.println("You entered: " + user_input);
      } else {
        user_input += 55;
        char_output = (char)user_input;
        System.out.println("You entered: " + char_output);
      }
      

    } // end main()

} // end numberletter class
