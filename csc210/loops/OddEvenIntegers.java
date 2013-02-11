/**
 *
 * This program ask the user for 2 integers (second must be larger than the first).
 * It then outputs:
 * 1. all odd numbers between num1 and num2
 * 2. the sum of all even numbers between num1 and num2
 * 3. the average of the odd numbers between num1 and num2
 *
 */

import java.util.Scanner;

public class OddEvenIntegers
{

    public static void main(String[] args)
    {

      // declare variables
      Scanner userInput = new Scanner(System.in);
      int num1 = 0, num2 = 0, evenResult = 0, oddCount = 0, oddResult = 0;
      
      // ask the user for the first number
      System.out.print("\nPlease enter an integer: ");
      if (!userInput.hasNextInt()) {
        System.out.println("\nI said enter an integer!!!");
        System.exit(1);
      } else {
        num1 = userInput.nextInt();
      }
      
      // ask the user for the second number
      System.out.print("\nPlease enter another integer: ");
      if (!userInput.hasNextInt()) {
        System.out.println("\nI said enter an integer!!!");
        System.exit(1);
      } else {
        num2 = userInput.nextInt();
      }
      
      // make sure num2 is larger than num1
      if (num1 > num2) {
        System.out.println("\nThe second number must be greater than the first!");
        System.exit(1);
      }
      
      // find and print all odd numbers between num1 and num2
      System.out.println("\nOdd numbers between first and second integer:");
      for (int i = num1 + 1; i < num2; i++) {
        if (i % 2 != 0) {
          System.out.println(i);
        }
      }
      
      // find and print the sum of all even numbers between num1 and num2
      for (int i = num1 + 1; i < num2; i++) {
        if (i % 2 == 0) {
          evenResult += i;
        }
      }
      
      System.out.println("\nThe sum of all even numbers between first and second integer: " + evenResult);
      
      // find and print the average of all odd numbers between num1 and num2
      for (int i = num1 + 1; i < num2; i++) {
        if (i % 2 != 0) {
          oddCount++;
          oddResult += i;
        }
      }
      
      System.out.println("\nThe average of all odd numbers between first and second integer: " + (double)(oddResult / oddCount));

    } // end main()

} // end OddEvenIntegers class
