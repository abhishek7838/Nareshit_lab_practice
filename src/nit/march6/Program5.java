package nit.march6;

import java.util.Arrays;

public class Program5 
{
	public int[] rotatedArrays(int arr[])
	{
		
		
		return new int[] {arr[2],arr[1],arr[0]};
	}
	public static void main(String[] args) 
	{
		Program5 p5=new Program5();
		int input[]= {1,2,3};
		int newarr[]=p5.rotatedArrays(input);
        System.out.println("Array Rotated : "+Arrays.toString(newarr));
	}
}
