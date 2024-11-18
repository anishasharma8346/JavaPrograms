package practice_package;

public class StringFunc {

	public static void main(String[] args) {
	String str= "AutomationTesting 123 WithJava and Selenium 1234";
	System.out.println(str.replace("AutomationTesting", "GroTechMinds"));
	System.out.println(str.replace('e', 'a'));
	System.out.println(str.replaceAll("[A-Z,a-z]", ""));
	System.out.println(str.replaceAll("[1-9]", ""));
	System.out.println(str.replaceAll("[1-3]", ""));
	System.out.println(str.replace(" ", "_"));
	System.out.println(str.contains("W")); 
	
	System.out.println(str.matches("(.*)W(.*)"));
	//("(.*)p(.*)"))
	System.out.println(str.matches("(A)(.*)"));
	
	

	}

}
