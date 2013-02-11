// this program demonstrates the Student class

import java.util.Scanner;

public class StudentDemo {

    public static void main(String[] args) {

      // ask the user how many students they will be entering
      System.out.print("How many students will you be entering: ");
      Scanner kb = new Scanner(System.in);
      Student[] students = new Student[kb.nextInt()];
      kb.nextLine(); // clear the string buffer

      // get each students info
      System.out.println("Enter each students info:");
      double gpa = 0.0; int id = 0;
      for (int i = 0; i < students.length; i++) {
        System.out.println("\nName:");
        String name = new String(kb.nextLine());
        System.out.println("GPA:");
        gpa = kb.nextDouble();
        System.out.println("ID:");
        id = kb.nextInt();
        students[i] = new Student(name, gpa, id);
        kb.nextLine(); // clear the string buffer
      }
      
      // print the average gpa
      double totalGPA = 0.0;
      for (int i = 0; i < students.length; i++) {
        totalGPA += students[i].getGPA();
      }
      System.out.println("The average GPA is:" + (totalGPA / students.length));
      
      // print the name and ID of the student with the highest GPA
      double highestGPA = 0.0;
      String highestName = "";
      int highestID = 0;
      for (int i = 1; i < (students.length - 1); i++) {
        highestGPA = students[0].getGPA();
        highestName = students[0].getName();
        highestID = students[0].getID();
        if (students[i].getGPA() > highestGPA) {
          highestGPA = students[i].getGPA();
          highestName = students[i].getName();
          highestID = students[i].getID();
        }
      }
      System.out.println("The highest GPA student is:");
      System.out.println("Name: " + highestName);
      System.out.println("ID: " + highestID);
      
      // print the name and ID of the student with the lowest GPA
      double lowestGPA = 0.0;
      String lowestName = "";
      int lowestID = 0;
      for (int i = 1; i < (students.length - 1); i++) {
        lowestGPA = students[0].getGPA();
        lowestName = students[0].getName();
        lowestID = students[0].getID();
        if (students[i].getGPA() < lowestGPA) {
          highestGPA = students[i].getGPA();
          lowestName = students[i].getName();
          lowestID = students[i].getID();
        }
      }
      System.out.println("The lowest GPA student is:");
      System.out.println("Name: " + lowestName);
      System.out.println("ID: " + lowestID);
      
      // print the names and the IDs of the students with above average GPAs
      for (int i = 0; i < students.length; i++) {
        if (students[i].getGPA() > (totalGPA / students.length)) {
          System.out.println("The following students have above average GPAs:");
          System.out.println("Name: " + students[i].getName() + " ID: " + students[i].getID());
        }
      }

    } // end main() method
    
    // PUBLIC METHODS //
    
    public static Student fetchStudent(String name, int id) {
      
    } 

} // end StudentDemo class

