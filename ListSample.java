package Differences;

import java.util.ArrayList;
import java.util.List;

public class ListSample {

	public static void main (String[] args) 
    {
        List<Integer> myList1 = new ArrayList<Integer>(); 
        myList1.add(0, 1); 
        myList1.add(1, 2); 
        System.out.println(myList1);

        List<Integer> myList2 = new ArrayList<Integer>(); 
        myList2.add(1); 
        myList2.add(2); 
        myList2.add(3); 
  
        myList1.addAll(1, myList2); 
        System.out.println(myList1); 
  
        myList1.remove(1);      
        System.out.println(myList1);
  
        System.out.println(myList1.get(2)); 
  
        myList1.set(0, 3);    
        System.out.println(myList1);  
    }
}
