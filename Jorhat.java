package practice_package;

public class Jorhat  {
	
	Jorhat(int a)
	{
		System.out.println("Non-Para constructor");
	}
	
	Jorhat()
	{  this(5);
		System.out.println("Para constructor");
	}
	
	public static void main(String[] args) 
	{ 
		
		new Jorhat();
		
		
	}

}
