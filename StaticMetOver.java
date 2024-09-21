package practice_package;

public class StaticMetOver {
	
	public static void mod(boolean a, char b)
	{
		System.out.println(a);
		System.out.println(b);
		
	}
	public static void mod(int a)
	{
		System.out.println(a*22);
	}
	public static void mod(int a, int b)
	{
		System.out.println(a%b);
	}
	public static void mod(double a, double b)
	{
		System.out.println(a+b);
	}
	

	public static void main(String[] args) {
		
		mod(3);
		mod(2,3);
		mod(22.5,21.299);
		
		
		

	}

}
