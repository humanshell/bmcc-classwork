/**
*
* Write a program that will prompt the user to enter the number of hours they
* worked and then multiply that by their pay rate and print out total pay.
*
*/

import javax.swing.JOptionPane;

public class InputGui
{
    public static void main(String[] args)
    {
        // declare the variables needed to hold our age
        String tmpString;
        float hoursWorked = 0.0F, hourlyRate = 20.0F, totalPay = 0.0F;
        
        // call JOptionPane's inputDialog to ask for the users hours
        tmpString = JOptionPane.showInputDialog("How many hours did you work?");
        
        totalPay = Float.parseFloat(tmpString) * hourlyRate;
        
        JOptionPane.showMessageDialog(null, "Your total pay is: $" + totalPay);
        
        System.exit(0);
    }
}

