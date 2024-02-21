package nit.march6;

import java.util.Arrays;

public class Program9 
{
	public int[] twoArrayMidElement(int []a,int[]b)
	{
		int arr[]= {a[1],b[1]};
		return arr;
		
	}
	public static void main(String[] args) 
	{
		int input1[]= {4,6,2};
		int input2[]= {9,8,6};
		Program9 p=new Program9 ();
		int result[]=p.twoArrayMidElement(input1, input2);
		System.out.println(Arrays.toString(result));
	}
}
