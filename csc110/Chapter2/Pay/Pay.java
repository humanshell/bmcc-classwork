/**
*
* Write a Java program that declares an integer that represents the hours a person
* worked and a double that represents the hourly rate, then calculate and print the pay
*
*/

public class Pay
{
    public static void main(String[] args)
    {
        byte hoursWorked = 41;
        float hourlyRate = 20.50F, totalPay = 0.00F;
        
        totalPay = hoursWorked * hourlyRate;
        
        System.out.println("Hours worked: " + hoursWorked);
        System.out.println("Hourly rate: $" + hourlyRate);
        System.out.println("The total amount of pay earned is: $" + totalPay);
    }
}

