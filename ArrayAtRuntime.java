package practice_package;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAtRuntime {

	public static void main(String[] args) {
		int a[]=new int[4];
		Scanner s1= new Scanner(System.in);
		for(int i=0;i<=4;i++)
		{
			a [i]=s1.nextInt();
		}
		System.out.println(Arrays.toString(a));
		

	}

}
