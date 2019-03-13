/*
Ryan Citron
7/18/2018
Mobile Applications
Homework 3
*/

import java.lang.Integer;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class NumberConverter1 extends JFrame
                              implements ActionListener
{

  public static final int WIDTH = 800;
  public static final int HEIGHT = 100;
  public static final int NUMBER_OF_CHAR = 10;

  private JTextField base10;
  private JTextField base2;

  private JButton convert;
  private JButton reset;

  private JPanel inputPanel;
  private JPanel subInputPanel;
  private JPanel buttonPanel;
  private JPanel subButtonPanel;

  private JLabel base10Text;
  private JLabel base2Text;

  private int base10Value;
  private String base2Value;

  public static void main(String[] args){
    NumberConverter1 gui = new NumberConverter1();
    gui.setVisible(true);
  }

  public NumberConverter1(){

    // Mainframe
    super("Number Converter");
    setSize(WIDTH, HEIGHT);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new GridLayout(2, 1));
    setBackground(Color.WHITE);

    // Top panel
    inputPanel = new JPanel();
    inputPanel.setLayout(new BorderLayout());
    inputPanel.setBackground(Color.WHITE);

    // Top sub panel for text fields
    subInputPanel = new JPanel();
    subInputPanel.setBackground(Color.WHITE);

    // Labels for telling what to input
    base10Text = new JLabel("Enter your base 10 number: ");
    base2Text = new JLabel(" Your converted number to base 2: ");
    base10 = new JTextField(NUMBER_OF_CHAR);
    base2 = new JTextField(NUMBER_OF_CHAR);

    subInputPanel.add(base10Text);
    subInputPanel.add(base10);
    subInputPanel.add(base2Text);
    subInputPanel.add(base2);

    inputPanel.add(subInputPanel, BorderLayout.NORTH);

    add(inputPanel);

    // Bottom panel
    buttonPanel = new JPanel();
    buttonPanel.setLayout(new BorderLayout());
    buttonPanel.setBackground(Color.WHITE);

    // Bottom sub panel for buttons
    subButtonPanel = new JPanel();
    subButtonPanel.setBackground(Color.WHITE);

    // Buttons
    convert = new JButton("Convert");
    convert.addActionListener(this);

    reset = new JButton("Reset");
    reset.addActionListener(this);

    subButtonPanel.add(convert);
    subButtonPanel.add(reset);

    buttonPanel.add(subButtonPanel);

    add(buttonPanel);


  }

  public void actionPerformed(ActionEvent e){

    String actionCommand = e.getActionCommand();

    if(actionCommand.equals("Convert")){

      String base10Input = base10.getText();
      base10Value = Integer.parseInt(base10Input);
      base2Value = Integer.toBinaryString(base10Value);
      base2.setText(base2Value);

    }
    else if(actionCommand.equals("Reset")){
      base10.setText("");
      base2.setText("");
    }
    else{
      System.out.println("Unexpected error.");
    }

  }


}
