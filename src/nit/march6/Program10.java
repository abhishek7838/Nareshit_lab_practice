package nit.march6;

import java.util.Arrays;

public class Program10 
{
	public int[] oldArrayFistLast(int arr[])
	{
		if(arr.length>1)
		{
			return new int[] {arr[0],arr[arr.length-1]};
		}
		else 
			return new int [] {0};
	}
	public static void main(String[] args) {
		int input1[]= {6,3,7,4};
		Program10 p=new Program10 ();
		int result[]=p.oldArrayFistLast(input1);
		System.out.println(Arrays.toString(result));
	}

}
