package string.march16;

public class FirstNonRepChar 
{
	public static void main(String[] args) 
	{
		String str="abcda";
		char ch[]=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					ch[i]=str.charAt(j);
					
				}
			}
			System.out.print("first non-repeted : "+ch[i]+" ");
		}
		
		

	}

}
