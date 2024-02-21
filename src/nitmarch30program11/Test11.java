package nitmarch30program11;

public class Test11 {

	public static void main(String[] args) 
	{
		ThreadA t1=new ThreadA();
		ThreadB t2=new ThreadB();
		Thread t3=new Thread(t1);
		Thread t4 =new Thread(t2);
		t3.start();
		
		
	}

}
