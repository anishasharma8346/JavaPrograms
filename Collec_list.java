package prac2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Collec_list {

	public static void main(String[] args) {
		List li =new ArrayList();
		li.add(123);
		li.add(876);
		li.add(567);
		li.add(null);
		li.add(null);
		li.add(false);
		li.add(true);
		li.add("school");
		li.add(650);
		System.out.println(li);
		
		List l2 =new ArrayList();
		l2.addAll(li);
		l2.add(454);
		l2.add(7698);
		l2.add(1, "anisha");
	boolean l3=	l2.containsAll(li);
		System.out.println(l3);
		boolean l4=l2.contains(1);
		System.out.println(l4); 
		List l5 =new ArrayList();
		//l5.addAll(l2);
		l5.add(454);
		l5.add(7698);
		l5.add(9);
		l5.add(5);
		l5.add(2);
		l5.add(10);
		Collections.sort(l5);
		ListIterator l6=	l5.listIterator();
		while(l6.hasPrevious())
		{
			System.out.println(l6.previous());
		}
		
		
		
		

	}

}
