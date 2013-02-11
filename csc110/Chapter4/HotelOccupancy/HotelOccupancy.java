/**
 *
 * This program calculates the occupancy rate for a hotel.
 *
 * occupancy rate = number of rooms occupied / total number of rooms
 *
 * 1.) ask the user to enter the number of floors (cannot be less than 1)
 * 2.) use a loop to ask the user for the number of rooms on that floor (cannot be less than 10)
 * 3.) each time through the loop ask for the total number of rooms and how many are occupied
 * 4.) display total number of rooms
 * 5.) display the number of occupied rooms
 * 6.) display the number of unoccupied rooms
 * 7.) display the hotel's occupancy rate
 *
 */
 
 import java.util.Scanner;
 
 public class HotelOccupancy
 {
     public static void main(String[] args)
     {
        // declare variables
        Scanner userInput = new Scanner(System.in);
        int floors = 0, rooms = 0, totalRooms = 0, occupied = 0, totalOccupied = 0;

        // since this program puts a few restrictions on user input lets give them some instructions
        System.out.println("\nThis program will ask for the total number of floors for a hotel. Then");
        System.out.println("it will ask you for specifics about each of those floors. When it asks for");
        System.out.println("the total number of rooms on a specific floor you must enter at least 10.");
        System.out.println("Once the program is done it will display a summary of what you entered.\n");
        
        // ask the user for the total number of floors
        // then store that value if it's a number not less than 1
        System.out.print("How many floors does the hotel have: ");
        if (userInput.hasNextInt())
        {
          floors = userInput.nextInt();
          
          // make sure the number is greater than or equal to 1
          if (floors < 1)
          {
            System.out.println("\nThere must be at least 1 floor!\n");
            System.exit(1);
          }
        }
        else
        {
          System.out.println("I said enter a number!! What the heck??");
          System.exit(1);
        }
        
        // run a loop to get the room info for each floor
        for (int i = 1; i <= floors; i++)
        {
          // ask the user for the number of rooms on this floor
          System.out.print("How many rooms are on floor " + i + " : ");
          
          // make sure the user entered a number and it wasn't less than ten
          if (userInput.hasNextInt())
          {
            rooms = userInput.nextInt();
            
            // make sure the number is greater than or equal to 10
            if (rooms < 10)
            {
              System.out.println("There must be at least 10 rooms per floor.");
              System.exit(1);
            }
          }
          else
          {
            System.out.println("You must enter a number.");
            System.exit(1);
          }
          
          // if we didn't error out on the user's input then run loop calculations
          totalRooms += rooms;
          
          // ask the user for the number of occupied rooms
          System.out.print("How many of these rooms are occupied: ");
          
          // make sure the user entered a number less than the number of rooms on this floor
          if (userInput.hasNextInt())
          {
            occupied = userInput.nextInt();
            
            // make sure the number is not greater than the number of rooms on this floor
            if (occupied > rooms)
            {
              System.out.println("There cannot be more occupied rooms than the total number of rooms on this floor!");
              System.exit(1);
            }
          }
          else
          {
            System.out.println("You must enter a number.");
            System.exit(1);
          }
          
          // if we didn't error out on the user's input then finish loop calculations
          totalOccupied += occupied;
        }
        
        // finally we can print out the summary of our hotel's occupancy
        System.out.println("\nTotal number of rooms: " + totalRooms);
        System.out.println("Total number of occupied rooms: " + totalOccupied);
        System.out.println("Total number of unoccupied rooms: " + (totalRooms - totalOccupied));
        System.out.println("The hotel's occupancy rate is: " + (((double)totalOccupied / (double)totalRooms) * 100) + "%\n");
     }
 }












 