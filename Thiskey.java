package practice_package;

public class Thiskey {
	
	
	public Thiskey(int a)
	{
		System.out.println("Hii");
	}
	public Thiskey(String b, int c)
	{   this(4);
		System.out.println("Hello");
	}
	public Thiskey(char a, char b)
	{  this("Ani",4);
		System.out.println("constructor");
	}
	public Thiskey(boolean a, boolean b)
	{   this('a','b');
		System.out.println("true and false");
	}
	

	public static void main(String[] args) {
		 new Thiskey(true, false);
		 System.out.println("This calling statement");
		
		
	}

}
