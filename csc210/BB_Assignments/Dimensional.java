/**
 *
 * Assignment 6 - Part 1 - 11/14/2011
 *
 * This program creates a 2 dimensional array of integers and then uses each of
 * its 6 defined methods to show how to access the data inside.
 *
 * @author Dominic Giglio, CSC 210 Sec 121
 *
 */

import java.util.Random;

public class Dimensional {

  // main method
  public static void main(String[] args) {

    // create a random number generator
    Random generator = new Random();
    
    // instantiate a 2D array with random numbers as rows and columns
    final int ROWS = generator.nextInt(100);
    final int COLS = generator.nextInt(100);
    int[][] intArray = new int[ROWS][COLS];

    // seed the array with some random integers
    for(int row = 0; row < ROWS; row++){
      for(int col = 0; col < COLS; col++){
        intArray[row][col] = generator.nextInt(100);
      }
    }

    // give the user some basic statistics about the array
    System.out.println("The array has " + ROWS + " rows.");
    System.out.println("The array has " + COLS + " columns.");
    System.out.println("The total value of all array elements is: " + getTotal(intArray));
    System.out.println("The average of all array elements is: " + getAverage(intArray));

    // give the user some specific statistics about the array
    int randomRow = generator.nextInt(ROWS);
    int randomCol = generator.nextInt(COLS);
    System.out.println("The total value of the elements in row " + randomRow + " is: " + getRowTotal(intArray, randomRow));
    System.out.println("The total value of the elements in column " + randomCol + " is: " + getColumnTotal(intArray, randomCol));
    System.out.println("The highest value in row " + randomRow + " is: " + getHighestInRow(intArray, randomRow));
    System.out.println("The lowest value in column " + randomCol + " is: " + getLowestInColumn(intArray, randomCol));

  } // end main() method
  

  // public methods
  

  /**
   * This method accepts a two-dimensional array as its argument and returns
   * the total of all the values in the array.
   *
   * @param array A 2 dimensional array
   * @return The sum of the elements
   *
   */
  public static int getTotal(int[][] array) {
    int total = 0;
    for(int row = 0; row < array.length; row++){
      for(int col = 0; col < array[row].length; col++){
        total += array[row][col];
      }
    }
    return total;
  }
  
  /**
   * This method accepts a two-dimensional array as its argument and returns
   * the average of all the values in the array.
   *
   * @param array A 2 dimensional array
   * @return The average of the elements
   *
   */
  public static double getAverage(int[][] array) {
    int total = 0;
    for(int row = 0; row < array.length; row++){
      for(int col = 0; col < array[row].length; col++){
        total += array[row][col];
      }
    }
    return (double)total / (array.length * array[0].length);
  }

  /**
   * This method accepts a two-dimensional array as its first argument and an
   * integer as its second argument. The second argument identifies the row to
   * be totaled. The method returns the total of one row.
   *  
   * @param array A 2 dimensional array
   * @param row The row to be totaled
   * @return The total of all the values in the specified row.
   *
   */
  public static int getRowTotal(int[][] array, int row) {
    int rowTotal = 0;
    for(int col = 0; col < array[row].length; col++){
      rowTotal += array[row][col];
    }
    return rowTotal;
  }

  /**
   * This method accepts a two-dimensional array as its first argument and an
   * integer as its second argument. The second argument identifies the column
   * to be totaled. The method returns the total of one column.
   *
   * @param array A 2 dimensional array
   * @param col The column to be totaled
   * @return The total of all the values in the specified column.
   *
   */
  public static int getColumnTotal(int[][] array, int col) {
    int colTotal = 0;
    for(int row = 0; row < array.length; row++){
      colTotal += array[row][col];
    }
    return colTotal;
  }

  /**
   * This method accepts a two-dimensional array as its first argument and an
   * integer as its second argument. The second argument identifies a row.
   * The method returns the highest value in the specefied row.
   *
   * @param array A 2 dimensional array
   * @param row The row to search
   * @return The highest value in the specefied row.
   *
   */
  public static int getHighestInRow(int[][] array, int row) {
    int highest = 0;
    for(int col = 0; col < array[row].length; col++){
      if(array[row][col] > highest){
        highest = array[row][col];
      }
    }
    return highest;
  }

  /**
   * This method accepts a two-dimensional array as its first argument and an
   * integer as its second argument. The second argument identifies a column.
   * The method returns the lowest value in the specefied column.
   *
   * @param array A 2 dimensional array
   * @param col The column to search
   * @return The lowest value in the specefied column.
   *
   */
  public static int getLowestInColumn(int[][] array, int col) {
    int lowest = array[0][col];
    for(int row = 0; row < array.length; row++){
      if(array[row][col] < lowest){
        lowest = array[row][col];
      }
    }
    return lowest;
  }

}
