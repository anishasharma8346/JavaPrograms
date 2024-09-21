package practice_package;

import java.util.Scanner;

public class AreaOfCircle {
	
public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the radius");
		int radius =sc.nextInt();
		System.out.println("Enter the value of pi");
		double pi =sc.nextDouble();
		double area=pi*radius*radius;
		System.out.println("Area of the circle is-> "+area);
		sc.close();
		
		
		}

}
