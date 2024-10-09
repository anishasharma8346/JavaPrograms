package practice_package;

public class AraayFunctions {

	public static void main(String[] args) {
		
		int Student []= new int[4];
		Student[0]=74;
		Student[1]=96;
		Student[2]=72;
		Student[3]=70;
		
		int notochk=70;
		for(int i=0;i<4;i++)
		{
			if(notochk == Student[i])
			{
				System.out.println(notochk + " is a part of array at the index " +i);
			}
			else
			{
				System.out.println(notochk + " is not a part of array at the index " +i);
				
			}
		}
		
		
		
		
		
		}

}
