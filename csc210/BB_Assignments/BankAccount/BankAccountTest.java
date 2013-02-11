/**
 * This program tests the BankAccount class
 */

public class BankAccountTest {

    public static void main(String[] args) {

      // declare variables
      BankAccount commercialAcct1 = new BankAccount();
      BankAccount commercialAcct2 = new BankAccount(500, 75);
      
      // the first account was created with the no arg constructor
      // so we'll just ask for the monthly fee (it should be $25)
      System.out.println("The first account's monthly fee is: " + commercialAcct1.monthlyFee());
      
      // the second account has a balance higher than the minimum and has written more checks
      // the fee should come out to $13
      System.out.println("The second account's monthly fee is: " + commercialAcct2.monthlyFee());

    } // end main()

} // end BankAccountTest class
