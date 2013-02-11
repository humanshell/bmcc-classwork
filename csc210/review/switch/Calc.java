/**
 *
 * This program mimics a calculator. It takes a complete operation as input:
 * "3 + 4", "100 * 72", "4.8 - 7.3", "62 / 90"
 *
 * It should output a formatted result:
 * 1 + 1 = 2
 * 7 * 5 = 35
 *
 */
import java.util.Scanner;

public class Calc
{

    public static void main(String[] args)
    {

      // declare variables
      Scanner userInput = new Scanner(System.in);
      String  problem;
      int     operator = 0;
      double  num1 = 0.0, num2 = 0.0;
      
      // ask the user to input the first number
      System.out.print("Enter the operation to calculate: ");
      problem = userInput.nextLine();
      
      // find out what operation the user wants to do and then split the numbers out
      if (problem.contains("+")) {
        operator = 1;
        num1 = Double.parseDouble( problem.substring( 0, problem.indexOf( "+" ) ).trim() );
        num2 = Double.parseDouble( problem.substring( problem.indexOf( "+" ) + 1 ).trim() );
      } else if (problem.contains("-")) {
        operator = 2;
        num1 = Double.parseDouble( problem.substring( 0, problem.indexOf( "-" ) ).trim() );
        num2 = Double.parseDouble( problem.substring( problem.indexOf( "-" ) + 1 ).trim() );
      } else if (problem.contains("*")) {
        operator = 3;
        num1 = Double.parseDouble( problem.substring( 0, problem.indexOf( "*" ) ).trim() );
        num2 = Double.parseDouble( problem.substring( problem.indexOf( "*" ) + 1 ).trim() );
      } else {
        operator = 4;
        num1 = Double.parseDouble( problem.substring( 0, problem.indexOf( "/" ) ).trim() );
        num2 = Double.parseDouble( problem.substring( problem.indexOf( '/' ) + 1 ).trim() );
      }
      
      // use a switch statement to do the actual calculation
      switch (operator) {
        case 1:
          System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
          break;
        case 2:
          System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
          break;
        case 3:
          System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
          break;
        default:
          System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
      }
      

    } // end main()

} // end Calc class
