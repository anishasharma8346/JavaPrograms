package assignment;
class Parent{
	
void ECar(int i)
	{
		System.out.println("Audi");
	}
	
}

public class Methdoverr{ // extends Parent {
	void Car(int i) 
	{   // super.Car(i);
		System.out.println("BMW");
	}

	public static void main(String[] args) {
		
		Methdoverr m1= new Methdoverr();
		m1.Car(1);
		//m1.ECar(8);
	//	Parent p1= new Parent();
		//p1.Car(9);
	}

}
