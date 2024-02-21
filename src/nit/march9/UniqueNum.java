package nit.march9;
import java.util.*;
public class UniqueNum
{
	public int sumofArray(int arr[])
	{
		int i,j;
		for(i=0;i<arr.length;i++)
		{
		if(arr.length>0||arr[i]>0)
		{
			if(arr[i]>=0)
			{
				for(j=i+1;j<arr.length;j++)
				{
					if(arr[i]==arr[j])
					{
						continue;
					}
				}
			}
			return -2;
		}
		else
			return -1;
			
		}
				  
		
	}
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Array Size");
		int size=sc.nextInt();
		int input[]=new int[size];
		for(int i=0;i<input.length;i++)
		{
			input[i]=sc.nextInt();
			UniqueNum uN=new UniqueNum();
			uN.sumofArray(input);
		}
		
				
		
		
	}

}
