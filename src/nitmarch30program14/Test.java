package nitmarch30program14;

public class Test 
{
	public static void main(String[] args) 
	{
		Runnable r1=new Runnable()
		{
			public void run()
			{
				try 
				{
					while(true)
					{
						System.out.println("Hello,World");
						Thread.sleep(1000);
					}
					
				}
				catch(InterruptedException iex)
				{
					
				}
			}
			
		};
		Runnable r2=new Runnable()
		{
			public void run()
			{
				try 
				{
					while(true)
					{
						System.out.println("GoodBye,"+"Beautiful world!");
						Thread.sleep(2000);
					}	
				}
				catch(InterruptedException iex)
				     {
					
					}
			}
			
		};
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		t1.start();
		t2.start();
		
	}

}
