/**
 *
 * Assignment 6 - Part 2 - 11/14/2011
 *
 * This utility class defines a method to validate a provided password.
 *
 * @author Dominic Giglio, CSC 210 Sec 121
 *
 */

public class Password {
  
  /**
   * This method validates the password passed in.
   *
   * @param pass a sting to be validated
   * @return Boolean True or False
   */
  public static Boolean validate(String pass) {
    
    Boolean hasLength = false;
    Boolean hasUpper  = false;
    Boolean hasLower  = false;
    Boolean hasDigit  = false;

    // check for proper length
    if (pass.length() >= 6) {
      hasLength = true;
    }

    // check for at least one uppercase letter
    for(int i = 0; i < pass.length(); i++){
      if(Character.isUpperCase(pass.charAt(i))) {
        hasUpper = true;
      }
    }
    
    // check for at least one lowercase letter
    for(int i = 0; i < pass.length(); i++){
      if(Character.isLowerCase(pass.charAt(i))) {
        hasLower = true;
      }
    }

    // check for at least one digit
    for(int i = 0; i < pass.length(); i++){
      if(Character.isDigit(pass.charAt(i))) {
        hasDigit = true;
      }
    }

    // return true or false
    if(hasLength && hasUpper && hasLower && hasDigit) {
      return true;
    } else {
      return false;
    }

  }

}
