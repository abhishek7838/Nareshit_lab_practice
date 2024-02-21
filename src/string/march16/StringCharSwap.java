package string.march16;

import java.util.Arrays;

public class StringCharSwap 
{
	

	public static void main(String[] args) 
	{
		String str="zbhishekdjdbjdlsjdflsdjslja";
	    char ch[]=str.toCharArray();
	    ch[0]=str.charAt(str.length()-1);
	    ch[str.length()-1]=str.charAt(0);
	    System.out.println(Arrays.toString(ch));
	   
	    

	}

}
