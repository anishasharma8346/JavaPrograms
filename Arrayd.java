package assignment;

import java.util.Arrays;

public class Arrayd {

	public static void main(String[] args) {
	int arr1[]= {1,2,3,4,5};
	int arr2[]= new int[5];
	for(int i=0,j=arr1.length-1;i<arr1.length;i++,j--)
	{
		arr2[j]=arr1[i];
		
	}
	System.out.println(Arrays.toString(arr1));
    System.out.println(Arrays.toString(arr2));
	}

}
