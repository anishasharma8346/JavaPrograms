package practice_package;

class Parent8{
public void add() {
	System.out.println("Addition of two nos");
}
public void sub() {
	System.out.println("Subtraction of two nos");
	}
}
public class Methodoveriding extends Parent8 {
	public void add() {
		System.out.println(12+43);
			}
		public void sub() {
			System.out.println(12-8);
		}
	public static void main(String[] args) {
		
		Methodoveriding m1= new Methodoveriding();
		m1.add();
		m1.sub();
	}

}
