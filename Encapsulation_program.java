package assignment;

class Amazon_info {
	private String emailid= "anisha.sharma@gmail.com";

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	
	}

public class Encapsulation_program {

	public static void main(String[] args) {
		
		Amazon_info a1= new Amazon_info();
		a1.setEmailid("anisha-infosys@gmail.com");
		System.out.println(a1.getEmailid());
		
	}

}
