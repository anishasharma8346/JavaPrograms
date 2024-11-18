package prac2;

public class Pract1 {

	public static void main(String[] args) {
		
		String org = "madam";
		String rev = "";
		for (int i=org.length()-1;i>=0;i--) {
			rev=rev+org.charAt(i);
		}
//System.out.println(rev);
	
	if(org.equals(rev)==true) {
		System.out.println("it is palindrome");
	}
	else
		System.out.println("it is not palindrome");
		
	}

}
