package prac2;

public class MxInArray {

	public static void main(String[] args) {
	int no[]= {2,4,9,25,33,10};
	int max=no[0];
	for(int i=0;i<no.length;i++)
	{
		if(no[i]>max)
		{
			max=no[i];
		}
	}
	System.out.println(max);

	}

}
