/**
* Write a program that will ask the user for their average and then print a
* specific response response based on that average
*/

import java.util.Scanner;

public class LetterGrade
{
    public static void main(String[] args)
    {
        // Declare the needed variables
        Scanner userInput = new Scanner(System.in);
        double avg = 0.0;
        
        // Ask the user for their average
        System.out.print("What is your average: ");
        avg = userInput.nextDouble();
        
        // Print out the users letter grade based on their average
        if (avg >= 90)
        {
          System.out.println("Your grade is currently an A");
          System.out.println("Congradulations!!");
          
          if (avg >= 95)
          {
            System.out.println("You get a scholoarship for $10!!");
          }
        }
        else if (avg >= 80)
        {
          System.out.println("Your grade is currently a B");
        }
        else if (avg >= 70)
        {
          System.out.println("Your grade is currently a C");
        }
        else if (avg >= 60)
        {
          System.out.println("Your grade is currently a D");
        }
        else
        {
          System.out.println("Your grade is currently a F");
        }
        
        System.exit(0);
    }
}

