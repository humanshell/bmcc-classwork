/**
 *
 * An integer is said to be a perfect number if its factors,
 * including 1 (but not the number itself), sum to the number.
 * For example, 6 is a perfect number, because 6=1+2+3. Write a
 * method isPerfect that determines whether parameter number is
 * a perfect number. Use this method in an application that
 * determines and displays all the perfect numbers between 1 and 1000. 
 *
 */

public class PerfectNumbers {

  public static void main(String[] args) {

    // loop and print perfect numbers between 1 and 1000 using our perfectNum() method
    for (int num = 1; num <= 1000; num++) {
      if (isPerfect(num)) {
        System.out.println("The number " + num + " is a perfect number!");
      }
    }
  
  } // end main()

  // ===========
  // = Methods =
  // ===========
  public static Boolean isPerfect(int num) {
  
    // declare a variable to hold the sum of num's factors
    int sum = 0;
  
    // loop over all the numbers up to 'num' to determine if they are factors
    // if they are then add them to 'sum'
    for (int factor = 1; factor < num; factor++) {
      if (num % factor == 0) {
        sum += factor;
      }
    }
  
    // if 'sum' is equal to the number passed in then it's a perfect number
    if (sum == num) {
      return true;
    } else {
      return false;
    }
  
  } // end public method isPerfect()

} // end PerfectNumbers class
