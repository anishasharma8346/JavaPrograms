package practice_package;

public class Nonstatic2 {
	
	void add()
	{
		int a= 12;
		int b=20;
		int c= a+b;
		System.out.println(c);
	}
	
	void subtract() 
	{
		
		int a= 222;
		int b = 29;
		int c = a-b;
		System.out.println(c);
	}
	void mutiply() 
	{
		float a = 12345.0300f;
		float b = 3.23f;
		float c= a*b;
		System.out.println(c);
	}
	void division()
	{
		int a= 120;
		int b= 20;
		int c = a/b;
		System.out.println(c);
	}
	
	void modulus()
	{
		int a = 223;
		int b= 3;
		int c= a%b;
		System.out.println(c);
	}
	
	

	public static void main(String[] args) {
		
	Nonstatic2 n1= new Nonstatic2();
	n1.add();
	n1.division();
	n1.mutiply();
	n1.modulus();
	n1.subtract();
	
		
		
		

	}

}
