package practice_package;

import java.util.Arrays;

public class StrFun {

	public static void main(String[] args) {
	/*String a ="Automation";
	char[] b= a.toCharArray();
	System.out.println(Arrays.toString(b));*/
	
	int rollno []= new int[4];
	rollno[0]= 127;
	rollno[1]=128;
	rollno[2]=129;
	rollno[3]=130;
	//for(int i=0; i<=4; i++)
	//System.out.println(rollno[i]);
	System.out.println(Arrays.toString(rollno));
	char gender[]= new char[3];
	gender[0]='M';
	gender[1]='F';
	gender[2]='F';
	System.out.println(Arrays.toString(gender));
	String name[]= new String[3];
	name[0]=null;
	name[1]= "Testing";
	name[2]= "Automation";
	
	System.out.println(Arrays.toString(name));
	
	
	
	

	}

}
