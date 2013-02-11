public class ArrayPractice {

    public static void main(String[] args) {

      // declare variables
      int[] num = {5, 8, 2, 11, -3};
      int biggestNum = 0, smallestNum = 0;
      
      // get the biggest
      for (int i = 0; i < num.length; i++) {
        if (num[i] > i) {
          biggestNum = num[i];
        }
      }
      
      // get the smallest
      for (int i = 0; i < num.length; i++) {
        if (num[i] < i) {
          smallestNum = num[i];
        }
      }
      
      // print result
      System.out.println("Max num is: " + biggestNum + " and its index is: " + num.indexOf(biggestNum));
      System.out.println("Max num is: " + smallestNum + " and its index is: " + num.indexOf(smallestNum));

    } // end main()

} // end ArrayPractice class
