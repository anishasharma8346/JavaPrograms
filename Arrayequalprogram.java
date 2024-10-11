package practice_package;

import java.util.Arrays;

public class Arrayequalprogram {

	public static void main(String[] args) {
		int arr[]=new int[2];
		arr[0]=12;
		arr[1]=22;
		int arr2 []= new int[2];
		arr2[0]=34;
		arr2[1]=76;
		boolean b2=Arrays.equals(arr, arr2);
		System.out.println(b2);
		

	}

}
