//ภัทรธร ปรังประโคน 6230300761
//อิทธิกร ชัยพูล 6230301091

public class Card {
  public enum Rank = {
    ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
  }
  public enum Suit {
    CLUBS, DIAMONDS, HEARTS, SPADES
  }
  
  private final Rank rank;
  private final Suit suit;
  
  // Queens of Spades: rank = 12, suit=3
  // Five of Diamonds: rank = 5, suit=1

  public Card(Rank rank, Suit suit) {
    this.rank = rank;
    this.suit = suit;
  }

  //override method toString of java.lang.Object
  public String toString() {
    String s = this.rank + " of " + this.suit;
    return s;
  }

  public boolean equals(Card that) {
    return this.rank == that.rank && this.suit == that.suit;
  }

  // compareTo 
  public int compareTo(Card that) {
    if (this.suit < that.suit) {
      return -1;
    }
    if (this.suit > that.suit) {
      return 1;
    }
    if (this.rank < that.rank) {
      return -1;
    }
    if (this.rank > that.rank) {
      return 1;
    }
    return 0;
  }
  // accessor method
  public int getRank() {
    return this.rank;
  }

  // accessor method
  public int getSuit() {
    return this.suit;
  }

  // no setter method due to 'immutable' 

}
