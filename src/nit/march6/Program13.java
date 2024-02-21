package nit.march6;
import java.util.*;
public class Program13 
{
	public int [] newArray(int arr[])
	{
		int arr1[]=new int[arr.length*2];
		arr1[arr1.length-1]=arr[arr.length-1];
		return arr1;
	}

	public static void main(String[] args) 
	{
		int input[]= {2,4};
		Program13 p=new Program13();
		int result []=p.newArray(input);
		System.out.println("New Array : "+Arrays.toString(result));
	}

}
