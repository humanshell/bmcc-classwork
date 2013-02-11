public class Rectangle
{
  // class variables, or instance variables or fields
  private int length;
  private int width;
  
  // constructor
  public Rectangle() // non-paramater or non-argument constructor
  {
    length = 1;
    width = 1;
  }
  
  // constructor
  public Rectangle(int l, int w) // paramater or argument constructor
  {
    length = l;
    width = w;
  }
  
  // methods
  public void setLength(int l)
  {
    length = l;
  } // End method setLength()
  
  public void setWidth(int w)
  {
    width = w;
  } // End method setWidth()
  
  public int getLength()
  {
    return length;
  } // End method getLength()
  
  public int getWidth()
  {
    return width;
  } // End method getWidth()
  
  public double calcArea()
  {
    return length * width;
  } // End method calcArea()
  
  public double calcPerimeter()
  {
    return (2 * length) + (2 * width);
  } // End method calcPerimeter()
  
} // End class Rectangle