package nit.march01;
import java.util.*;
public class WeekDay 
{
	 public String getDayName(int a)
	{
		if(a==1)
		{
			return "Monday";
		}
		if(a==2)
		{
			return "Tuesday";
		}
		if(a==3)
		{
			return "Wednesday";
		}
		if(a==4)
		{
			return "thirsday";
		}
		if(a==5)
		{
			return "friday";
		}
		if(a==6)
		{
			return "Saturday";
		}
		if(a==7)
		{
			return "Sunday";
		}
		return "INVALID NUMBER generates an integer "+ "between 1 and 7";
	}

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a NUmber Which Day you want to See:");
		int a=sc.nextInt();
		WeekDay ab=new WeekDay();
		System.out.println(ab.getDayName(a));
		sc.close();

	}

}
