/**
*
* Test Average - Thursday February 10, 2011
*
* This program asks the user to enter three separate test scores and
* then displays each score as well as an average of all three scores
*
*/

import java.util.Scanner;

public class Average
{
    public static void main(String[] args)
    {
        // Declare and initialize our variables
        // We're using floats incase the user decides to enter a decimal score (i.e. 89.3)
        float test1 = 0.0F, test2 = 0.0F, test3 = 0.0F, avg = 0.0F;
        Scanner keyboardInput = new Scanner(System.in);;
        
        // Ask the user for their first test score
        System.out.print("\nPlease enter the score from your first test: ");
        test1 = keyboardInput.nextFloat();
        
        // Ask the user for their second test score
        System.out.print("Please enter the score from your second test: ");
        test2 = keyboardInput.nextFloat();
        
        // Ask the user for their third test score
        System.out.print("Please enter the score from your third test: ");
        test3 = keyboardInput.nextFloat();
        
        // Calculate the average of all three scores
        avg = (test1 + test2 + test3)/3;
        
        // Display the users three test scores and thir average
        System.out.println("\nYour first test score was: " + test1);
        System.out.println("Your second test score was: " + test2);
        System.out.println("Your third test score was: " + test3);
        System.out.println("The average of all three scores is: " + avg + "\n");
    }
}
