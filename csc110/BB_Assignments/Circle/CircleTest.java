/**
 *
 * This is a program that tests the circle class
 *
 */

import java.util.Scanner;

public class CircleTest
{

  public static void main(String[] args)
  {

    // declare variables
    double radius = 0.0;
    Circle circle1 = new Circle();
    Scanner userInput = new Scanner(System.in);
    
    // get the radius from the user
    System.out.print("\nWhat is the radius of the circle? ");
    
    // check to make sure the user entered a number, error out if they didn't
    if (!userInput.hasNextDouble())
    {
      System.out.println("\nYou must enter a number, please try again.\n");
    }
    else
    {
      radius = userInput.nextDouble();
    }
    
    // set circle1 to some radius and instantiate a new circle2 with the user radius
    circle1.setRadius(3.4);
    Circle circle2 = new Circle(radius);
    
    // print the area, diameter and circumference for the user
    System.out.println("\nThe area of circle1 is: " + circle1.getArea());
    System.out.println("The diameter of circle1 is: " + circle1.getDiameter());
    System.out.println("The circumference of circle1 is: " + circle1.getCircumference());
    
    System.out.println("\nThe area of circle2 is: " + circle2.getArea());
    System.out.println("The diameter of circle2 is: " + circle2.getDiameter());
    System.out.println("The circumference of circle2 is: " + circle2.getCircumference() + "\n");

  } // end main()

} // end CircleTest class
