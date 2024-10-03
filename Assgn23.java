package practice_package;
class Assignment2
{
	public void mul()
	{
		System.out.println(8*8);
	}
	public void div()
	{
		System.out.println(100/5);
	}
}

abstract class Assignment extends Assignment2
{
	abstract void india();
	abstract void japan();
	public void servbsd()
	{
		System.out.println("serivce based");
	}
	public void prdcbsd()
	{
		System.out.println("product based");
	}
	
}


public class Assgn23 extends Assignment {
	public void sub()
	{
		System.out.println(23-8);
	}
	public void add()
	{
		System.out.println(555+76);
	}

	public static void main(String[] args) {
		
		Assgn23 as1= new Assgn23();
		as1.add();
		as1.div();
		as1.india();
		as1.japan();
		as1.mul();
		as1.sub();
		as1.servbsd();
		as1.prdcbsd();
		}
    void india() {
		System.out.println("INDIA");
		}
	void japan() {
		System.out.println("JAPAN");
		
	}

}



