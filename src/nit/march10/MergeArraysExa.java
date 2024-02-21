package nit.march10;

import java.util.Arrays;

public class MergeArraysExa 
{
	public static int[] mergeArrayElement(int arr1[],int arr2[])
	{
		
		int arrr[]=new int[arr1.length+arr2.length];
		
		for(int i=0;i<arr1.length;i++)
		{
			if(i<arr1.length)
			arrr[i]=arr1[i];
			
		}
		
			
		return arrr;
	}

	public static void main(String[] args) 
	{
		int input1[]= {3,4,5};
		int input2[]= {7,9,6};
		int result[] =mergeArrayElement(input1,input2);
		
		System.out.println(Arrays.toString(result));

	}

}
