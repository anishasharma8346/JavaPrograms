package assignment;

public class This_key {
	 This_key(){
		 
		 System.out.println("no para");
	 }
This_key(int a){
	this();
	 System.out.println("one para");
	 }
This_key(String b, boolean a){
	this(10);
	 System.out.println("string true");
}This_key(int c, int d){
	this("car",false);
	 System.out.println(3+3);
}

	public static void main(String[] args) {
	 new This_key(3,2);
   
	}

}
