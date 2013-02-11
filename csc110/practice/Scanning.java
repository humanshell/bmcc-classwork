/**
 * Test class to pass a scanner object around
 */

import java.util.Scanner;

public class Scanning {
  
  public static void main(String[] args) {

    String userInput = scan(new Scanner(System.in));
    System.out.println(userInput);
  
  } // end main

  public static String scan(Scanner s) {
    System.out.print("Enter a string: ");
    return s.next();
  }

} // end scanning class