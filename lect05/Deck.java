// ภัทรธร ปรังประโคน 6230300761
public class Deck {
    private Card[] cards;
  
    public Deck() 
    {  
        // create an array of 52 Cards
        this.cards = new Card[52];
        // initialize with all suit and rank
        for (Card.Suit suit : Card.Suit.values())
        {
            for (Card.Rank rank : Card.Rank.values())
            {
                this.cards[idx++] = new Card(rank,suit);
            }
        }
    }
  
    /*
     Shuffle the deck
     */
    public void shuffle() 
    {
      // choose a random number between i and this.cards.length-1
      // swap the ith card and the randomly-chosen card
        for (int i = 0; i < this.cards.length; i++)
        {
            int sidx = randomInt (i+1,this.cards.length-1);
            swapCard(i,sidx);
        }
    }
    
    private static int randomInt(int low, int high)
    {
        return (int)(Math.random() * (high-low+1)+low);
    }
  
    private void swapCards(int i, int j)
    {
        Card tmp = this.cards[i];
        this.cards[i] = this.card[j];
        this.cards[j] = tmp;
    }
  
    public void print() 
    {
      // print all cards in the deck
        for (int i=0; i < this.cards.length; i++)
        {
            System.out.println(this.cards[i]);
        }
    }
  
    public Card[] getCards()
    {
      // return the deck
        return this.cards;
    }
  
    public void insertionSort() 
    {
      // sort cards in the deck using 
      // Insertion Sort algorithms
        int i,j;
        Card key;
        for (i=1; i < this.cards.length; i++)
        {
            key = this.cards[i];
            j = i-1;
            while (j >= 0 && this.cards[j].compareTo(key) > 0)
            {
                this.cards[j+1] = this.cards[j];
                j--;
            }
            this.cards[j+1] = key;
        }
    }
  }
  
