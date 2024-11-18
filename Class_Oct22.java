package prac2;

public class Class_Oct22 {

	public static void main(String[] args) {
	String str= new String("Automation");
//	String str1=str.concat("Testing");
	System.out.println(str); //immutable means it cannot be changed
	
	StringBuffer sb= new StringBuffer("Selenium");
	sb.append("test");
	sb.reverse();
	System.out.println(sb); //it is mutable means it can be changed
	
	StringBuilder sbl= new StringBuilder("india");
	sbl.append(" is a beautiful country");
	System.out.println(sbl);
	
	
	

	}

}
