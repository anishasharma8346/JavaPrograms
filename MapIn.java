package assignment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapIn {

	public static void main(String[] args) {
		Map <Integer,String>m1= new HashMap<Integer,String>();
		m1.put(101, "anisha");
		m1.put(102, "ankit");
		m1.put(103, "nick");
		m1.put(104, "babu");
		m1.put(105, "mom");
		m1.put(106, "bhai");
		System.out.println("using key set");
		for(Integer i1:      m1.keySet()) {
			
		System.out.println(i1);
		

	}
		System.out.println("using values");
		for(String s1:m1.values()) {
			
			System.out.println(s1);
		}
		System.out.println("using  Entry set");
		for(Entry<Integer,String> e1:m1.entrySet())
		{
			System.out.println(e1);
		}
		System.out.println("using  iterator");
		Iterator<Entry<Integer, String>> i3=m1.entrySet().iterator();
		while(i3.hasNext()) {
               System.out.println(i3.next());
	}}}
