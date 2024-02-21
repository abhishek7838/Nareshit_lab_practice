package nit.march10;
import java.util.Arrays;
import java.util.Scanner;
public class CreatingArry 
{
	public static int[] addElement(int arr[],int a)
	{
		
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		CreatingArry ab=new CreatingArry();
		int input[]= {6,4,3,6};
		System.out.println("old array : "+Arrays.toString(input));
		int input1[]=new int[10];
		System.out.println("enter e size");
		int siz=sc.nextInt();
		int k=3;
		for(int i=0;i<10;i++)
		{
			if(i<input.length)
			input1[i]=input[i];
			else
			{
				input1[i]=k;
				k++;
			}
		}
		System.out.println(Arrays.toString(input1));
		

	}

}
