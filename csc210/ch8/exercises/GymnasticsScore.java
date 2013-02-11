/**
 * This program asks a user to enter individual gymnastics scores and
 * calculates the final score
 **/

import java.util.Scanner;
import java.lang.Object;

public class GymnasticsScore {

    public static void main(String[] args) {

      // declare variables
      Scanner keyboard = new Scanner(System.in);
      double sum = 0.0, highestScore = 0.0, lowestScore = 0.0;
      
      // ask the user to enter 8 judge's scores
      System.out.print("Enter the eight (8) judges' scores (separated by commas): ");
      String[] userInput = keyboard.nextLine().split(",");
            
      // put the string of scores into the scores array
      // and get the highest and lowest scores
      double[] scores = new double[userInput.length];
      
      for (int index = 0; index < userInput.length; index++) {
        
        scores[index] = Double.parseDouble(userInput[index]);
        
        sum += scores[index];
        
        if (scores[index] == 0.0) {
          
        }
        
        if (scores[index] > highestScore) {
          highestScore = scores[index];
        }
        
        if (scores[index] < lowestScore && scores[index] > 0.0) {
          lowestScore = scores[index];
        }
        
      }
      
      // print the final score
      System.out.println("Highest score: " + highestScore); 
      System.out.println("Lowest score: " + lowestScore); 
      System.out.println("Final score: " + (sum - highestScore - lowestScore)); 

    } // end main()

} // end GymnasticsScore class
