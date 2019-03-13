/*
Ryan Citron
7/23/2018
Mobile Applications
Homework 4
*/

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class TicTacToe1 extends JFrame{


  private static final int WIDTH = 600;
  private static final int HEIGHT = 600;
  private static final int MAX_MOVES = 9;

  private JButton topLeft;
  private JButton topMiddle;
  private JButton topRight;

  private JButton midLeft;
  private JButton midMiddle;
  private JButton midRight;

  private JButton botLeft;
  private JButton botMiddle;
  private JButton botRight;

  private JLabel message;

  private JPanel gameBoard;
  private JPanel messageBoard;

  private JButton reset;

  private boolean player1Turn;
  private int moves;


  public static void main(String[] args){
    TicTacToe1 gui = new TicTacToe1();
    gui.setVisible(true);
  }

  public TicTacToe1(){

    super("Tic Tac Toe");
    setSize(WIDTH, HEIGHT);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new BorderLayout());
    player1Turn = true;
    moves = 0;

    // Top message
    message = new JLabel("Player 1 click a square to start.");
    messageBoard = new JPanel();
    messageBoard.add(message);
    add(messageBoard, BorderLayout.NORTH);

    // Game board
    gameBoard = new JPanel();
    gameBoard.setLayout(new GridLayout(3,3));

    // Top buttons
    topLeft   = new JButton();
    topLeft.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        placeValue(topLeft);
        isWin();
        isTie(); // checks if there is a tie after making a move
      }
    });

    topMiddle = new JButton();
    topMiddle.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        placeValue(topMiddle);
        isWin();
        isTie(); // checks if there is a tie after making a move
      }
    } );

    topRight  = new JButton();
    topRight.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        placeValue(topRight);
        isWin();
        isTie(); // checks if there is a tie after making a move
        ;}
    } );

    // Middle buttons
    midLeft   = new JButton();
    midLeft.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        placeValue(midLeft);
        isWin();
        isTie(); // checks if there is a tie after making a move
      }
    } );

    midMiddle = new JButton();
    midMiddle.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        placeValue(midMiddle);
        isWin();
        isTie(); // checks if there is a tie after making a move
      }
    } );

    midRight  = new JButton();
    midRight.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        placeValue(midRight);
        isWin();
        isTie(); // checks if there is a tie after making a move
      }
    } );

    // Bottom buttons
    botLeft   = new JButton();
    botLeft.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        placeValue(botLeft);
        isWin();
        isTie(); // checks if there is a tie after making a move
      }
    } );

    botMiddle = new JButton();
    botMiddle.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        placeValue(botMiddle);
        isWin();
        isTie(); // checks if there is a tie after making a move
        ;}
    } );

    botRight  = new JButton();
    botRight.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        placeValue(botRight);
        isWin();
        isTie(); // checks if there is a tie after making a move
      }
    } );

    // Button locations
    gameBoard.add(topLeft);
    gameBoard.add(topMiddle);
    gameBoard.add(topRight);
    gameBoard.add(midLeft);
    gameBoard.add(midMiddle);
    gameBoard.add(midRight);
    gameBoard.add(botLeft);
    gameBoard.add(botMiddle);
    gameBoard.add(botRight);

    add(gameBoard, BorderLayout.CENTER);

    // Reset button
    reset = new JButton("Reset");
    reset.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
        reset();
      }
    });
    add(reset, BorderLayout.SOUTH);
  }

  // Disables buttons when game is over
  private void disableButtons(){
    topLeft.setEnabled(false);
    topMiddle.setEnabled(false);
    topRight.setEnabled(false);
    midLeft.setEnabled(false);
    midMiddle.setEnabled(false);
    midRight.setEnabled(false);
    botLeft.setEnabled(false);
    botMiddle.setEnabled(false);
    botRight.setEnabled(false);
  }

  // Reenables buttons for game reset
  private void reenableButtons(){
    topLeft.setEnabled(true);
    topMiddle.setEnabled(true);
    topRight.setEnabled(true);
    midLeft.setEnabled(true);
    midMiddle.setEnabled(true);
    midRight.setEnabled(true);
    botLeft.setEnabled(true);
    botMiddle.setEnabled(true);
    botRight.setEnabled(true);
  }

  // Resets the game
  private void reset(){
    message.setText("Player 1 click a square to start.");
    topLeft.setText("");
    topMiddle.setText("");
    topRight.setText("");
    midLeft.setText("");
    midMiddle.setText("");
    midRight.setText("");
    botLeft.setText("");
    botMiddle.setText("");
    botRight.setText("");
    moves = 0;
    player1Turn = true;
    reenableButtons();
  }

  // Checks if we are max moves by incrementing the amount of
  // moves taken and the checking it vs MAX_MOVES
  private void isTie(){
    // Are we at max moves?
    if(moves == MAX_MOVES){
      message.setText("Game Over: TIE!");
      disableButtons();
    }
  }

  // Checks every win condition to see if there is a winner
  private void isWin(){

    if(
    (topLeft.getText() == "X" &&    // TOP HOR
    topMiddle.getText() == "X" &&
    topRight.getText() == "X")
    ||
    (midLeft.getText() == "X" &&   // MID HOR
    midMiddle.getText() == "X" &&
    midRight.getText() == "X")
    ||
    (botLeft.getText() == "X" &&    // BOT HOR
    botMiddle.getText() == "X" &&
    botRight.getText() == "X")
    ||
    (topLeft.getText() == "X" &&    // LEFT VERT
    midLeft.getText() == "X" &&
    botLeft.getText() == "X")
    ||
    (topMiddle.getText() == "X" &&  // MID VERT
    midMiddle.getText() == "X" &&
    botMiddle.getText() == "X")
    ||
    (topRight.getText() == "X" &&   // RIGHT VERT
    midRight.getText() == "X" &&
    botRight.getText() == "X")
    ||
    (topLeft.getText() == "X" &&    // LEFT DIA
    midMiddle.getText() == "X" &&
    botRight.getText() == "X")
    ||
    (topRight.getText() == "X" &&    // RIGHT DIA
    midMiddle.getText() == "X" &&
    botLeft.getText() == "X")
    )
    {
      message.setText("Game Over: Player 1 Wins!");
      disableButtons();
      moves = 0;
    }
    else if(
    (topLeft.getText() == "O" &&    // TOP HOR
    topMiddle.getText() == "O" &&
    topRight.getText() == "O")
    ||
    (midLeft.getText() == "O" &&    // MID HOR
    midMiddle.getText() == "O" &&
    midRight.getText() == "O")
    ||
    (botLeft.getText() == "O" &&    // BOT HOR
    botMiddle.getText() == "O" &&
    botRight.getText() == "O")
    ||
    (topLeft.getText() == "O" &&    // LEFT VERT
    midLeft.getText() == "O" &&
    botLeft.getText() == "O")
    ||
    (topMiddle.getText() == "O" &&  // MID VERT
    midMiddle.getText() == "O" &&
    botMiddle.getText() == "O")
    ||
    (topRight.getText() == "O" &&   // RIGHT VERT
    midRight.getText() == "O" &&
    botRight.getText() == "O")
    ||
    (topLeft.getText() == "O" &&    // LEFT DIA
    midMiddle.getText() == "O" &&
    botRight.getText() == "O")
    ||
    (topRight.getText() == "O" &&    // RIGHT DIA
    midMiddle.getText() == "O" &&
    botLeft.getText() == "O")
    )
    {
      message.setText("Game Over: Player 2 Wins!");
      disableButtons();
      moves = 0;
    }
  }

  // Checks to see if we can place a value and then places a value if the
  // button click can happen.,
  private void placeValue(JButton button){
    // Already has a value in that spot
    if(button.getText() == "X" ||
       button.getText() == "O") return;

    // Button needs an X or O
    if(player1Turn){
      button.setText("X");
      player1Turn = false;
      message.setText("Player 2's Turn");
      moves++;
    }
    else{
      button.setText("O");
      player1Turn = true;
      message.setText("Player 1's Turn");
      moves++;
    }

  }

}
