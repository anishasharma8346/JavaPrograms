package assignment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapProgram {

	public static void main(String[] args) {
		
		Map<String, Integer> m1=new HashMap<String, Integer>();
		m1.put("Apple", 23);
		m1.put("Banana", 10);
		m1.put("Mango", 22);
		m1.put("Guava", 22);
		m1.put("Pomegranate", 26);
		System.out.println(m1);
		
		
		
	for(String s1:m1.keySet()) {
		
		System.out.println(s1);
	}
	
for(Integer l1:m1.values()) {
		
		System.out.println(l1);
	}
for(Entry<String, Integer>a1 :m1.entrySet()) {
	
	System.out.println(a1);
}
System.out.println("Using iterator");
Iterator<Entry<String, Integer>>k2 =m1.entrySet().iterator();
		while(k2.hasNext()) {
			System.out.println(k2.next());
		}
	}

}
