/**
 * This class defines an object for working with Complex numbers
 *
 * You can use this class to add, subtract and print complex numbers
 */

public class Complex {

  // define class fields
  double real, imaginary;
  
  /**
   * No arg constructor
   */
  public Complex() {
    real = 0.0;
    imaginary = 0.0;
  }
  
  /**
   * Constructor that takes the real and imaginary parts
   * @param r The real number component of the complex number
   * @param i The imaginary number component of the complex number
   */
  public Complex(double r, double i) {
    real = r;
    imaginary = i;
  }
  
  /**
   * Return the real number portion of this objects complex number
   */
  public double getReal() {
    return real;
  }
  
  /**
   * Return the imaginary number portion of this objects complex number
   */
  public double getImaginary() {
    return imaginary;
  }
  
  /**
   * Add the real and imaginary parts of the parameter to the fields of this number
   * and return a new complex number object
   * @param c The complex number to add
   */
  public Complex add(Complex c) {
    return new Complex(real + c.getReal(), imaginary + c.getImaginary());
  }
  
  /**
   * Subtract the real and imaginary parts of the parameter from the fields of this number
   * and return a new complex number object
   * @param c The complex number to subtract
   */
  public Complex subtract(Complex c) {
    return new Complex(real - c.getReal(), imaginary - c.getImaginary());
  }
  
  /**
   * Print the real and imaginary parts to STDOUT
   */
  public void print() {
    System.out.println("("+real+","+imaginary+"*i)");
  }

} // end Complex class
