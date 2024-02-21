package nit.march2;

import java.util.*;
public class Pattern 
{
	public String numberPattern4(int a)
	{
		if(a==0)
			System.out.println("-2");
		if(a<0)
			System.out.println("-1");
//		for(int i=1;i<=a;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				if(i%2==0)
//				 System.out.print(j*i+" ");
//				else
//					System.out.print(j*i+" ");
//			}
//			System.out.println();
//			
//			
//		}
//		
		String result="1\n";
		for(int i=2;i<=a;i++)
			{
				for(int j=1;j<=i;j++)
				{
					int num=i*j;
					result +=num+" ";
					}
				result+="\n";
			}
		return result;
	}


	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int a=sc.nextInt();
		Pattern p=new Pattern();
	    //p.numberPattern4(a);
	    sc.close();
	    System.out.println(p.numberPattern4(a));
		

	}

}
