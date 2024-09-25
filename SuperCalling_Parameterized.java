package practice_package;
class India
{
	public India(int a)
	{
		System.out.println(a);
	}
}
class Assam extends India
{
	public Assam(boolean b)
	
	{
		super(2);
		System.out.println(b);
	}
}
class Delhi extends Assam
{
	public Delhi(int a, String b)
	{
		super(false);
		System.out.println(a);
		System.out.println(b);
	}
}
class Mumbai extends Delhi
{
	public Mumbai(int a , String b, boolean c)
	{
		super(10,"Anisha");
		System.out.print(a);
		System.out.print(b);
		System.out.print(c);
	}
}

public class SuperCalling_Parameterized extends Mumbai {
	public SuperCalling_Parameterized(String a, char b, String c) 
	{
		super(12, "Hi", true);
		System.out.println("sub class constructor");
	}

	public static void main(String[] args) {
		new SuperCalling_Parameterized("Ani",'q',"Tiger");

	}

}
