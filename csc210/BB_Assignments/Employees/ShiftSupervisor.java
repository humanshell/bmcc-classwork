/**
 *
 * Assignment 7 - Part 2 - 11/28/2011
 *
 * This class is a subclass of the Employee superclass.
 * It extends the Employee class by adding fields and methods that
 * are specific to a Shift Supervisor, which is a kind of employee.
 *
 * @author Dominic Giglio, CSC 210 Sec 121
 *
 */

public class ShiftSupervisor extends Employee {

  // private fields
  private double annualSalary;
  private double annualBonus;

  // public methods

  /**
   * Default constructor.
   * This constructor sets the name, number and hire date for an Employee.
   * Then it sets up the specific fields for a ShiftSupervisor.
   * @param name The employee's name
   * @param number The employee's number
   * @param hireDate The date the employee was hired
   * @param annualSalary The employee's annual salary
   * @param annualBonus The employee's annual bonus
   */
  public ShiftSupervisor(String name, String number, String hireDate, double salary, double bonus) {
    super(name, number, hireDate);
    this.annualSalary = salary;
    this.annualBonus = bonus;
  }

  /**
   * Copy constructor.
   * This constructor will create a new ShiftSupervisor by copying another.
   * @param ss An existing ShiftSupervisor object
   */
  public ShiftSupervisor(ShiftSupervisor ss) {
    super(ss.getName(), ss.getNumber(), ss.getHireDate());
    this.annualSalary  = ss.getAnnualSalary();
    this.annualBonus = ss.getAnnualBonus();
  }

  /**
   * Annual Salary accessor (getter)
   * @return the value of the annualSalary field
   */
  public double getAnnualSalary() {
    return annualSalary;
  }

  /**
   * Annual Salary mutator (setter)
   * @param newSalary new value for the annualSalary field
   */
  public void setAnnualSalary(double newSalary) {
    this.annualSalary = newSalary;
  }

  /**
   * Annual Bonus accessor (getter)
   * @return the value of the annualBonus field
   */
  public double getAnnualBonus() {
    return annualBonus;
  }

  /**
   * Annual Bonus mutator (setter)
   * @param newBonus new value for the annualBonus field
   */
  public void setAnnualBonus(double newBonus) {
    this.annualBonus = newBonus;
  }

  /**
   * To String Method.
   * This method will print a nicely formatted string representation of the
   * class' fields
   */
  public String toString() {
    String str = super.toString();
    str += "\nEmployee Annual Salary: " + annualSalary +
           "\nEmployee Annual Bonus: " + annualBonus;
    return str;
  }

}
