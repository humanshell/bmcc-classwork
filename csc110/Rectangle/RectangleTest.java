public class RectangleTest
{

    public static void main(String[] args)
    {

      // declare variables
      Rectangle rect1 = new Rectangle();
      Rectangle rect2 = new Rectangle(12, 8);
      
      // print the inital length and width on each rect obj
      System.out.println("\nThe length of rect1 is: " + rect1.getLength());
      System.out.println("The width of rect1 is: " + rect1.getWidth());
      System.out.println("The length of rect2 is: " + rect2.getLength());
      System.out.println("The width of rect2 is: " + rect2.getWidth());
      
      // set the length and width on each new rect obj
      rect1.setLength(6);
      rect1.setWidth(4);
      
      // print out the new length and width
      System.out.println("\nThe new length of rect1 is: " + rect1.getLength());
      System.out.println("The new width of rect1 is: " + rect1.getWidth());
      
      // print out the area of the rectangle
      System.out.println("\nThe area of rect1 is: " + rect1.calcArea());
      System.out.println("The area of rect2 is: " + rect2.calcArea());
      
      // print out the perimiter of the rectangle
      System.out.println("\nThe perimeter of rect1 is: " + rect1.calcPerimeter());
      System.out.println("The perimeter of rect2 is: " + rect2.calcPerimeter());
      
    } // end main()

} // end RectangleTest class
