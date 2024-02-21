package nit.march14;

public class Program2 
{
	
	public static void main(String[] args) 
	{
		int i,j;
		char temp;
		String str="programmer";
		char ch[]=str.toCharArray();//p r o g r a m m e r
		for(i=0;i<ch.length;i++)
		{
			for(j=i+1;j<ch.length;j++)
			{
				if(ch[i]>ch[j])
				{
					temp=ch[i];
					ch[i]=ch[j];
				    ch[j]=temp;
				}
			}
			
		}
		for(i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]+" ");
		}
		
		

	}

}
