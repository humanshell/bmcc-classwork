/**
*
* Java program that will ask you to enter your age. It will store the number and then display it
*
*/

import java.util.Scanner;

public class Age
{
    public static void main(String[] args)
    {
        // Declare and initialize all our variables
        int age = 0;
        float salary = 0.0F;
        String myName;
        Scanner keyboard = new Scanner(System.in);
        
        // Ask the user for his/her age and salary
        System.out.print("\nPlease enter your age: ");
        age = keyboard.nextInt();
        
        // Ask the user for his/her age and salary
        System.out.print("\nPlease enter your salary: ");
        salary = keyboard.nextFloat();
        
        // Ask the user for his/her age and salary
        System.out.print("\nPlease enter your name: ");
        myName = keyboard.next();
        
        System.out.println("\nYour name is: " + myName);
        System.out.println("The age you entered was: " + age);
        System.out.println("The salary you entered was: $" + salary + "\n");
    }
}
