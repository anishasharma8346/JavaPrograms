package prac2;

import java.util.Iterator;
import java.util.TreeSet;

public class Tree {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		/*ts.add("infosys");
	   ts.add(null);
		ts.add("company");
		ts.add(1234);
		//ts.add(null);
		ts.add(77.88);
		ts.add(true);
		ts.add(false);
		System.out.println(ts);*/
		ts.add(55);
		ts.add(7659); //it will give output in sorted manner and it doesnot allows heterogenous
		ts.add(85);
		ts.add(74);
		//ts.add(true);
		
		
		System.out.println(ts);
		Iterator it=ts.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
