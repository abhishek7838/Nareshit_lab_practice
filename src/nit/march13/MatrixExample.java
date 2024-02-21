package nit.march13;
import java.util.*;
public class MatrixExample {

	public static void main(String[] args) 
	{
		int i,j;
		int arr[][];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a first array size of row:");
		int r=sc.nextInt();
		System.out.println("enter first array of column");
		int c=sc.nextInt();
		arr=new int[r][c];
		System.out.println("Arrays Size : "+arr.length);
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				arr[i][j]=sc.nextInt();
			}
			
		}
//		for(i=0;i<arr.length;i++)
//		{
//			for(j=0;j<arr.length;j++)
//			{
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		for(int x[]:arr)
		{
			System.out.println(Arrays.toString(x));
		}
		
		//Question :2
		
		System.out.println("enetr a element for serching index number :");
		int ele=sc.nextInt();
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<c;j++)
			{
				if(arr[i][j]==ele)
				{
					System.out.println("index size ["+i+"]["+j+"]");
				}
			}
		}
		System.out.println("\n");
		
//		Question : 3
		int arr2[][];
		System.out.println("enter a second arr of row number :");
		int r2=sc.nextInt();
		System.out.println("enter a second arr of coumn number :");
		int c2=sc.nextInt();
		arr2=new int[r2][c2];
		for(i=0;i<r2;i++)
		{
			for(j=0;j<c2;j++)
			{
				arr2[i][j]=sc.nextInt();
				
			}
		}
		System.out.println("Second Array : ");
		for(int x2[]:arr2)
		{
			System.out.println(Arrays.toString(x2));
		}
		
		
		

	}

}
