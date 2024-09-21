package practice_package;

public class MethodOverloading {
	
	void add(int a, int b)
	{
		System.out.println(a/b);
	}
	void add(boolean b)
	{
		System.out.println(b);
	}
	
	void add (String a, int b)
	{
		System.out.println("String and int parameter");
	}
	
	void add(String a, String b)
	{
		System.out.println(a+b);
	}
	
	void add (char a, String b, boolean c)
	{
		System.out.println(c);
		System.out.println(b);
		System.out.println(a);
	}

	public static void main(String[] args) {
		MethodOverloading m1= new MethodOverloading();
		m1.add(true);
		m1.add("Anisha","Sharma");
		m1.add(13, 3);
		m1.add("faang", 0);
		m1.add('A', "Icecream", true);
				
		


	}

}
