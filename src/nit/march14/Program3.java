package nit.march14;

import java.util.Arrays;

public class Program3 {

	public static void main(String[] args) 
	{
		int i,j,c=1;
		String str="programmer";
		char ch[]=str.toCharArray();
		System.out.println("String :"+Arrays.toString(ch));
		for(i=0;i<ch.length;i++)
		{
			for(j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					c++;
					System.out.println(ch[i]+" Duplicate char "+c+" times");
				}
			}
		}
		

	}

}
