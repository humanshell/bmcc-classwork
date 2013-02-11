import javax.swing.*; // needed to access all swing classes

/**
 * This class extends the JFrame class.
 * Its constructor displays a simple window with a title.
 * The application exits when the user clicks the close button.
 */

public class SimpleWindow extends JFrame {

  // constructor
  public SimpleWindow() {
  
    final int WINDOW_WIDTH  = 350;  // window width in pixels
    final int WINDOW_HEIGHT = 250;  // window height in pixels

    // set the title
    setTitle("A Simple Window");

    // set the size of the window
    setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

    // specify what happens when close button is clicked
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // display the window
    setVisible(true);

  } // end SimpleWindow() constructor

} // end ShowWindow class
