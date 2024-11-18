package practice_package;

public class IgnoreCase1 {

	public static void main(String[] args) {
		//assignment-37
		
		String a ="Automation";
		String b ="automation";
		String c ="Testing";
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(a.equalsIgnoreCase(c));
		//assignment-38
		String d= "KV No 2";
		System.out.println(d.replace('K', 'T'));
		
		//assignment-39
		
		String city= "I am in Bangalore";
		System.out.println(city.replace("Bangalore", "Manguru"));
		
		//assignment-40
		String name1 = "Nichols High School";
		System.out.println(name1.replace("High", ""));
		
		//assignment-41
		String org= "Nichols High School";
		System.out.println(org.replaceAll(org, ""));
		
		//assignment-42
		String org1="I am The Boss";
		System.out.println(org1.replaceAll("[A-Z]", ""));
		
		//assignment-43
		String org2="My home is near to sector 2 Patna 8";
		System.out.println(org2.replaceAll("[0-9]", ""));
		
		//assignment-44
		String s1=  "kv no 2";
		System.out.println(s1.length());
		
		//assignment-45
		String s2="My name is Ram";
		System.out.println(s2.startsWith("M"));
		
		//assignment-46
		String s3= "I'm a boy";
		System.out.println(s3.endsWith("y"));
		
		//assignment-47
				String s4= "I'm a simple boy";
				System.out.println(s4.contains("s"));
				
				//assignment-48
				String s5= "My name is Anisha";
				System.out.println(s5.replace(" ", "_"));
		
		
		
		
		
		

	}

}
