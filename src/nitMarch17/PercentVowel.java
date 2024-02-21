package nitMarch17;

public class PercentVowel {

	public static void main(String[] args) 
	{
		String str="abhi";
		int c=0;
		float per;
		for(int i=0;i<str.length();i++)
		{	
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.length()=='o'||str.length()=='u')
			{
				c++;
			}
		}
		per=(float)(c*100)/str.length();
		
		System.out.println(" vowel Percent : "+per);
		
	}

}
