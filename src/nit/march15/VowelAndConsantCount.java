package nit.march15;
import java.util.*;

public class VowelAndConsantCount {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr a String : ");
		int v=0,con=0;
		String s1=sc.nextLine();
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='0'||s1.charAt(i)=='u'||s1.charAt(i)=='A'||s1.charAt(i)=='E'||s1.charAt(i)=='I'||s1.charAt(i)=='O'||s1.charAt(i)=='U')
			{
				v++;
			}
			else
				con++;
		}
		System.out.println("String is : "+s1);
		System.out.println("String size : "+s1.length());
		System.out.println("Vowels : "+v);
		System.out.println("Consonant : "+con);
		

	}

}
