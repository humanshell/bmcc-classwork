/**
 *
 * Assignment 7 - Part 1 - 11/28/2011
 *
 * This class is a subclass of the Employee superclass.
 * It extends the Employee class by adding fields and methods that
 * are specific to a Production Worker, which is a kind of employee.
 *
 * @author Dominic Giglio, CSC 210 Sec 121
 *
 */

public class ProductionWorker extends Employee {
  
  // private fields
  private int shift;
  private double hourlyPayRate;

  // public methods

  /**
   * Default constructor.
   * This constructor sets the name, number and hire date for an Employee.
   * Then it sets up the specific fields for a ProductionWorker.
   * @param name The employee's name
   * @param number The employee's number
   * @param hireDate The date the employee was hired
   * @param shift The shift the employee works
   * @param payRate How much the employee is paid per hour
   */
  public ProductionWorker(String name, String number, String hireDate, int shift, double payRate) {
    super(name, number, hireDate);
    this.shift = shift;
    this.hourlyPayRate = payRate;
  }

  /**
   * Copy constructor.
   * This constructor will create a new ProductionWorker by copying another.
   * @param pw An existing ProductionWorker object
   */
  public ProductionWorker(ProductionWorker pw) {
    super(pw.getName(), pw.getNumber(), pw.getHireDate());
    this.shift = pw.getShift();
    this.hourlyPayRate = pw.getPayRate();
  }

  /**
   * Shift accessor (getter)
   * @return the value of the shift field
   */
  public int getShift() {
    return shift;
  }

  /**
   * Shift mutator (setter)
   * @param newShift new value for the shift field
   */
  public void setShift(int newShift) {
    this.shift = newShift;
  }

  /**
   * Hourly Pay Rate accessor (getter)
   * @return the value of the hourlyPayRate field
   */
  public double getPayRate() {
    return hourlyPayRate;
  }

  /**
   * Hourly Pay Rate mutator (setter)
   * @param newPayRate new value for the hourlyPayRate field
   */
  public void setPayRate(double newPayRate) {
    this.hourlyPayRate = newPayRate;
  }

  /**
   * To String Method.
   * This method will print a nicely formatted string representation of the
   * class' fields
   */
  public String toString() {
    String str = super.toString();
    str += "\nEmployee Shift: " + shift +
           "\nEmployee Hourly Pay Rate: " + hourlyPayRate;
    return str;
  }

}
