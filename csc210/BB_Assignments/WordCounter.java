/**
 *
 * Assignment 8 - 12/12/2011
 *
 * This file contains all the classes and methods necessary to display a window
 * that will analyze text input by the user. It counts the number of words,
 * characters and lines that have been typed into a text area and displays the
 * results in 3 labels. The analysis begins when a single button is clicked.
 *
 * @author Dominic Giglio, CSC 210 Sec 121
 *
 */

import javax.swing.*;    // import all the swing classes
import java.awt.*;       // import all the awt classes
import java.awt.event.*; // import the awt event classes (ActionListener)

public class WordCounter extends JFrame {

  private JPanel labelPanel;      // a panel to hold the labels
  private JPanel buttonPanel;     // a panel to hold the process button
  private JPanel textAreaPanel;   // a panel to hold the text area
  private JTextArea textArea;     // a text area for user to input text
  private JScrollPane scrollPane; // a scroll pane for the text area
  private JLabel wordCount;       // a label to display the word count
  private JLabel charCount;       // a label to display the character count
  private JLabel lineCount;       // a label to display the line count
  private JButton processButton;  // a button to process text in the text area
  final int WINDOW_WIDTH = 500;   // window width in pixels
  final int WINDOW_HEIGHT = 300;  // window height in pixels

  /**
   * Constructor
   */
  public WordCounter() {
    
    // set the title
    setTitle("Word Counter");

    // set the size of the window
    setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

    // specify what happens when close button is clicked
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // build the label panel
    buildLabelPanel();
    
    // build the button panel
    buildButtonPanel();
    
    // build the text area panel
    buildTextAreaPanel();

    // add the three panels to the JFrame content pane
    add(labelPanel, BorderLayout.NORTH);
    add(buttonPanel, BorderLayout.SOUTH);
    add(textAreaPanel, BorderLayout.WEST);

    // pack and display the window
    pack();
    setVisible(true);

  } // end constructor

  /**
   * buildLabelPanel() method
   * This method handles the creation of the label panel and its labels
   */
  private void buildLabelPanel() {
    
    // create the panel to hold the labels
    labelPanel = new JPanel();

    // set the label panel to use a grid layout
    labelPanel.setLayout(new GridLayout(3, 1));

    // create the initial labels
    wordCount = new JLabel(" Number of Words: ");
    charCount = new JLabel(" Number of Chars: ");
    lineCount = new JLabel(" Number of Lines: ");

    // add labels to the panel
    labelPanel.add(wordCount);
    labelPanel.add(charCount);
    labelPanel.add(lineCount);

  } // end buildLabelPanel() method

  /**
   * buildTextAreaPanel() method
   * This method handles the creation of the text area panel and its text area
   */
  private void buildTextAreaPanel() {
    
    // create the panel to hold the text area
    textAreaPanel = new JPanel();

    // create the JTextArea
    textArea = new JTextArea(5, 25);
    textArea.setLineWrap(true);

    // create the scroll pane and add the text area to it
    scrollPane = new JScrollPane(textArea);
    scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);

    // add the text area to the panel
    textAreaPanel.add(scrollPane);

  } // end buildTextAreaPanel() method

  /**
   * buildButtonPanel() method
   * This method handles the creation of the button panel and its button
   */
  private void buildButtonPanel() {
    
    // create the panel to hold the button
    buttonPanel = new JPanel();

    // create the process text button
    processButton = new JButton("Process the Text");

    // register an action listener with the button
    processButton.addActionListener(new ButtonListener());

    // add the button to the panel
    buttonPanel.add(processButton);

  } // end buildButtonPanel() method

  /**
   * Event Listener Class
   * This class will be registered with the process button to analyze the text
   * area and update the labels with the results.
   * @param ActionEvent e The event that was triggered by the button
   */
  private class ButtonListener implements ActionListener {
  
    // action performed method, called when the button is clicked
    public void actionPerformed(ActionEvent e) {
      
      // update the label text
      wordCount.setText(" Number of Words: " + wordCount());
      charCount.setText(" Number of Chars: " + textArea.getText().length());
      lineCount.setText(" Number of Lines: " + textArea.getLineCount());

    } // end actionPerformed() method

  } // end ButtonListener class

  /**
   * wordCount() method
   * This method counts whitespace and newlines to determine number of words
   * @return The number of words found
   */
  private int wordCount() {

    // if there's nothing in the text area just return 0
    // otherwise split the string into an array and return its length
    if (textArea.getText().length() == 0)
      return 0;
    else {
      String[] tarr = textArea.getText().split(" ");
      return tarr.length;
    }

  } // end wordCount() method

  /**
   * Main method
   */
  public static void main(String[] args) {
    
    // instantiate an object of the WordCounter class
    new WordCounter();

  } // end main() method
  
} // end WordCounter class



