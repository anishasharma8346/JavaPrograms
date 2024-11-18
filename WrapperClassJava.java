package prac2;

import java.util.Arrays;

public class WrapperClassJava {
	static int Alphabets;
	static int Numeric;
	static int Space;
	static int Specialchar;

	public static void main(String[] args) {

		String str = "RaM Ji Ki Kripa 123@!#$";
		char c[] = str.toCharArray();
		System.out.println(Arrays.toString(c));
		for (int i = 0; i < str.length(); i++) {

			if (Character.isAlphabetic(c[i]) == true) {
				
				Alphabets++;}
				if (Character.isDigit(c[i])== true) {
				Numeric++;	
				}
				if(Character.isWhitespace(c[i])==true) {
					Space++;
				}
			}
			System.out.println("Count of alphabets is " + Alphabets);
			System.out.println("Count of number is " + Numeric);
			System.out.println("Count of number is " + Space);
			Specialchar=str.length()-(Alphabets+Numeric+Space);
			System.out.println(Specialchar);
			

	}
}
