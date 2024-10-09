package practice_package;

public class PalindromeString {

	public static void main(String[] args) {
	
		String org = "anisha";
		String rev="";
		int len= org.length();
		
		for(int i=len-1; i>=0; i--)
		{
			
			rev=rev+org.charAt(i);
		}
		System.out.println(rev);
		if( org.equals(rev))
				{
			System.out.println("It is a palindorme");
				}
		else
		{
			System.out.println("It is not palindrome");
		}

	}
	

}
