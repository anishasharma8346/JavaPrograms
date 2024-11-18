package prac2;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlistclss {

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.add(12345);
		l1.add(1234);
		l1.add(123);
		l1.add(12);
		l1.add(null);
		l1.add(null);
		l1.add(12345);
		l1.add(false);
		l1.add(true);
		l1.add(934.233);
		l1.add(2, 87);
		l1.add(99928392);
		l1.add("college");
		System.out.println(l1);
		Iterator it=l1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
