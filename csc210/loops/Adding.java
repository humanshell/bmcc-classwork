/**
 *
 * This program adds the numbers from 1 to 10
 *
 */


public class Adding
{

    public static void main(String[] args)
    {

      // variables
      int result = 0, counter = 0;
      
      // loop through the numbers 1 to 10 and add them with a for loop
      for (int i = 0; i < 11; i++) {
        result += i;
      }
      
      // print for loop result
      System.out.println("The result of adding the numbers 1 to 10 with a for loop is: " + result);
      
      // loop through the numbers 1 to 10 and add them with a while loop
      result = counter = 0;
      while (counter < 11) {
        result += counter;
        counter++;
      }
      
      // print while loop result
      System.out.println("The result of adding the numbers 1 to 10 with a while loop is: " + result);
      
      // loop through the numbers 1 to 10 and add them with a do-while loop
      result = counter = 0;
      do {
        result += counter;
        counter++;
      } while (counter < 11);
      
      // print while loop result
      System.out.println("The result of adding the numbers 1 to 10 with a do-while loop is: " + result);

    } // end main()

} // end Adding class
