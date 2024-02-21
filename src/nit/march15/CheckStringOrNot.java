package nit.march15;

public class CheckStringOrNot 
{
	public static boolean digit(String s)
	{
		
		for(int i=0;i<s.length();i++)
		{
			if(Character.isDigit(s.charAt(i)))
			{
				return false;
			}
		
		}
		return true;
	}	
	public static void main(String[] args) 
	{
		String s1="java";
		System.out.println(digit(s1));
	}

}
