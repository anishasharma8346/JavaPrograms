package prac2;

// import java.util.Collections;
import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Stack;

public class Stackclass {

	public static void main(String[] args) {
	Stack s1= new Stack();
	s1.add(9);
	s1.add(8);
	s1.add(7);
	s1.add(7);
	s1.add(null);
	s1.add(null);
	s1.add(false);
	s1.add(true);
	s1.add("nichols");
	s1.add("school");
	s1.add(1234567899);
	System.out.println(s1);
	/*Enumeration e1=s1.elements();
	while(e1.hasMoreElements())
	{
		
		System.out.println(e1.nextElement());
	}*/
	ListIterator l1=	s1.listIterator();
	System.out.println("forward");
	while(l1.hasNext())
	{
		System.out.println(l1.next());
	}
	System.out.println("backward");
	while(l1.hasPrevious())
	{
		System.out.println(l1.previous());
	}

	}

}
