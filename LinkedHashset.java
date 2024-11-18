package prac2;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashset {

	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("anisha");
		lhs.add("anisha");
		lhs.add(null);
		lhs.add(76890);
		lhs.add(6678.88);
		lhs.add(true);
		lhs.add("country");
		lhs.add("usa");
		lhs.add(998766579);
		lhs.add(654);
		lhs.add(3345);
		lhs.add(99);
		System.out.println(lhs); //it follows order of insertion
		Iterator it=lhs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		

	}

}
