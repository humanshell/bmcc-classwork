/**
 * This class and program creates a window where a user can input
 * a word, phrase, verse or sentence to determine if it's a palindrome
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PalindromeGUI extends JFrame implements ActionListener {
  
  // fields
  private JPanel textAreaPanel, textFieldPanel, buttonPanel;
  private JTextArea textArea;
  private JTextField textField;
  private JButton palindromeTestButton, palindromeClearButton;
  final int WINDOW_WIDTH = 500;
  final int WINDOW_HEIGHT = 300;
  
  // constructor
  public PalindromeGUI() {
    setTitle("Palindrome Testing");
    setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    textAreaPanel = new JPanel();
    textArea = new JTextArea(5, 25);
    textArea.setLineWrap(true);
    textAreaPanel.add(textArea);
    textFieldPanel = new JPanel();
    textField = new JTextField(25);
    textFieldPanel.add(textField);
    buttonPanel = new JPanel();
    palindromeTestButton = new JButton("Palindrome?");
    palindromeTestButton.addActionListener(this);
    palindromeClearButton = new JButton("Clear");
    palindromeClearButton.addActionListener(this);
    buttonPanel.add(palindromeTestButton);
    buttonPanel.add(palindromeClearButton);
    add(textAreaPanel, BorderLayout.NORTH);
    add(textFieldPanel, BorderLayout.CENTER);
    add(buttonPanel, BorderLayout.SOUTH);
    pack();
    setVisible(true);
  }
  
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == palindromeTestButton) {
      String str = textArea.getText().toLowerCase().replaceAll("\\W", "");
      StringBuilder sb = new StringBuilder(str);
      if (str.equals(sb.reverse().toString()))
        textField.setText("Yes");
      else
        textField.setText("No");
    } else {
      textField.setText("");
      textArea.setText("");
    }
  }

  public static void main(String[] args) {
    new PalindromeGUI();
  } // end main()

} // end PalindromeGUI class
