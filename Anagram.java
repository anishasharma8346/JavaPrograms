package practice_package;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String one= "listen";
		String two= "silent";
		char newone []= one.toCharArray();
		char newtwo[]=two.toCharArray();
		Arrays.sort(newone);
		Arrays.sort(newtwo);
		
		if(Arrays.equals(newone, newtwo)==true)
		{
			System.out.println("It is anagram");
		}
		else
		{
			System.out.println("It is not anagram");
		}

	}

}
