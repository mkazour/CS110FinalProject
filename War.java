//Michael Kazour
//Final Project

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class War extends JFrame
{

   //declare constants and variables
   private final int WINDOW_HEIGHT = 300;
   private final int WINDOW_WIDTH = 150;
   private JLabel greeting;
   
   public War()
   {
   
      //creating the card class as inheritance
      //making the 5 of dimaonds
      Card c1 = new Card(3,5); 
      
      //creates the deck right off the bet
      //shuffles the deck
      Deck1 d = new Deck1();
      d.shuffle();
   
      //create a greating when opened
      greeting = new JLabel("Michael Kazour's War Game");
      
      //add greeting 
      add(greeting);
      
      //set bakcground color
      getContentPane().setBackground(Color.BLUE);
      
      //show title
      setTitle("WAR!!");
      
      //set width and height
      setLayout(new BorderLayout(WINDOW_WIDTH,WINDOW_HEIGHT));
      
      //exit when the 
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      //make pannels and set background color
      JPanel north = new JPanel();
      north.setBackground(Color.CYAN);
      JPanel south = new JPanel();
      south.setBackground(Color.CYAN);
      JPanel east = new JPanel();
      east.setBackground(Color.LIGHT_GRAY);
      JPanel west = new JPanel();
      west.setBackground(Color.LIGHT_GRAY);
      
      //show title
      JLabel title = new JLabel("War");
      title.setFont(new Font("MONOSPACED", Font.BOLD, 50));
      
      //The user and computers texts
      JTextField user = new JTextField("User Name: ", 15);
      
      //war button
      JButton war = new JButton("War!");
      war.addActionListener(new WarButtonListener());
      
      //flip button
      JButton flip = new JButton("Flip");
      flip.addActionListener(new FlipButtonListener());
      
      //Creates cards for the players
         ImageIcon backW = new ImageIcon("back.jpg");
         JLabel backWest = new JLabel(backW);
         ImageIcon backE = new ImageIcon("back.jpg");
         JLabel backEast = new JLabel(backE);
     
      //user and computer points
      JLabel userp = new JLabel("User points: ");
      userp.setFont(new Font("PLAIN", Font.BOLD, 50));
      JLabel compp = new JLabel("Computer points: ");
      compp.setFont(new Font("PLAIN", Font.BOLD, 50));
      
      //exit button
      JButton exit = new JButton("Exit");
      war.addActionListener(new ExitButtonListener());
      
      
      //add north layout
      add(north, BorderLayout.NORTH);
      
      //add south layout
      add(south, BorderLayout.SOUTH);
      
      //add west layout
      add(west, BorderLayout.WEST);
      
      //add east layout
      add(east, BorderLayout.EAST);
      
      
      //add east buttons
      east.add(userp, BorderLayout.EAST);
      east.add(backEast, BorderLayout.EAST);
     
      //add north buttons
      north.add(title, BorderLayout.NORTH);
      north.add(war, BorderLayout.NORTH);
      north.add(user, BorderLayout.NORTH);
      
      
      west.add(compp, BorderLayout.WEST);
      west.add(backWest, BorderLayout.WEST);
      
      //add buttons to south   
      south.add(flip, BorderLayout.SOUTH);
      south.add(exit, BorderLayout.SOUTH);
      
      //add the action listener for the war button
      war.addActionListener(new WarButtonListener());
      
      //add the action listener to flip the card
      flip.addActionListener(new FlipButtonListener());
      
      //add the action listener for the exit button
      exit.addActionListener(new ExitButtonListener());
      
      //display window
      pack();
      setVisible(true);      
            
   }
   
   //flip button that performs the flip of a card
   class FlipButtonListener implements ActionListener
   {
      public void actionPerformed (ActionEvent e)
      {
         
         //shows queen of spades for example
         ImageIcon card = new ImageIcon("qs.jpg");
         JLabel flip1 = new JLabel(card);
         
      }
   }
   
   //button that starts the game of war
   private class WarButtonListener implements ActionListener
   {
      public void actionPerformed (ActionEvent e)
      {
         
         //one image of back puts one down
         ImageIcon card = new ImageIcon("back.jpg");
         JLabel flip1 = new JLabel(card);
         
         //flips to the 2 of clubs for example
         ImageIcon cardTwo = new ImageIcon("2c.jpg");
         JLabel flip2 = new JLabel(cardTwo);  
         
     }
  }
  
  //button that exits the program
  private class ExitButtonListener implements ActionListener
  {
     public void actionPerformed (ActionEvent e)
     {
        //system exits the program
        System.exit(0);
     }
  }       
  
  //main method
  public static void main (String[] args)
  {
  
      //call the game of war
      new War();
   
  }    
}
