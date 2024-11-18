package assignment;
class Komal extends AbsMet{
	
}

abstract class  AbdCls{
	abstract void add();
	abstract void sub();
	void mul()
	{
		System.out.println("multiply");
	}
	
 	AbdCls()
 	{
 		System.out.println("constructor");
 	}
	
}

 public class AbsMet extends AbdCls {
	 void add() {
			System.out.println("Addition"+20+21);
			
		}
     	void sub() {
			System.out.println("Subtract"+60+21);}
	
public static void main(String[] args) {
	
	AbsMet ab = new AbsMet();
	ab.add();
	ab.sub();
	ab.mul();

	}

	}



