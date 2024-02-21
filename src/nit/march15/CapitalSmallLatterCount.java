package nit.march15;
import java.util.*;
public class CapitalSmallLatterCount {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String : ");
		String s1=sc.nextLine();
		int small=0,capital=0,other=0;
		
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>=97&&s1.charAt(i)<=122)
			{
				small++;
			}
			else
			{
			if(s1.charAt(i)>=65&&s1.charAt(i)<=90)
				capital++;
			else
				other++;
			}
			
		}
		System.out.println("Total Charecter : "+s1.length());
		System.out.println("Small Latter : "+small);
		System.out.println("Capital Latter : "+capital);
		System.out.println("Other Charecter : "+other);
		sc.close();

	}
	

}
