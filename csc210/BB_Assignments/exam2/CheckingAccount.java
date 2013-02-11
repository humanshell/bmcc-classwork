/**
 * This class is a subclass of the Account class that adds checking account specific functinoality
 */

public class CheckingAccount extends Account {

    private String status = "active";
    private double minBalance = 50.0;
    private double serviceCharge = 25.0;
    
    public void withdrawal(double amt) {
      if (status.equals("active")) {
        super.withdrawal(amt);
      } else {
        System.out.println("Your account is inactive, please deposit money.");
      }
    }
    
    public void deposit(double amt) {
      if ( status.equals("inactive") && (amt + getBalance()) > minBalance ) {
        status = "active";
      }
      super.deposit(amt);
    }
    
    public void getMonthlyStatement() {
      if (getBalance() < minBalance) {
        System.out.println("A monthly low balance service charge of $" + serviceCharge + " has been added to your account.");
      }
      super.getMonthlyStatement();
    }

}
