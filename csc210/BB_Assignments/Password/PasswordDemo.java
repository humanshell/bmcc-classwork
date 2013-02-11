/**
 *
 * Assignment 6 - Part 2 - 11/14/2011
 *
 * This program demonstrates the functionality of the Password utility class.
 *
 * @author Dominic Giglio, CSC 210 Sec 121
 *
 */

import java.util.Scanner;

public class PasswordDemo {
  
  public static void main(String[] args) {
    
    // declare a string to hold the user's password
    String password = "";

    // scanner
    Scanner kb = new Scanner(System.in);

    // ask the user to enter a password with a particular format
    System.out.println("\nPlease enter a password using the following guidelines:");
    System.out.println("\n6 characters long.");
    System.out.println("At least 1 UPPERCASE letter.");
    System.out.println("At least 1 lowercase letter.");
    System.out.println("At least 1 number.");
    System.out.print("\nNew Password: ");

    // store the new password
    password = kb.nextLine();

    // validate the password
    if(Password.validate(password)) {
      System.out.println("Your password is valid");
    } else {
      System.out.println("Your password is not valid");
    }

  }

}
