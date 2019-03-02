package Differences;

import java.util.TreeSet;

public class TreeSetSample {
	public static void main(String[] args) 
    { 
        TreeSet<String> ts1 = new TreeSet<>(); 
  
        ts1.add("A"); 
        ts1.add("B"); 
        ts1.add("C"); 
        ts1.add("C"); 
        
        System.out.println(ts1); 
    }

}
