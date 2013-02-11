/**
*
* This program asks the user to enter a number of seconds and then converts it...
*
* If the number of seconds is greater than 60 then it displays the seconds as minutes
* If the number of seconds is greater than 3,600 then it displays the seconds as hours
* If the number of seconds is greater than 86,400 then it displays the seconds as days
*
*/

import java.util.Scanner;

public class TimeCalculator
{
    public static void main(String[] args)
    {
        // define our variables
        int days = 0, hours = 0, minutes = 0, seconds = 0;
        Scanner userInput = new Scanner(System.in);
        
        // ask the user for a number of seconds
        System.out.print("\nPlease enter the number of seconds you would like to convert: ");
          
        // check to make sure the user entered a valid number of seconds
        // if they didn't then give them some info and die
        if (userInput.hasNextInt())
          seconds = userInput.nextInt();
        else
        {
          System.out.println("\nOh Boy, you really messed something up. Please re-enter a number between 60 and 2,147,483,648\n");
          System.exit(1);
        }
        
        // print minutes, hours or days based on the amount of seconds entered
        if (seconds < 60)
          System.out.println("\nPlease enter a number greater than 59, otherwise there is nothing for me to convert!\n");
        
        else if (seconds >= 86400)
        {
          days = seconds / 86400;
          
            if (days > 1)
              System.out.println("\nThat would be " + days + " days.\n");
            else
              System.out.println("\nThat would be " + days + " day.\n");
        }
        
        else if (seconds >= 3600)
        {
          hours = seconds / 3600;
          
            if (hours > 1)
              System.out.println("\nThat would be " + hours + " hours.\n");
            else
              System.out.println("\nThat would be " + hours + " hour.\n");
        }
        
        else if (seconds >= 60)
        {
          minutes = seconds / 60;
          
            if (minutes > 1)
              System.out.println("\nThat would be " + minutes + " minutes.\n");
            else
              System.out.println("\nThat would be " + minutes + " minute.\n");
        } 
        
        System.exit(0);
    }
}

