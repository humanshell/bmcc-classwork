/**
 *
 * This program lets the user simulate coin tosses.
 *
 */

import javax.swing.JOptionPane;
import java.util.Random;

public class CoinToss
{

    public static void main(String[] args) {

      // declare variables
      String coin_face = flip();
      Object message = "This coin toss was: " + coin_face;
      
      // show dialog
      // JOptionPane.showMessageDialog(null, message);
      
      // test
      System.out.println(flip());

    } // end main()
    
    // ==================
    // = Public Methods =
    // ==================
    
    public static String flip() {
      Random generator = new Random();
      System.out.println(generator.nextInt(1));
      System.out.println(generator.nextInt(1));
      System.out.println(generator.nextInt(1));
      System.out.println(generator.nextInt(1));
      System.out.println(generator.nextInt(1));
      System.out.println(generator.nextInt(1));
      // if (generator.nextInt(1) % 2 == 0) {
      //   return "Heads";
      // } else {
      //   return "Tails";
      // }
    }

} // end CoinToss class
