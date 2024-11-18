package prac2;

import java.util.HashMap;
import java.util.Map;

public class Mapinter {

	public static void main(String[] args) {
			Map m1= new HashMap();
			m1.put("name", "Anisha");
			m1.put("age", "twenty");
			m1.put("country", "india");
			m1.put("desg", "test engineer");
			m1.put("location", "bangalore");
            System.out.println(m1.keySet());
           // for(String s1: m1.keySet()
            {
            	System.out.println(m1.values());
            }
         }
}
