/**
*
* Decalre a program that will declare a number equal to 3 and print it
*
*/ 

public class Variable1
{
    public static void main(String [] args)
    {
        // variable declaration
        int num1 = 18, num2 = 7, result = 0, remainder = 0;
        
        // print our numbers to stdout (console)
        System.out.println("\nThe number currently stored in the variable \"num1\" is " + num1);
        System.out.println("The number currently stored in the variable \"num2\" is " + num2);
        
        // add num1 and num2 and print the result
        result = num1 + num2;
        System.out.println("\nThe result of adding the variables num1 and num2 is " + result);
        
        // subtract num1 and num2 and print the result
        result = num1 - num2;
        System.out.println("The result of subtracting the variables num1 and num2 is " + result);
        
        // multiply num1 and num2 and print the result
        result = num1 * num2;
        System.out.println("The result of multiplying the variables num1 and num2 is " + result);
        
        // divide num1 and num2 and print the result
        result = num1 / num2;
        remainder = num1 % num2;
        System.out.println("The result of dividing the variables num1 and num2 is " + result + " remainder " + remainder);
        
        // print our numbers to stdout (console)
        System.out.println("\nThe number currently stored in the variable \"num1\" is " + num1);
        System.out.println("The number currently stored in the variable \"num2\" is " + num2);
        
    }
}

