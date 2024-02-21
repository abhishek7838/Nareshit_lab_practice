package nit.march6;

public class Program8
{
	public int sumTwoElement(int arr[])
	{
		int sum=0;
		if(arr.length>2)
		{
			for(int i=0;i<2;i++)
			{
				sum+=arr[i];
			}
			return sum;		
		}
		else
			return 0;		
	}
	public static void main(String[] args)
	{
		Program8 p=new Program8();
		int input[]= {4,7,8};
		int result =p.sumTwoElement(input);
		System.out.println("Sum of first two element : "+result);
	}
}
