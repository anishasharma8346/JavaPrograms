package prac2;

public class ArraysPrac {
	
public static void main(String[] args) {
	int a= 1234;
	int output= 0;
	while(a>0)
	{
		output=output*10+ a%10; //10 
		a=a/10; //123
		
	}
	System.out.println(output);
	}

}
