package nitmarch30program11;

public class ThreadB extends Thread 
{
	String p;
	public void run(String e)
	{
		this.p=e;
		for(;;)
		{
			System.out.println("p will be printed :"+p);
		}
	}

}
