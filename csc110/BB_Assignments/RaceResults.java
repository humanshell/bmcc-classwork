/**
*
* This program asks the user for three names of runners who just completed a race
* as well as their individual race times. It then prints out the runners in the
* order in which they finnished.
*
*/

import javax.swing.JOptionPane;

public class RaceResults
{
    public static void main(String[] args)
    {
        // declare our variables
        String runnerOneName;
        String runnerTwoName;
        String runnerThreeName;
        String tempTime;
        
        int runnerOneTime = 0, runnerTwoTime = 0, runnerThreeTime = 0;
        
        // ask the user for the names of the runners and their times
        runnerOneName = JOptionPane.showInputDialog("What is the name of the first runner?");
        tempTime = JOptionPane.showInputDialog("Enter the minutes it took " + runnerOneName + " to finish the race.");
        runnerOneTime = Integer.parseInt(tempTime);
        
        runnerTwoName = JOptionPane.showInputDialog("What is the name of the second runner?");
        tempTime = JOptionPane.showInputDialog("Enter the minutes it took " + runnerTwoName + " to finish the race.");
        runnerTwoTime = Integer.parseInt(tempTime);
        
        runnerThreeName = JOptionPane.showInputDialog("What is the name of the third runner?");
        tempTime = JOptionPane.showInputDialog("Enter the minutes it took " + runnerThreeName + " to finish the race.");
        runnerThreeTime = Integer.parseInt(tempTime);
        
        // now put the runners in ascending order based on their time and tell the user
        // runner1, runner2, runner3
        if (runnerOneTime < runnerTwoTime && runnerTwoTime < runnerThreeTime)
          JOptionPane.showMessageDialog(null, runnerOneName + " finished first\n" +
                                              runnerTwoName + " finished second\n" +
                                              runnerThreeName + " finshed third");
        // runner3, runner2, runner1
        else if (runnerThreeTime < runnerTwoTime && runnerTwoTime < runnerOneTime)
          JOptionPane.showMessageDialog(null, runnerThreeName + " finished first\n" +
                                              runnerTwoName + " finished second\n" +
                                              runnerOneName + " finshed third");
        // runner2, runner1, runner3                                      
        else if (runnerTwoTime < runnerOneTime && runnerOneTime < runnerThreeTime)
          JOptionPane.showMessageDialog(null, runnerTwoName + " finished first\n" +
                                              runnerOneName + " finished second\n" +
                                              runnerThreeName + " finshed third");
        // runner3, runner1, runner2
        else if (runnerThreeTime < runnerOneTime && runnerOneTime < runnerTwoTime)
          JOptionPane.showMessageDialog(null, runnerThreeName + " finished first\n" +
                                              runnerOneName + " finished second\n" +
                                              runnerTwoName + " finshed third");
        // runner2, runner3, runner1
        else if (runnerTwoTime < runnerThreeTime && runnerThreeTime < runnerOneTime)
          JOptionPane.showMessageDialog(null, runnerTwoName + " finished first\n" +
                                              runnerThreeName + " finished second\n" +
                                              runnerOneName + " finshed third");
        // runner1, runner3, runner2
        else 
          JOptionPane.showMessageDialog(null, runnerOneName + " finished first\n" +
                                              runnerThreeName + " finished second\n" +
                                              runnerTwoName + " finshed third");
    }
}

