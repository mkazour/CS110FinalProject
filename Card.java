//Michael Kazour
//Java 110 Assignment 6.3
//Card class

public class Card
{

   /**
      declare the public variables in suit and rank. Set them to a number and
      protect the integers taken in by rank and suit with private. */
   public static final int SPADES = 0;
   public static final int CLUBS = 1;
   public static final int HEARTS = 2;
   public static final int DIAMONDS = 3;
   public static final int TWO = 2;
   public static final int THREE = 3;
   public static final int FOUR = 4;
   public static final int FIVE = 5;
   public static final int SIX = 6;
   public static final int SEVEN = 7;
   public static final int EIGHT = 8;
   public static final int NINE = 9;
   public static final int TEN = 10;
   public static final int ACE = 14;
   public static final int JACK = 11;
   public static final int QUEEN = 12;
   public static final int KING = 13;
   private int rank;
   private int suit;
   
   
   //cronstructor that accepts the rank and suit as arguements
   public Card(int s, int r)
   {
      this.suit = s;
      this.rank = r;
      
   }
   
   
   //return the suit
   public int getSuit()
   {

      return suit;
       
   }
   
   //return the rank
   public int getRank()
   {
   
      return rank;
      
   }
   
   //create a toString method that returns a string that explains their suit and rank
   public String toRankString()
   {
      if (rank == 2)
      {
         return "Two";
      }
      if (rank == 3)
      {
         return "Three";
      }
      if (rank == 4)
      {
         return "Four";
      }
      if (rank == 5)
      {
         return "Five";
      }
      if (rank == 6)
      {
         return "Six";
      }
      if (rank == 7)
      {
         return "Seven";
      }
      if (rank == 8)
      {
         return "Eight";
      }
      if (rank == 9)
      {
         return "Nine";
      }
      if (rank == 10)
      {
         return "Ten";
      }
      if (rank == 11)
      {
         return "Jack";
      }
      if (rank == 12)
      {
         return "Queen";
      }
      if (rank == 13)
      {
         return "King";
      }
      if (rank == 14)
      {
         return "Ace";
      }
      else
         return "That is an invalid rank";
      
   }
   
   public String toSuitString()
   {
      if(suit == 0)
      {
         return "Spades";
      }
      if(suit == 1)
      {
         return "Clubs";
      }
      if(suit == 2)
      {
         return "Hearts";
      }
      if(suit == 3)
      {
         return "Diamonds";
      }
      else
         return "That is an invalid suit";
      
   }
   
   
   //boolean that returns true or false if the two card ranks equal each other
   public boolean equals(Card otherCard)
   {
      if(rank == otherCard.rank)
         return true;
         
      else 
         return false;
         
   }
   
   
}
   