package practice_package;

import java.util.Arrays;

public class Arrayexception {

	public static void main(String[] args) {
		int Employee[]= new int[3];
		Employee[0]= 01;
		Employee[1]=02;
		Employee[2]=02;
		Employee[3]=02;
		for (int i=0; i>=3;i++)
		{
			System.out.println(Arrays.toString(Employee));
		}
		

	}

}
