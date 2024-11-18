package prac2;

import java.util.Arrays;

public class DiffArray {

	public static void main(String[] args) {
	
		int a[]= new int[4];
		a[0]=12;
		a[1]=10;
		a[2]=21;
		a[3]=99;
		
		int b[]= new int[4];
		
		for(int i=3,j=0;i>=0;i--,j++)
		{
			b[j]=a[i];
			//j++;
		}
		        System.out.println(Arrays.toString(a));
				System.out.println(Arrays.toString(b));
		
		

	}

}
