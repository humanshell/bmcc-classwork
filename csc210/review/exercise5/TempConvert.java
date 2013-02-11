/**
 * This program converts from celsius to fahrenheit or fahrenheit to celsius
 */
 
import java.util.*;
import java.util.regex.*;

public class TempConvert
{

    public static void main(String[] args)
    {

      // declare variables
      Scanner keyboard = new Scanner(System.in);
      double temperature = 0.0;
      String degrees = "";
      
      // create a regex pattern so we can check the user's input
  		Pattern p = Pattern.compile("[Cc|Ff]");
      
      // ask the user for the temp they want converted
      System.out.print("Enter the temperature you would like converted: ");
      if (!keyboard.hasNextDouble()) {
        System.out.println("You must enter a number to convert!");
        System.exit(1);
      } else {
        temperature = keyboard.nextDouble();
      }
      
      // ask the user what degrees they would like to convet to
      System.out.print("What scale would you like to convert to? ('C' for Celsius or 'F' for Fahrenheit): ");
      if (!keyboard.hasNext(p)) {
        System.out.println("You must enter either 'C' or 'F' to convert!");
        System.exit(1);
      } else {
        degrees = keyboard.next();
        degrees = degrees.toUpperCase();
      }
      
      // convert to celsius or fahrenheit and print results
      if (degrees.equals("C")) {
        temperature = 5.0 / 9.0 * (temperature - 32);
        System.out.println("Converted temperature is: " + temperature + " Degrees " + degrees);
      } else {
        temperature = 9.0 / 5.0 * (temperature + 32);
        System.out.println("Converted temperature is: " + temperature + " Degrees " + degrees);
      }
      
    } // end main()

} // end TempConvert class






