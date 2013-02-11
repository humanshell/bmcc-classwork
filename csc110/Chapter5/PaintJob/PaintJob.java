/**
 *
 * A painting company has determined that for every 115 sqft of wall space, 1 gallon of paint and 8 hrs of labor are required.
 * The company charges $18/hr for labor
 * This program allows the user to enter the number of rooms to be painted and the price of the paint per gallon.
 * It also asks for the sqft of wall space in each room.
 *
 */

import java.util.Scanner;
import java.text.NumberFormat;

public class PaintJob
{
  
    public static void main(String[] args)
    {
        // declare variables
        int totalRooms = 0;
        double squareFeet = 0.0,
               pricePerGallon = 0.0,
               totalGallonsRequired = 0.0,
               totalHoursRequired = 0.0,
               totalPaintCost = 0.0,
               totalLaborCharge = 0.0,
               totalCost = 0.0; 
        
        // declare and intialize our Scanner for user input
        Scanner userInput = new Scanner(System.in);
        
        // instantiate a general number and currency formater
        NumberFormat nf = NumberFormat.getInstance();
        NumberFormat cf = NumberFormat.getCurrencyInstance();
        
        // ask the user for the total number of rooms to be painted
        System.out.print("\nEnter the total number of rooms to be painted: ");
        
        // check to make sure the user entered a number, exit if they didn't
        if (!userInput.hasNextInt()) { System.out.println("You must enter a number, greater than 1."); System.exit(1); }
        
        // store the number of rooms
        totalRooms = userInput.nextInt();
        
        // make sure the user entered a number greater than 1, exit if they didn't
        if (totalRooms < 1) { System.out.println("There must be at least 1 room!"); System.exit(1); }
        
        // ask the user for the price of each gallon of paint
        System.out.print("Enter the price of each gallon of paint: ");
        
        // check to make sure the user entered a number, exit if they didn't
        if (!userInput.hasNextDouble()) { System.out.println("You must enter a valid price, greater than $1.00."); System.exit(1); }
        
        // store the price of each gallon of paint
        pricePerGallon = userInput.nextDouble();
        
        // make sure the user entered a number greater than 1, exit if they didn't
        if (pricePerGallon < 1) { System.out.println("Price per gallon cannot be less than $1.00."); System.exit(1); }
        
        // use a loop to ask the user for the sqft of each room
        for (int i = 1; i <= totalRooms; i++)
        {
          System.out.print("How many square feet of wall space are in room # " + i + ": ");
          
          // check to make sure the user entered a number, exit if they didn't
          if (!userInput.hasNextDouble()) { System.out.println("You must enter a number."); System.exit(1); }
          
          // store the room's square feet
          squareFeet = userInput.nextDouble();
          
          // make sure the user entered a number greater than 1, exit if they didn't
          if (squareFeet < 1) { System.out.println("There must be at least 1 square foot to paint."); System.exit(1); }
          
          // calculate the total number of gallons of paint required using the getGallonsRequired() method
          totalGallonsRequired += getGallonsRequired(squareFeet);
          
          // calculate the total number of hours of work required using the getHoursRequired() method
          totalHoursRequired += getHoursRequired(squareFeet);
        }
        
        // calculate the total cost of the paint using the getTotalPaintCost() method
        totalPaintCost = getTotalPaintCost(totalGallonsRequired, pricePerGallon);
        
        // calculate the total labor charge using the getTotalLaborCharge() method
        totalLaborCharge = getTotalLaborCharge(totalHoursRequired);
        
        // calculate the total cost of the paint job using the getTotalCost() method
        totalCost = getTotalCost(totalPaintCost, totalLaborCharge);
        
        // display all the details regarding this paint job to the user
        System.out.println("\nTotal number of gallons needed: " + nf.format(totalGallonsRequired));
        System.out.println("Total number of work hours: " + nf.format(totalHoursRequired));
        System.out.println("Total paint cost: " + cf.format(totalPaintCost));
        System.out.println("Total labor charge: " + cf.format(totalLaborCharge));
        System.out.println("\nTotal cost for the paint job: " + cf.format(totalCost) + "\n");
        
    } // end main()
    
    // Methods:
    // getGallonsRequired() - calculates the number of gallons of paint required
    public static double getGallonsRequired(double sqft)
    {
      double gallons = 1;
      if (sqft > 115) {
        gallons = sqft / 115;
        return gallons;
      }
      else {
        return gallons;
      }
    } // end getGallonsRequired()
    
    // getHoursRequired() - hours of labor required
    public static double getHoursRequired(double sqft)
    {
      double hours = 8;
      if (sqft > 115) {
        hours *= (sqft / 115);
        return hours;
      }
      else {
        return hours;
      }
    } // end getHoursRequired()
    
    // getTotalPaintCost() - the toal cost of the paint
    public static double getTotalPaintCost(double gallons, double cost)
    {
      double result = gallons * cost;
      return result;
    } // end getTotalPaintCost()
    
    // getTotalLaborCharge() - the total labor charges
    public static double getTotalLaborCharge(double hours)
    {
      double result = hours * 18;
      return result;
    } // end getTotalLaborCharge()
    
    // getTotalCost() - the total cost of the paint job
    public static double getTotalCost(double paintCost, double laborCharge)
    {
      double result = paintCost + laborCharge;
      return result;
    } // end getTotalCost()
    
} // end PaintJob class
