package practice_package;

import java.util.ArrayList;
import java.util.Collection;



public class Prac123{

	public static void main(String[] args) {
		
		//== .equals
		
		int a= 120;
		int b= 120;
		//System.out.println(a==b);
		
		String name = "Automation";
		String name1= "automation";
		
		//System.out.println(name==name1);
		//System.out.println(name.equals(name1));
		
		String name2= new String("Testing");
		String name3= new String("Testing");
		
		System.out.println(name2.equals(name3));
		System.out.println(name2==name3);
		
		
		

	}

}
