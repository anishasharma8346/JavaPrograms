package prac2;

public class DuplicateNo {

	public static void main(String[] args) {
		int arr[]= {22,34,67,888,22};
		boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("duplicate element found:  "+arr[i]);
					flag=true;
				}
			}
		}
		if(flag==false)
		{
			System.out.println("no duplicate found");
		}
		

	}

}
