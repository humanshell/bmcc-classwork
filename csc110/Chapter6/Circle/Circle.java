/**
 *
 * Circle Class
 *
 */
public class Circle
{
  // private fields
  private double radius;
  private final double PI = 3.14159;
  
  /**
   *
   * Constructors
   *
   */
  public Circle()
  {
    radius = 0.0;
  }
  
  public Circle(double r)
  {
    radius = r;
  }
  
  /**
   *
   * Mutator (setter) class methods
   *
   */
  public void setRadius(double r)
  {
    radius = r;
  }
  
  /**
   *
   * Accessor (getter) methods
   *
   */
  public double getRadius()
  {
    return radius;
  }
  
  public double getArea()
  {
    return PI * radius * radius;
  }
  
  public double getDiameter()
  {
    return radius * 2;
  }
  
  public double getCircumference()
  {
    return 2 * PI * radius;
  }
  
}  // end Circle class









