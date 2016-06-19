/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeTopics;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample
{
  public static void main(String[] args)
  {
      
    //original order
    Set<String> s = new LinkedHashSet();
    
    //sorted order
//    Set<String> s=new TreeSet<String>();
    
    s.add("6 of clubs");
    s.add("8 of clubs");
    s.add("9 of clubs");
    s.add("7 of clubs");
    
    Iterator it = s.iterator();
    while (it.hasNext())
    {
      String value = (String)it.next();
     
      System.out.println("Value :" + value);
    }
  }
}

