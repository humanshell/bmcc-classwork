/**
 * Challenge 1 Rainfall Class
 *
 * Write a RainFall class that stores the total rainfall for each of 12 months into an array of doubles.
 * Provide methods that return the following:
 *
 *  - total rainfall for the year
 *  - average monthly rainfall
 *  - month with the most rain
 *  - month with the least rain
 * 
 */

public class RainFall {
  
  // class fields
  private double[] rainFallArray;

  // no-arg constructor
  public RainFall() {
    double[] rainFallArray = { 1.1, 2.3, 4.3, 7.5, 7.2, 5.6, 4.9, 9.2, 2.7, 1.4, 3.6, 8.8 };
  }

  // public methods

  /**
   * Return the total rainfall for the year
   * @returns Total rain fall
   */
  public double totalRainFall() {
    double total = 0.0;
    for (double t : rainFallArray) {
      total += t;
    }
    return total;
  }

  /**
   * Return the average monthly rainfall
   * @returns The average monthly rainfall
   */
  public double avgRainFall() {
    return totalRainFall() / (double)rainFallArray.length;
  }

  /**
   * Return the month with the highest rain fall
   * @returns A string with the name of the month with the highest rainfall
   */
  public String highestRainFall() {
    return new String("January");
  }

  /**
   * Return the month with the lowest rain fall
   * @returns A string with the name of the month with the lowest rainfall
   */
  public String lowestRainFall() {
    return new String("January");
  }
  }
}














