package practice_package;

import java.util.Arrays;

public class CharCount {
	static int alphacount;
	static int digitcount;
	static int spacecount;

	public static void main(String[] args) {
		
		String input ="Automation Testing * @ 12345";
		char input1 []= input.toCharArray();
		System.out.println(Arrays.toString(input1));
		for(int i=0;i<input.length();i++)
		{
			boolean b1=Character.isAlphabetic(input1[i]);
			if(b1==true)
			{
				alphacount++;
			}
		boolean c1=	Character.isDigit(input1[i]);
		if (c1==true)
		{
			digitcount++;
		}
		boolean d1= Character.isWhitespace(input1[i]);
		if(d1==true) 
		{
			spacecount++;
			
		}
		}
	
		int specialchar= input.length()-(alphacount+digitcount+spacecount);
		System.out.println("Total special character in the given string is "+specialchar);
		System.out.println("Total spaces in the given string is "+spacecount);
		System.out.println("Total digits in the given string is "+digitcount);
		System.out.println("Total alphabets in the given string is "+alphacount);
		
	

}
}
