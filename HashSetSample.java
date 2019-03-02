package Differences;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetSample {

	public static void main(String[]args) 
    { 
        HashSet<String> countries = new HashSet<>(); 
  
        countries.add("Libya"); 
        countries.add("Japan"); 
        countries.add("Kenya"); 
        countries.add("Libya");// adding duplicate elements 
  
        System.out.println(countries); 
        System.out.println("List contains Japan or not:" + 
                           countries.contains("Japan")); 
  
        countries.remove("Kenya"); 
        System.out.println("Set after removing Kenya:"+countries); 
  
        System.out.println("Going through list:"); 
        Iterator<String> i = countries.iterator(); 
        while (i.hasNext()) 
            System.out.println(i.next()); 
    }
	
}
