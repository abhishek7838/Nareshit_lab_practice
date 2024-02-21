package string.march16;


public class CountNumOccurrence {

	public static void main(String[] args) 
	{
		String str="javja";
		int i,j,c=1;
		char ch[]=str.toCharArray();
		char ch2[]=new char[ch.length];
		for(i=0;i<str.length();i++)
		{
			
			for(j=i+1;j<ch.length;j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					c++;
					ch2[ch.length-1]=ch[i];
				}
			}
			System.out.print(c +" "+str.charAt(i));
		}
	
		
	

	}

}
