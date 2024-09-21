package practice_package;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
	Scanner s1= new Scanner(System.in);
	System.out.println("Enter the breadth");
	int breadth=s1.nextInt();
	System.out.println("Enter the height");
	int height= s1.nextInt();
	
	double area=0.5*breadth*height;
	System.out.println("Area of the given triangle is-> "+area);
	
	s1.close();

	}

}
