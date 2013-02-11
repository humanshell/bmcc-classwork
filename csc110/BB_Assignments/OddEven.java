/**
*
* Odd-Even number- Tuesday February 22, 2011 
*
* Write a java program that will input an integer
* Display or print the number if it is odd or if it's even
*
*/

import java.util.Scanner;

public class OddEvenNumber
{
    public static void main(String[] args)
    {
        // Declare our variables
        int number;
        Scanner userInput = new Scanner(System.in);
        
        // Ask the user for a number
        System.out.print("Please enter an integer: ");
        number = userInput.nextInt();
        
        // Try and get a remainder
        number %= 2;
        
        // test if the number is odd or even
        if (number != 0)
        {
          System.out.println("The number is odd.");
        } else {
          System.out.println("The number is even.");
        }
    }
}
