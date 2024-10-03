package practice_package;

interface Amazon
{
	void greatindfestival();
	
}

interface Flipkart
{
	void bigbillionfestival();
}

public class Child2  implements Flipkart, Amazon {

	public static void main(String[] args) {
		Child2 c2= new Child2();
		c2.bigbillionfestival();
		c2.greatindfestival();

	}

	public void greatindfestival() {
	System.out.println("Great offers");
		
	}

	public void bigbillionfestival() {
		
		System.out.println("Best Deals");
	}

}
