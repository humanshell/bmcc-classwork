/**
  This is a program that tests "if" something is true and prints
  a message for the user to tell them the result of the test
*/

import java.util.Scanner;

public class First3
{
    public static void main(String[] args)
    {
        // Declare our variables
        double grade1 = 0.0, grade2 = 0.0, grade3 = 0.0, average = 0.0;
        Scanner userInput = new Scanner (System.in);
        
        // Ask the user for two numbers
        System.out.print("\nPlease enter your first grade: ");
        grade1 = userInput.nextDouble();
        
        System.out.print("\nPlease enter your second grade: ");
        grade2 = userInput.nextDouble();
        
        System.out.print("\nPlease enter your third grade: ");
        grade3 = userInput.nextDouble();
        
        average = (grade1 + grade2 + grade3)/3;
        
        // 
        if (average >= 60)
        {
          // Tell the user if the above statement is true
          System.out.println("You passed!!");
        } else {
          // Tell the user it's false
          System.out.println("You failed!!");
        }
    }
}

