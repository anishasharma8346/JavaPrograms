package prac2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Class35 {

	public static void main(String[] args) {
		String str ="Welcome to java java";
		String[] str1 =str.split(" ");
		Set s1= new LinkedHashSet();
		for(String st:str1)
		{
			s1.add(st);
		}
		System.out.println(s1);
		

	}

}
