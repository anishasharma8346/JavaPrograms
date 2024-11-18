package practice_package;

import java.util.Scanner;

public class Assign58 {
	static int a=80;
	static int b=67;

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the case number");
		int no=sc.nextInt();
		switch(no)
		{
		case 1:
			System.out.println(a+b);
			break;
		case 2:
			System.out.println(a-b);
			break;
		case 3:
			System.out.println(a*b);
			break;
		case 4:
			System.out.println(a%b);
			break;
			default :
				System.out.println("no proper input");
				
		
		}
	}

}
