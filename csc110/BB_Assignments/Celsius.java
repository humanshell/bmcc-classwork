/**
 *
 * Celsius Temperature Table - prog 6 pg 291
 * formula for fahrenheit to celsius is c = 5/9(f-32)
 * Write a method named celsius that takes a fahrenheit temp as an argument.
 * The method should return the temp converted to celsius.
 * Demonstrate this method by using it in a loop that displays a table of fahrenheit temps 0-20 and the celsius conversions.
 *
 */

import java.text.DecimalFormat;

public class Celsius
{

    public static void main(String[] args)
    {

      // instantiate a number formatter to display our temps nicely
      DecimalFormat df = new DecimalFormat("0.0");
      
      // print out the header for our temperature table
      System.out.println("\nFahrenheit        Celsius");
      System.out.println("----------        -------");
      
      // run a loop to convert and display temps using celsius() method
      for (double i = 0; i <= 20; i++) {
        System.out.println( df.format(i) + "                 " + df.format(celsius(i)) );
      }
      
    } // end main()
    
    // Methods:
    // celsius() - take a fahrenheit temp as an argument, convert to celsius and return that value
    public static double celsius(double f)
    {
      double c = 5.0 / 9.0 * (f - 32);
      return c;
    }

} // end Celsius class
