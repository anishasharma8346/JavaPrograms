package practice_package;
public class NonStaticMethod 
{
	void addition()
	{
		System.out.println("Adding 2 numbers");
	}
	void subtraction()
	{
		System.out.println("subtracting 2 numbers");
	}
	public static void main(String[] args) 
	{
		
		NonStaticMethod n1=new NonStaticMethod();
		n1.addition();
		n1.subtraction();
		System.out.println("My Main Method");
		
	}

}
