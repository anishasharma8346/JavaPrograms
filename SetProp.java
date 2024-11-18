package prac2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetProp {

	public static void main(String[] args) {
		Set s1 = new HashSet();
		s1.add(null);
		s1.add(null);
		s1.add(23);
		s1.add(23);
		s1.add(8679);
		s1.add(false);
		s1.add(true);
		s1.add(2345869.9999);
		s1.add("ANISHA");
		Iterator it=s1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		

	}

}
