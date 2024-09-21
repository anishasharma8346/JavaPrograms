package practice_package;

import java.util.Scanner;

public class CircumferenceOfCircle {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the radius");
		int R = s1.nextInt();
		System.out.println("Enter the value of pi");
		double pi = s1.nextDouble();
		double circumference = 2 * pi * R;
		System.out.println("Circumference of circle is-> " + circumference);
		s1.close();

	}

}
