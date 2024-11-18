package prac2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.ListIterator;

public class CollectionArraylist {

	public static void main(String[] args) {
	ArrayList a1 = new ArrayList();
	a1.add("college");
	a1.add("principal");
	a1.add(0, 102);
	a1.add("ice cream");
	a1.add(null);
	a1.add(false);
	a1.add(true);
	a1.add(12345);
	boolean b=a1.contains(23);
	//System.out.println(a1);
	//System.out.println(b);
	
	ListIterator l1= a1.listIterator();
	System.out.println("Forward");
	while(l1.hasNext())
		
	{
		System.out.println(l1.next());
	}
	 System.out.println("Backward");
	while(l1.hasPrevious())
		
	{ 
		System.out.println(l1.previous());
	}
	
	}

}
