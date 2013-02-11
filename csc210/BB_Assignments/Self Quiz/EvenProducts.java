/**
 *
 * Write a program that calculates the product of the even integers from 0 to 25.
 *
 */

public class EvenProducts
{

    public static void main(String[] args)
    {

      // loop through 0 to 25 and print only even integers
      for (int i = 0; i <= 25; i++) {
        if (i % 2 == 0) {
          System.out.println(i + " is even!");
        }
      }

    } // end main()

} // end EvenProducts class
