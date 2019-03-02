package Differences;

import java.util.Enumeration;
import java.util.Vector;

public class VectorSample {

	public static void main(String args[]) {

	      Vector v = new Vector(3, 2);
	      System.out.println("Initial size: " + v.size());
	      System.out.println("Initial capacity: " + v.capacity());
	      
	      v.addElement(new Integer(1));
	      v.addElement(new Integer(2));
	      System.out.println("Capacity after two additions: " + v.capacity());

	      v.addElement(new Double(5.45));
	      System.out.println("Current capacity: " + v.capacity());
	      
	      v.addElement(new Float(9.4));
	      System.out.println("Current capacity: " + v.capacity());

	      System.out.println("First element: " + (Integer)v.firstElement());
	      System.out.println("Last element: " + (Integer)v.lastElement());
	      
	      if(v.contains(new Integer(3)))
	         System.out.println("Vector contains 3.");
	         
	      // iterate the elements in the vector.
	      Enumeration vnum = v.elements();
	      System.out.println("\nElements in vector:");
	      
	      while(vnum.hasMoreElements())
	         System.out.print(vnum.nextElement() + " ");
	      System.out.println();
	   }
}
