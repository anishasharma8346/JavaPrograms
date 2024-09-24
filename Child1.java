package practice_package;

class Parent3
{
	public static void mul()
	{
		System.out.println(Math.multiplyExact(2789366, 2));
	}
	public void div()
	{
		System.out.println(Math.floorDiv(32883, 31));
	}
}
class Parent2 extends Parent3

{
	public static void add()
	{
		System.out.println(Math.addExact(52, 87));
	}
	public void sub()
	{
		System.out.println(Math.subtractExact(727, 568));
	}
}
class Parent1 extends Parent2
{
	public static void max()
	{
		System.out.println(Math.max(67.387322, 982.98238));
	}
	public void min()
	{
		System.out.println(Math.min(9128, 8822));
	}
}


public class Child1 extends  Parent1{

	public static void main(String[] args) {
		System.out.println("I am child class");
		Child1 c1= new Child1();
		c1.div();
		c1.min();
		c1.sub();
		mul();
		add();
		max();

	}

}
