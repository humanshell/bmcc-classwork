import java.util.Scanner;

public class SalesReport {

  private SalesPerson[] salesmen;

  public SalesReport() {
    System.out.println("How many salesmen are there?");
    Scanner keyboard = new Scanner(System.in);
    int numOfSalesmen = keyboard.nextInt();

    // allocate a new array of salesmen from the number provided by user
    salesmen = new SalesPerson[numOfSalesmen];

    // input sales person info
    keyboard.nextLine(); // clear the carrage return from the scanner's buffer
    System.out.println("Enter each salesman's name and sales...");
    for (int i = 0; i < salesmen.length; i++) {
      System.out.print("Name: ");
      String n = keyboard.nextLine();

      System.out.print("Sales: ");
      double s = keyboard.nextDouble();
      salesmen[i] = new SalesPerson(n, s);

      keyboard.nextLine(); // clear the carrage return from the scanner's buffer
    } 

  }

  // find the salesman with the highest sales
  public SalesPerson highestSales() {
    int maxIndex = 0;
    for (int i = 1; i < salesmen.length; i++) {
      if (salesmen[maxIndex].getSales() < salesmen[i].getSales()) {
        maxIndex = i;
      }
    } 
    return salesmen[maxIndex];
  }

  // return the average of all sales
  public double avgSales() {
    double total = 0.0;
    for (SalesPerson p : salesmen) {
      total += p.getSales();
    }
    return total / salesmen.length;
  }

  // display a report of the highest selling salesperson, the average sales and the above average sales people
  public void displayReport() {

    SalesPerson highest = highestSales();
    System.out.println("The highest sales were from: " + highest.getName());

    System.out.println("The average sales were: " + avgSales());

    // print out a list of the sales people that were above average
    System.out.println("The following sales people were above average:");
    for (SalesPerson p : salesmen) {
      if (p.getSales() > avgSales()) {
        System.out.println(p.getName());
      } 
    } 
  }
}











