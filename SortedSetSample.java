package Differences;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetSample {
	
	public static void main(String[] args) 
    {
        SortedSet<String> words = new TreeSet<>(); 
        words.add("cat"); 
        words.add("dog"); 
        words.add("lion"); 
        words.add("rabbit"); 
  
        System.out.println("Sorted Set: " + words); 
        System.out.println("First: " + words.first()); 
        System.out.println("Last: " + words.last()); 
  
        SortedSet<String> beforeLion = words.headSet("lion"); 
        System.out.println(beforeLion); 

        SortedSet<String> betweenDogAndRabbit = words.subSet("dog","rabbit"); 
        System.out.println(betweenDogAndRabbit); 
  
        SortedSet<String> afterLion = words.tailSet("lion"); 
        System.out.println(afterLion); 
    }

}
