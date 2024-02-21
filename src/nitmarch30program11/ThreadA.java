package nitmarch30program11;

public class ThreadA extends Thread 
{
	String s;
	public void run(String t)
	{
		this.s=t;
		for(;;)
		{
			System.out.println(("s will be printed :"+s));
		}
	}

}
