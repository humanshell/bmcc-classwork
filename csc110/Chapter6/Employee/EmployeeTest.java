/**
 *
 * Program to test the Employee class
 *
 */
public class EmployeeTest
{

    public static void main(String[] args)
    {

      // declare variables
      Employee ee1 = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
      Employee ee2 = new Employee("Mark Jones", 39119, "IT", "Programmer");
      Employee ee3 = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");
      
      // print the employee info out to the screen
      System.out.println("\nThe first employee's name is: " + ee1.getName());
      System.out.println("The first employee's id is: " + ee1.getIdNumber());
      System.out.println("The first employee's department is: " + ee1.getDepartment());
      System.out.println("The first employee's position is: " + ee1.getPosition());
      
      System.out.println("\nThe second employee's name is: " + ee2.getName());
      System.out.println("The second employee's id is: " + ee2.getIdNumber());
      System.out.println("The second employee's department is: " + ee2.getDepartment());
      System.out.println("The second employee's position is: " + ee2.getPosition());
      
      System.out.println("\nThe third employee's name is: " + ee3.getName());
      System.out.println("The third employee's id is: " + ee3.getIdNumber());
      System.out.println("The third employee's department is: " + ee3.getDepartment());
      System.out.println("The third employee's position is: " + ee3.getPosition() + "\n");

    } // end main()

} // end EmployeeTest class
