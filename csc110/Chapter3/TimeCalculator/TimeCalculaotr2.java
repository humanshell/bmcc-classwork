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

public class TimeCalculaotr2
{
    public static void main(String[] args)
    {
        // declare our variables
        int days = 0,
            hours = 0,
            minutes = 0,
            seconds = 0,
            remainingSeconds = 0;
        
        Scanner userInput = new Scanner(System.in) ;
        
        // ask the user for the number of seconds
        System.out.print("Please enter the number of seconds to calculate: ");
        
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
        
        
    }
}

