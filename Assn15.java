package practice_package;
class ParentIn{
	int a;
	boolean b;
	public void add()
	{
		System.out.println(a);
		
	}
	
}

public class Assn15 extends ParentIn {

	public static void main(String[] args) {
		
		Assn15 a1= new Assn15();
		a1.add();
		System.out.println(a1.b);
		System.out.println("Main method");
		

	}

}
