/**
 *
 * Assignment 7 - Part 4 - 11/28/2011
 *
 * This class is a subclass of the ProductionWorker superclass.
 * It extends the ProductionWorker class by adding fields and methods that
 * are specific to a Team Leader, which is a kind of employee.
 *
 * @author Dominic Giglio, CSC 210 Sec 121
 *
 */

public class TeamLeader extends ProductionWorker {

  // private fields
  private double monthlyBonus;
  private double requiredTrainingHours;
  private double completedTrainingHours;

  // public methods

  /**
   * Default constructor.
   * This constructor sets the name, number and hire date for an Employee.
   * It also sets the shift and hourly pay rate for a Production Worker.
   * And finally sets it's own bonus and training hours fields.
   * @param name The employee's name
   * @param number The employee's number
   * @param hireDate The date the employee was hired
   * @param shift The shift the employee works
   * @param payRate How much the employee is paid per hour
   * @param monthlyBonus The employee's monthly bonus
   * @param rth The employee's required training hours
   * @param cth The employee's completed training hours
   */
  public TeamLeader(String name, String number, String hireDate, int shift, double payRate, double monthlyBonus, double rth, double cth) {
    super(name, number, hireDate, shift, payRate);
    this.monthlyBonus = monthlyBonus;
    this.requiredTrainingHours = rth;
    this.completedTrainingHours = cth;
  }

  /**
   * Copy constructor.
   * This constructor will create a new TeamLeader by copying another.
   * @param tl An existing TeamLeader object
   */
  public TeamLeader(TeamLeader tl) {
    super(tl.getName(), tl.getNumber(), tl.getHireDate(), tl.getShift(), tl.getPayRate());
    this.monthlyBonus = tl.getMonthlyBonus();
    this.requiredTrainingHours = tl.getRequiredTrainingHours();
    this.completedTrainingHours = tl.getCompletedTrainingHours();
  }

  /**
   * Monthly Bonus accessor (getter)
   * @return the value of the monthlyBonus field
   */
  public double getMonthlyBonus() {
    return monthlyBonus;
  }

  /**
   * Monthly Bonus mutator (setter)
   * @param newBonus new value for the monthlyBonus field
   */
  public void setMonthlyBonus(double bonus) {
    this.monthlyBonus = bonus;
  }

  /**
   * Required Training Hours accessor (getter)
   * @return the value of the requiredTrainingHours field
   */
  public double getRequiredTrainingHours() {
    return requiredTrainingHours;
  }

  /**
   * Required Training Hours mutator (setter)
   * @param hours new value for the requiredTrainingHours field
   */
  public void setRequiredTrainingHours(double hours) {
    this.requiredTrainingHours = hours;
  }

  /**
   * Completed Training Hours accessor (getter)
   * @return the value of the completedTrainingHours field
   */
  public double getCompletedTrainingHours() {
    return completedTrainingHours;
  }

  /**
   * Completed Training Hours mutator (setter)
   * @param hours new value for the completedTrainingHours field
   */
  public void setCompletedTrainingHours(double hours) {
    this.completedTrainingHours = hours;
  }

  /**
   * To String Method.
   * This method will print a nicely formatted string representation of the
   * class' fields
   */
  public String toString() {
    String str = super.toString();
    str += "\nEmployee Monthly Bonus: " + monthlyBonus +
           "\nEmployee Required Training Hours: " + requiredTrainingHours +
           "\nEmployee Completed Training Hours: " + completedTrainingHours;
    return str;
  }

}
