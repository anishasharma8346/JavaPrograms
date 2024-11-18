package prac2;

public class StringRev {

	public static void main(String[] args) {
		String str = "Testing"; 
		
		String rev = "";
		for(int i=str.length()-1;i>=0 ;i--)
		{
			char a=str.charAt(i);
		     rev= rev+a;
		 	
	}
		System.out.println(rev);
	

}
	
}
