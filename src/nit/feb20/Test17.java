package nit.feb20;

public class Test17 
{
	static int x;
	static
	{
	x = 100;
	}
	static
	{
	x = 200;
	}
	static 
	{
	x = 300;
	}
	static
	{
	System.out.println("x value is :"+x);
	}
}
