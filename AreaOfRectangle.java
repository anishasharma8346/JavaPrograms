package practice_package;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
	
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter the length");
		int length=s1.nextInt();
		System.out.println("Enter the breadth");
		int breadth= s1.nextInt();
		int Area= length*breadth;
		System.out.println("Area of Rectangle is-> "+Area);
        s1.close();
	}

}
