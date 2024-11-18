package prac2;

import java.util.Enumeration;
import java.util.Vector;

public class CollectionVec {

	public static void main(String[] args) {
		Vector v1= new Vector();
		v1.addElement("auto");
		v1.addElement(12);
		v1.addElement(123);
		v1.addElement(21);
		v1.addElement(66);
		v1.addElement(null);
		v1.addElement(false);
		v1.addElement(true);
		v1.addElement(128990999);
		
		//System.out.println(v1);
		
		Vector v2= new Vector();
		v2.addAll(v1);
		v2.addElement("ice cream");
		v2.addElement("burger");
		
		
		//System.out.println(v2);
		
		//System.out.println(v2.get(0));
		Enumeration e1=v2.elements();
		while(e1.hasMoreElements())
				{
			System.out.println(e1.nextElement());
				}
		
	}

}
