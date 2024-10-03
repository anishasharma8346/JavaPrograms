package practice_package;

abstract class Abs{
	abstract void add();
	
	
}

public class AbS_Concrt extends Abs {
	
	void sub()
	{
		System.out.println(12-9);
	}

	public static void main(String[] args) {
		
		AbS_Concrt a1= new AbS_Concrt ();
		a1.sub();
		a1.add();
		

	}

	
	
	void add() {
		System.out.println(12+89);
		
		
	}

}
