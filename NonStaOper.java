package practice_package;

public class NonStaOper{
	
	void addition() {
		int a=32;
		int b= 39;
		int sum= a+b;
		System.out.println(sum);
	}

	void subtraction()
	{
		int a =250;
		int b= 39;
		int sub= a-b;
		System.out.println(sub);
	}
	void multiplication()
	{
		int a= 55;
		int b= 98;
		int multi= a*b;
		System.out.println(multi);
	}
	void division()
	{
		int a= 30;
		int b=5;
		int div=a/b;
		System.out.println(div);
	}
	void modulus()
	{
		int a= 400;
		int b= 33;
		int mod= a%b;
		System.out.println(mod);
	}
	
	
	public static void main(String[] args) {
		NonStaOper n1= new NonStaOper();
		n1.addition();
		n1.multiplication();
		n1.modulus();
		n1.division();
		n1.subtraction();
		

	}

}
















