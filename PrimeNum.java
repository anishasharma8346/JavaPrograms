package practice_package;

public class PrimeNum {

	public static void main(String[] args) {
		
		int no= 123;
		int count =0;
		for(int i=1; i<=no;i++)
		{
			if(no%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("The given no is prime number");
		}
		else
		{
			System.out.println("it is not prime num");
		}
	}

}
