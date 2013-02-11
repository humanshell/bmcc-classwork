/**
 *
 * Employee Class
 *
 */
class Employee
{
  // private fields
  String name;
  String department;
  String position;
  int idNumber;
  
  /**
   *
   * Constructors
   *
   */
  public Employee()
  {
    name = department = position = "";
    idNumber = 0;
  }
  
  public Employee(String n, int id)
  {
    name = n;
    idNumber = id;
    department = position = "";
  }
   
  public Employee(String n, int id, String d, String p)
  {
    name = n;
    idNumber = id;
    department = d;
    position = p;
  }
  
  /**
   *
   * Mutator (setter) methods
   *
   */
  public void setName(String n)
  {
    name = n;
  }
  
  public void setDepartment(String d)
  {
    department = d;
  }
  
  public void setPosition(String p)
  {
    position = p;
  }
  
  public void setIdNumber(int i)
  {
    idNumber = i;
  }
  
  /**
   *
   * Accessor (getter) methods
   *
   */
  public String getName()
  {
    return name;
  }
  
  public String getDepartment()
  {
    return department;
  }
  
  public String getPosition()
  {
    return position;
  }
  
  public int getIdNumber()
  {
    return idNumber;
  }
  
  
}