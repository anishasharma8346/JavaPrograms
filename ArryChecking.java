package practice_package;

public class ArryChecking {

	public static void main(String[] args) {
		
		int arry []= new int[4];
		arry[0]=90;
		arry[1]=99;
		arry[2]=65;
		arry[3]=77;
		
	
		int b =90;
		
		for(int i=0;i<4;i++)
		{
			if(b==arry[i])
			{
				System.out.println(b +" is persent at position " + i);
			}
		}
		
		
		
		

	}

}
