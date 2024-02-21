package nit.march8;

import java.util.*;
public class MinElement 
{
	void minimumElement(int arr [])
	{
		int temp,i,j;
		int arr1[]=new int[arr.length];
		for(i=0;i<arr.length;i++)
		{
			for(j=1;j<arr.length;j++)//{5,8,9,3,56,7,3};
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
				
			}
			for( i=0;i<arr.length;i++)
				System.out.println(arr[i]);
		}
		
	}

	public static void main(String[] args)
	{
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a size of array ");
//		int a[]=new int[sc.nexInt];
		int b[]= {5,8,9,3,56,7,3};
		MinElement mn=new MinElement();
		mn.minimumElement(b);
		
		

	}

}
