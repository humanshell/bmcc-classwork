/**
 * 
 * Assignment 5 - 10/31/2011.
 *
 * This file defines a class for creating an instance of a student. The class
 * defines the fields and methods necessary to keep track of the students' name
 * and GPA.
 *
 * @author Dominic Giglio, CSC 210 Sec 121
 *
 */

public class Student {
  
  // class fields
  private String name;
  private double gpa;
  
  // constructor
  public Student(String n, double g) {
    name = new String(n);
    gpa = g;
  }
  
  public double getGPA() {
    return gpa;
  }

  public String getName() {
    return name;
  }
  
  public void printInfo() {
    System.out.println("Name: " + name + " GPA: " + gpa);
  }

}
