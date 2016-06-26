import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class deal
{
  public static void main(String[] args)
  {
    int numHands = 3;
    int cardsPerHand = 5;
    
    String[] suit = { "spades", "hearts", "diamonds", "clubs" };
    
    String[] rank = { "ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king" };
    
    List<String> deck = new ArrayList();
    for (String suit1 : suit) {
      for (String rank1 : rank) {
        deck.add(rank1 + " of " + suit1);
      }
    }
    
    
 //Add or remove an element
//    ListIterator listIterator = deck.listIterator();
//    listIterator.next();
//    listIterator.next();
//    listIterator.next();
//    listIterator.next();
//    listIterator.next();
//    listIterator.remove();
//    listIterator.add("50 of spades");
    
    
    
    
    //Reverse order
//    for (Object it = deck.listIterator(deck.size()); ((ListIterator)it).hasPrevious();)
//    {
//      String t = (String)((ListIterator)it).previous();
//      System.out.println(t);
//    }
    //Normal order
    for (Object it = deck.listIterator(); ((ListIterator)it).hasNext(); )
     {
       
      String t = (String)((ListIterator)it).next();
      System.out.println(t);
    }   

    // Shuffle the deck.
        Collections.shuffle(deck);
        
    // Show various hands 
//    for (int i = 0; i < numHands; i++)
//      System.out.println(dealHand(deck, cardsPerHand));
  }
  
  public static <E> List<E> dealHand(List<E> deck, int n)
  {
    int deckSize = deck.size();
    List<E> handView = deck.subList(deckSize - n, deckSize);
    List<E> hand = new ArrayList(handView);
    handView.clear();
    return hand;
  }
}
