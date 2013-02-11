// This class defines a student and it's associated fields

public class Student {
  
  // class fields
  private String name;
  private double gpa;
  private int id;
  
  // constructor
  public Student(String name, double gpa, int id) {
    name = new String(name);
    gpa = gpa;
    id = id;
  }
  
  public double getGPA() {
    return gpa;
  }
  
  public String getName() {
    return name;
  }
  
  public int getID() {
    return id;
  }
  
  public void printInfo() {
    System.out.println("Name: " + name);
    System.out.println("GPA: " + gpa);
    System.out.println("ID: " + id);
  }
}