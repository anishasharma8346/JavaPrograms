package assignment;

public class Class39 {

	private String car="machine";
	
public  void set_Brake(String car) 
{
	this.car=car;
}
public  String get_Brake() 
{
	return car;
}

	
  public static void main(String[] args) {
		
	  Class39 c1= new Class39();
	  c1.set_Brake("Maruti");
		System.out.println(c1.get_Brake());

	}
/*public String getCar() {
	return car;
}
public void setCar(String car) {
	this.car = car;
}*/

}
