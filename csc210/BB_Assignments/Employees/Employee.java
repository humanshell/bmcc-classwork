/**
 *
 * Assignment 7 - Part 1 - 11/28/2011
 *
 * This class will serve as a superclass for different types of employees.
 *
 * @author Dominic Giglio, CSC 210 Sec 121
 *
 */

public class Employee {
  
  // private fields
  private String name;
  private String number; // format: XXX-L where X is a number 0-9 and L is a letter from A-M
  private String hireDate;

  // public methods
  
  /**
   * Default constructor.
   * This constructor sets the name, number and hire date for an employee
   * @param name The employee's name
   * @param number The employee's number
   * @param hireDate The date the employee was hired
   */
  public Employee(String name, String number, String hireDate) {
    this.name = new String(name);
    this.number = new String(number);
    this.hireDate = new String(hireDate);
  }

  /**
   * Name accessor (getter)
   * @return the value of the name field
   */
  public String getName() {
    return name;
  }

  /**
   * Name mutator (setter)
   * @param name new value for the name field
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Number accessor (getter)
   * @return the value of the number field
   */
  public String getNumber() {
    return number;
  }

  /**
   * Number mutator (setter)
   * @param number new value for the number field
   */
  public void setNumber(String number) {
    this.number = number;
  }

  /**
   * Hire Date accessor (getter)
   * @return the value of the hireDate field
   */
  public String getHireDate() {
    return hireDate;
  }

  /**
   * Hire Date mutator (setter)
   * @param hireDate new value for the hireDate field
   */
  public void setHireDate(String hireDate) {
    this.hireDate = hireDate;
  }

  /**
   * To String Method.
   * This method will print a nicely formatted string representation of the
   * class' fields
   */
  public String toString() {
    String str = "Employee Name: " + name +
                 "\nEmployee Number: " + number +
                 "\nEmployee Hire Date: " + hireDate;
    return str;
  }
}
