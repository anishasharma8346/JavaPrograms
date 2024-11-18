package prac2;

public class Minimum {

	
		public static void main(String[] args) {
			int no[]= {2,4,9,25,33,10};
			int min=no[0];
			for (int i=0;i<no.length;i++)
			{
				if(no[i]<min)
				{
					min=no[i];
				}
			}
			System.out.println(min);
	}

}
