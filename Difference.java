package prac2;

public class Difference {

	public static void main(String[] args) {
		String a= "Test";
		String b= "Test";
		System.out.println(a==b);
		System.out.println(a.equals(b));
		
		String c= new String("Test");
		String d= new String("Test");
		System.out.println(c==d);
		System.out.println(c.equals(d));
		
	}

}
