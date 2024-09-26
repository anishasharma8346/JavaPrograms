package practice_package;
/*class Parent8{
	public void add() {
		System.out.println("Addition of two nos");
	}
	public void sub() {
		System.out.println("Subtraction of two nos");
		}
}
class Parent7 extends Parent8{
public void add() {
	System.out.println(12+43);
		}
	public void sub() {
		System.out.println(12-8);
	}
} */

class Parent6 {
public void add() {
	System.out.println("Sunday");	
	}
	public void sub() {
		System.out.println("Monday");	
	}
}
	public class MethodOver extends Parent6 {
		public void add()
		{
			super.add();
			System.out.println("Hello");
		}
		public void sub()
		{
			super.sub();
			System.out.println("Hie");
		}
		
		public static void main(String[] args) {
		MethodOver m1= new MethodOver();
		m1.add();
		m1.sub();
		
		}

}
