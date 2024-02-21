package nitmarch30program14;

public class Test13 extends Thread
{
	public static void main(String[] args)
	{
		Test13 t1=new Test13();
		t1.run();
		t1.start();
		
	}
	public void start()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Value i : "+i);
		}
	}
}
