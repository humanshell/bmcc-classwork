public class SalesPerson {
  
  private String name;
  private double sales;

  public SalesPerson(String n, double s) {
    name = new String(n);
    sales = s;
  }
  
  //================ accessors ===============
  public String getName() {
    return name;
  }

  public double getSales() {
    return sales;
  }

  //================ mutators ===============
  public void setName(String n) {
    name = new String(n);
  }

  public void setSales(double s) {
    sales = s;
  }
  
  public void displayInfo() {
    System.out.println("Name: " + name);
    System.out.println("Sales: " + sales);
  }
}
