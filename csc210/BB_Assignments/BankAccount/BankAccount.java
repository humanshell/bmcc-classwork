/**
 * This class defines a bank account and its associated service fees
 */

public class BankAccount {

  // define class fields
  private int checksWritten;
  private double accountBalance, monthlyFee;
  
  /**
   * No arg constructor that zeros out all fields
   */
  public BankAccount() {
    accountBalance = 300.0;
    monthlyFee = 10;
    checksWritten = 0;
  }
   
  /**
   * Constructor that takes two args to set the checks and account balance
   * @param b The initial account balance
   * @param c The initial amount of checks written
   */
  public BankAccount(int b, int c) {
    accountBalance = b;
    monthlyFee = 10;
    checksWritten = c;
  }
  
  /**
   * Calculate and return the monthly service fee for this account
   * @return The current monthly fee
   */
  public double monthlyFee() {
    
    // first if the account balance is less than $400 charge an extra $15 fee
    if (accountBalance < 400) {
      monthlyFee += 15;
    }
    
    // calculate the monthly check fees
    if (checksWritten > 59) {
      monthlyFee += 0.04 * checksWritten;
    } else if (checksWritten >= 40 && checksWritten <= 59) {
      monthlyFee += 0.06 * checksWritten;
    } else if (checksWritten >= 20 && checksWritten <= 39) {
      monthlyFee += 0.08 * checksWritten;
    } else {
      monthlyFee += 0.1 * checksWritten;
    }
    
    // return the total monthly fee
    return monthlyFee;
    
  } // end monthlyFee() method

} // end BankAccount class
