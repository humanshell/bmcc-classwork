/**
 *
 * This program prints the following two patterns using a loop
 *
 *             * * * * *     *
 *             * * * * *     * *
 *             * * * * *     * * *
 *             * * * * *     * * * *
 *             * * * * *     * * * * *
 *
 */

public class StarPattern
{

    public static void main(String[] args)
    {

      // print a simple 5 by 5 star pattern
      for (int i = 0; i < 5; i++) {
        for (int x = 0; x < 5; x++) {
          System.out.print("* ");
        }
        System.out.println();
      }
      
      // print the pattern above incrementally
      for (int i = 1; i <= 5; i++) {
        for (int j = 1; j <= i; j++) {
          System.out.print("* ");
        }
        System.out.println();
      }

    } // end main()

} // end StarPattern1 class
