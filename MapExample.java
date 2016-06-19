/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeTopics;

/**
 *
 * @author brendon
 */
import java.io.PrintStream;
import java.util.Map;
import java.util.TreeMap;

public class MapExample
{
  public static void main(String[] args)
  {
    Map<String, Integer> m = new TreeMap();
    
    String[] suit = { "1 of spades", "2 of spades", "6 of spades", "7 of spades", "9 of spades", "3 of spades", "6 of spades", "3 of spades", "4 of spades", "8 of spades", "Jack of spades", "Ace of spades", "King of spades", "Queen of spades" };
    for (String a : suit)
    {
      Integer freq = (Integer)m.get(a);
      m.put(a, Integer.valueOf(freq == null ? 1 : freq.intValue() + 1));
    }
    int count = 0;
    for (int i = 0; i < suit.length; i++) {
      if (suit[i] != null) {
        count++;
      }
    }
    System.out.println(count + " total cards.");
    
    System.out.println(m.size() + " individual cards:");
    System.out.println(m);
  }
}

