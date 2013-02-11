/**
 * This class and program determines if a driving student has passed or failed their driving exam
 */

import java.util.Scanner;
import java.util.regex.*;
import java.util.ArrayList;

public class DriverExam {
  
  private static char[] correctAnswers = { 'B', 'D', 'C', 'D', 'A', 'D', 'B', 'A', 'C', 'B' };
  private static char[] studentAnswers = new char[10];
  
  // public methods
  
  /**
   * passed()
   * @return true if student passed or false if they failed
   */
  public static boolean passed() {
    if (questionsMissed().size() > 3)
      return false;
    else
      return true;
  } // end passed()
  
  /**
   * totalCorrect()
   * @return the total number of correctly answered questions
   */
  public static int totalCorrect() {
    return correctAnswers.length - questionsMissed().size();
  } // end totalCorrect()
  
  /**
   * totalInCorrect()
   * @return the total number of incorrectly answered questions
   */
  public static int totalInCorrect() {
    return questionsMissed().size();
  } // end totalInCorrect()
  
  /**
   * questionsMissed()
   * @return an array containing the numbers of the questions
   */
  public static ArrayList<Integer> questionsMissed() {
    ArrayList<Integer> missed = new ArrayList<Integer>();
    for (int i = 0; i < correctAnswers.length; i++) {
      if (studentAnswers[i] != correctAnswers[i])
        missed.add(i + 1);
    }
    return missed;
  } // end questionsMissed()
  
  // main method
  public static void main(String[] args) {
    
    // setup the variables we'll need
    Scanner kb = new Scanner(System.in);
    Pattern p = Pattern.compile("A|a|B|b|C|c|D|d");
    String userInput;
    
    // ask the user to enter their scores and save them in the studentAnswers array
    for (int i = 0; i < 10; i++) {
      System.out.print("Please enter your answer for number " + (i + 1) + ": ");
      if (kb.hasNext(p))
        studentAnswers[i] = Character.toUpperCase(kb.next().charAt(0));
      else {
        System.out.println("\nYou must enter either A, B, C or D. Please try again.\n");
        System.exit(0);
      }
    }
    
    // tell the user how they did
    System.out.println("\nYou got " + totalCorrect() + " answers right.");
    System.out.println("You got " + totalInCorrect() + " answers wrong.");
    System.out.print("You got the following question(s) wrong: ");
    for (int i = 0; i < questionsMissed().size(); i++) {
      System.out.print(questionsMissed().get(i) + " ");
    }
    System.out.println("");
    if (passed())
      System.out.print("You Passed!!\n");
    else
      System.out.print("You Failed!!\n");
    
  } // end main()

} // end class Driver Exam
