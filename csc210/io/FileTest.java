/**
 *
 * This program is practice for writing to and reading from files
 *
 */

import java.io.*;

public class FileTest
{

    public static void main(String[] args) throws IOException {

      // declare variables
      String filename = "students.txt";
      PrintWriter outputFile = new PrintWriter(filename);
      
      // print a strin to the file and then close it
      outputFile.println("Hello? This is Dominic!");
      outputFile.close();

    } // end main()

} // end FileTest class


