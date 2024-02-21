package day56may;

public class Example2 {

	public static void main(String[] args) 
	{
		Runnable r=()->System.out.println("Thread Started");
		Thread th=new Thread(r);
		th.start();
		

	}

}
