package nit.march8;
import java.util.*;
public class DuplicateElement {

	public static void main(String[] args) 
	{
		int i,j,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a size of array");
		int arr[]=new int[sc.nextInt()];
		for(i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}

		for(i=0;i<arr.length;i++)
		{
			c=1;
			for(j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				c++;
				
			}
			if(c==2)
			System.out.println(c+" times "+arr[i]);
		}
		
		
	}

}
