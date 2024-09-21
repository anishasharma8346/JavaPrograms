package practice_package;
//import java.lang.Math;

class ThreadProgrm 


{

	public static void main(String[] args) throws InterruptedException {
	
		for (int i=1;i<=12;i++)
		/*	
		{
			Thread.sleep(2000);
		System.out.println(Math.random());
		}*/
		{
			if (i==11)
			{
				continue;
			}
			System.out.println(i);
		}

	}

}
