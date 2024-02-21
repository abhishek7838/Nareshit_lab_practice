package nit.march6;
import java.util.Arrays;
public class Program6 
{
	public int []reversArray(int []arr)
	{
		return new int[] {arr[2],arr[1],arr[0]};
	}
	public static void main(String[] args)
	{
		int input[]= {2,3,4};
		Program6 p6=new Program6();
		int result[]=p6.reversArray(input);
		System.out.println("Reverse Element : "+Arrays.toString(result));	
	}
}
