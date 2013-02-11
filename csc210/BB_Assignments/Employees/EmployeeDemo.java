/**
 *
 * Assignment 7 - 11/28/2011
 *
 * This program tests all the functionality of the various Employee subclasses.
 *
 * @author Dominic Giglio, CSC 210 Sec 121
 *
 */

public class EmployeeDemo {

  public static void main(String[] args) {
  
    // create a new basic employee object
    Employee ee = new Employee("Dominic Giglio", "123-A", "11/25/2011");

    // print out the basic employee object
    System.out.println("\nThis is a basic employee object: ");
    System.out.println(ee);

    // create a Production Worker object
    ProductionWorker pw1 = new ProductionWorker("Michael Giglio", "456-B", "11/24/2011", 2, 30.00);

    // create a copy of the first Production Worker object
    ProductionWorker pw2 = new ProductionWorker(pw1);

    // print out the first Production Worker object
    System.out.println("\nThis is the first Production Worker object: ");
    System.out.println(pw1);

    // print out the second Production Worker object
    System.out.println("\nThis is the second Production Worker object: ");
    System.out.println(pw2);

    // create a Shift Supervisor object
    ShiftSupervisor ss1 = new ShiftSupervisor("John Proodian", "789-C", "11/20/2011", 12000, 3000);

    // create a copy of the first Shift Supervisor object
    ShiftSupervisor ss2 = new ShiftSupervisor(ss1);

    // print out the first Shift Supervisor object
    System.out.println("\nThis is the first Shift Supervisor object: ");
    System.out.println(ss1);

    // print out the second Shift Supervisor object
    System.out.println("\nThis is the second Shift Supervisor object: ");
    System.out.println(ss2);

    // create a Team Leader object
    TeamLeader tl1 = new TeamLeader("Katie Proodian", "987-D", "11/10/2011", 1, 15.00, 1500, 100, 50);

    // create a copy of the first Team Leader object
    TeamLeader tl2 = new TeamLeader(tl1);

    // print out the first Team Leader object
    System.out.println("\nThis is the first Team Leader object: ");
    System.out.println(tl1);

    // print out the second Team Leader object
    System.out.println("\nThis is the second Team Leader object: ");
    System.out.println(tl2);

  } // end main() method

} // end EmployeeDemo class
