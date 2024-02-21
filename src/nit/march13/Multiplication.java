package nit.march13;
import java.util.*;
public class Multiplication
{
	

	public static void main(String[] args)
	{
		int i,j,k;
		int arr1[][];
		int arr2[][];
		int arr3[][];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a row size :");
		int r1=sc.nextInt();
		System.out.println("Enter a column size :");
		int c1=sc.nextInt();
		arr1=new int[r1][c1];
		System.out.println("Enter "+(r1*c1)+" elements");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{
				arr1[i][j]=sc.nextInt();
			}
		}
		System.out.println("First array : ");
		for(int x[]:arr1)
		{
			System.out.println(Arrays.toString(x));
		}
		System.out.println("Enter for 2nd Array of Row Number : ");
		int r2=sc.nextInt();
		System.out.println("Enter for 2nd Array of Column Number : ");
		int c2=sc.nextInt();
		arr2=new int[r2][c2];
		System.out.println("Enter "+(r2*c2)+" Element for 2nd Array :");
		for(i=0;i<r2;i++)
		{
			for(j=0;j<c2;j++)
			{
				arr2[i][j]=sc.nextInt();   
			}                                                   
		}
		System.out.println("this is 2nd Array: ");
		for(int x2[]:arr2)
		{                                                        //arr2
			System.out.println(Arrays.toString(x2));//arr1. 1 2 3  8 7 3
                                                    //      4 5 6  8 6 5
		}
		arr3=new int[r1][c2];
		System.out.println("Multiplication Array :");
		if(r1==c2&&c1==r2)
		{
		
			for(i=0;i<r1;i++)
			{
				for(j=0;j<c2;j++)
				{
					arr3[i][j]=0;
					for(k=0;k<r1;k++)
					{
						arr3[i][j]+=arr1[i][j]*arr2[k][j];
					}
					System.out.print(arr3[i][j]+" ");
				}
				System.out.println();
			}
		}
		else
			System.out.println("plz enter 1st Array row and 2nd array"+"\n"+" colmn size should be same ");
		
		
	
	}
	

}
