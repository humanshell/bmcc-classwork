/**
 * This class creates a JFrame the asks the user to enter a distance in
 * kilometers. When the calculate button is clicked a dialog box is displayed
 * showing the kilometers converted to miles.
 */

import javax.swing.*;  // import all the swing package classes
import java.awt.event.*;  // import all the awt package classes (ActionListener)

public class KiloConverterWindow extends JFrame {
  
  private JPanel panel;
  private JLabel messageLabel;
  private JTextField kiloTextField;
  private JButton calcButton;
  final int WINDOW_WIDTH  = 350;  // window width in pixels
  final int WINDOW_HEIGHT = 100;  // window height in pixels

  /**
   * Constructor
   */
  public KiloConverterWindow() {
    
    // set the title
    setTitle("Kilometer Converter");

    // set the size of the window
    setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

    // specify what happens when close button is clicked
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // use the buildPanel() method to setup the panel ref variable
    buildPanel();

    // add the panel to the frame's content pane
    add(panel);

    // display the window
    setVisible(true);

  } // end constructor


  /**
   * The buildPanel() method adds a label, text field and button to a panel.
   */
  private void buildPanel() {
    
    // create a label to display instructions
    messageLabel = new JLabel("Enter a distance in kilometers");
  
    // create a text field 10 characters wide
    kiloTextField = new JTextField(10);

    // create a "Calculate" button
    calcButton = new JButton("Calculate");

    // add an ActionListener to calcButton
    calcButton.addActionListener(new CalcButtonListener());

    // create a JPanel object
    panel = new JPanel();

    // add label text field and button to the panel
    panel.add(messageLabel);
    panel.add(kiloTextField);
    panel.add(calcButton);
  
  } // end buildPanel() method


  /**
   * The CalcButtonListener class is an ActionListener for the calc button.
   */
  private class CalcButtonListener implements ActionListener {
    
    /**
     * The actionPerformed method is executed when the user clicks the calc
     * button.
     * @param e The event object
     */
     public void actionPerformed(ActionEvent e) {
       
       String input; // to hold user input from text field
       double miles; // the number of miles to output

       // get the text from the text field
       input = kiloTextField.getText();

       // convert the input to miles
       miles = Double.parseDouble(input) * 0.6214;

       // display the result
       JOptionPane.showMessageDialog(null, input + " kilometers is " + miles + " miles.");
       
     }

  } // end CalcButtonListener class

} // end KiloConverterWindow class
