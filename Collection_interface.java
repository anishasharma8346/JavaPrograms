package prac2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class Collection_interface {

	public static void main(String[] args) {
		/*Collection c1 =new ArrayList();
		c1.add(45);
		c1.add("ani");
		c1.add(172);
		c1.add(6.8);
		c1.add(true);
		c1.add(null);
		
		System.out.println(c1); */
		
	//	String [] a1= {null, "Testing", "Auto"};
		//System.out.println(a1[0]);
		int a []= new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nos");
		for(int i=0;i<5;i++) {
		 a[i]= sc.nextInt();
		}
		 System.out.println(Arrays.toString(a));
		
	}

}
