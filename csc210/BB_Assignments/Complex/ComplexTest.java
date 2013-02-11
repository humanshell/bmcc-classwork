/**
 * This program tests the functionality of the Complex class
 */

public class ComplexTest {

    public static void main(String[] args) {

      // declare variables
      Complex complex1 = new Complex(1, 2);
      Complex complex2 = new Complex(2, 4);
      
      // print the copmlex numbers
      System.out.println("\nStarting value of complex1:");
      complex1.print();
      System.out.println("Starting value of complex2:");
      complex2.print();
      
      // add complex2 to complex1 and print the result
      System.out.println("\nResult of adding complex1 and complex2:");
      Complex addResult = complex2.add(complex1);
      addResult.print();
      
      // subtract complex1 from complex2 and print the result
      System.out.println("\nResult of subtracting complex1 from complex2:");
      Complex subtractResult = complex2.subtract(complex1);
      subtractResult.print();

    } // end main()

} // end ComplexTest class