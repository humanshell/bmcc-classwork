/**
 * 
 * Assignment 5 - 10/31/2011.
 *
 * This program uses the Student class to allow a user to create any number of
 * student objects and then sort and print them based on their fields.
 *
 * @author Dominic Giglio, CSC 210 Sec 121
 *
 */

import java.util.Scanner;

public class StudentDemo {

  public static void main(String[] args) {
    
    // define the variables we'll need
    Student[] students;
    Scanner kb = new Scanner(System.in);

    // ask the user how many students they will be entering
    System.out.print("\nHow many students will you be entering? ");

    // initialize our students array
    students = new Student[kb.nextInt()];
    kb.nextLine();

    // get the name and GPA of each student from the user
    for(int i = 0; i < students.length; i++) {
      System.out.print("\nEnter name for student #" + (i + 1) + ": ");
      String name = kb.nextLine();
      System.out.print("Enter GPA for student #" + (i + 1) + ": ");
      double gpa = kb.nextDouble();
      students[i] = new Student(name, gpa);
      kb.nextLine();
    }
    
    // print the pre-sorted array info
    System.out.println("\nPre-Sorted Student Data:");
    for(int i=0; i < students.length; i++) {
      students[i].printInfo();
    }

    // sort the student array by descending GPA
    sortDescending(students);

    // print the sorted array info
    System.out.println("\nSorted Student Data:");
    for(int i=0; i < students.length; i++) {
      students[i].printInfo();
    }

  } // end main()


  // PUBLIC METHODS //


  /**
   * This method sorts a given array of student objects in descending
   * order by GPA.
   * @param array The array to sort
   */
  public static void sortDescending(Student[] arrToSort) {
    Student temp;
    for(int i = 0; i < arrToSort.length - 1; i++) {
      for(int j = i + 1; j < arrToSort.length; j++) {
        if(arrToSort[i].getGPA() < arrToSort[j].getGPA()) {
          // exchange elements
          temp = arrToSort[i];
          arrToSort[i] = arrToSort[j];
          arrToSort[j] = temp;
        }
      }
    }
  }

  /**
   * This method returns the GPA for the supplied name, in the supplied array.
   * @param n The name of the student whose GPA to search for
   * @param array The array to search over
   */
  public static double gpaSearch(String n, Student[] array) {
    double gpa = 0.0;
    for(int i = 0; i < array.length; i++) {
      if(array[i].getName().equals(n)){
        gpa = array[i].getGPA();
      }
    }
    return gpa;
  }

} // end StudentInfo class

