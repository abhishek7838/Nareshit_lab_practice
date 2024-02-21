package nit.march15;

public class AppendStringEx {

	public static void main(String[] args) 
	{
		int j=0;
		String s2="java";
		char ch1[]=s2.toCharArray();
		String s4="is awesome";
		char ch2[]=s4.toCharArray();
		String s[]=new String[s2.length()+s4.length()];
		char ch5[]=new char[ch1.length+ch2.length];
		for(int i=0;i<ch5.length;i++)
		{
			ch5[j++]=ch1[i];
		}
	

	}

}
