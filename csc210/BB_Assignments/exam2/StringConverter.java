public class StringConverter {

    public static void main(String[] args) {

      // declare variables
      String o = "StopAndSmellTheRoses";
      
      // convert the string
      String c = convert(o);
      
      // print original string
      System.out.println("Original String: " + o);
      
      // print the converted string
      System.out.println("Converted String: " + c);

    } // end main()
    
    public static String convert(String n) {
      char[] cAry = n.toCharArray();
      StringBuilder sb = new StringBuilder(n);
      
      for (int i = 1; i < cAry.length; i++) {
        if (Character.isUpperCase(cAry[i])) {
          sb.insert(n.indexOf(cAry[i]), " ");
        }
      }
      
      return new String(sb);
    }

}




















