/**
*
* This is a program that compares two strings
*
*/

import javax.swing.JOptionPane;

public class CompareNames
{
    public static void main(String[] args)
    {
        String name1, name2, name3;
        
        name1 = JOptionPane.showInputDialog("Enter the first name");
        
        name2 = JOptionPane.showInputDialog("Enter the second name");
        
        name3 = JOptionPane.showInputDialog("Enter the third name");
        
        if (name3.compareTo(name2) < 0 && name2.compareTo(name3) < 0)
          JOptionPane.showMessageDialog(null, name1 + " " + name2 + " " + name3);
          
        if (name1.compareTo(name3) < 0 && name2.compareTo(name3) < 0)
          JOptionPane.showMessageDialog(null, name1 + " " + name2 + " " + name3);
          
        
        
    }
}






