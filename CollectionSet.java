package prac2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionSet {

	public static void main(String[] args) {
	Set s1 = new HashSet();
	s1.add("mindtree");
	s1.add("lti");
	s1.add(null);
	s1.add(123);
	s1.add(null);
	s1.add(44);
	s1.add(false);
	s1.add(76);
	s1.add(764);
	s1.add(true);
	s1.add(7987.8999);
	s1.add(764);
	System.out.println(s1);
	Iterator i1=s1.iterator();
	while(i1.hasNext()) {
		System.out.println(i1.next());
		
	}

	}

}
