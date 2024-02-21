package nitmarch30program15;

public class Test extends Thread
{
	static int k1,k2;
	public void run()
	{
		while(true)
		{
			System.out.println("synchronized");
			synchronized(Test.class)
			{
				k1++;
				k2++;
				if(k1<=k2)
				{
					
					System.out.println("k1: "+k1+" k2: "+k2);
					System.exit(0);
				}
			}
			System.out.println("synchronized");
		}
	}

}
