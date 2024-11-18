package assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionH {
	

	public static void main(String[] args) {
	
		try {
			// int a= 1/0;
		
		//System.out.println(a);
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter the  value");
		int t1=s1.nextInt();
				}
		
		catch(ArithmeticException a1) {
			System.out.println("exception is handled");
			
		}
		catch(InputMismatchException d1) {
			System.out.println("Input mismatch is handled");
		}
		finally {
			System.out.println("finally is always be the output");
		}

	}

}
