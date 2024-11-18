package practice_package;

import java.util.Date;

public class FindDate {

	public static void main(String[] args) {
		Date d1= new Date();
         long l1=  d1.getTime();
         System.out.println(l1);
         
         Date d2= new Date(d1.getTime());
         System.out.println(d2);
         
         String d3=d2.toString();
         String month = d3.substring(4, 7);
         String year = d3.substring(d3.length()-4);
         String date=d3.substring(8, 10);
        // String month = d3.substring(4, 7);
         System.out.println(month);
         System.out.println(year);
         System.out.println(date);
         System.out.println(month + date+ year);
         

	}

}
