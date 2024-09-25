package practice_package; //Non-parameterized Super Calling Statement

class Supermost2
{
public Supermost2()
{
	System.out.println("One");
}

}
class Suprmost1 extends Supermost2
{ 
public Suprmost1()
{
	System.out.println("Two");
}
	
}

class Supercls extends Suprmost1
{
	public Supercls()
	{
		System.out.println("Three");
	}
}

public class ConsOver extends Supercls{
	public ConsOver()
	{
		System.out.println("Four");
	}
	

	public static void main(String[] args) {
		new ConsOver();
		
		

	}
}




