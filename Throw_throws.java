package assignment;

import java.io.IOException;

public class Throw_throws  {
	
	
	  void Bus() throws IOException {
		throw new  IOException();
		
	}

	public static void main(String[] args) throws IOException {
		
     System.out.println("Hello world");
     Throw_throws  s1= new Throw_throws ();
     s1.Bus();
	}

}
