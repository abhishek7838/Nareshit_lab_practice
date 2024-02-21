package day38.secondprogram.march30;

public class Test
{
//	public static void main(String []args)
//	 {
//	 Thread t = Thread.currentThread();
//	System.out.println(t);
//	 System.out.println("Name of thread : "+t.getName());
//	System.out.println("Id of thread : "+t.getId());
//	 } 
	//PROGRAM-2:
		/*public static void main(String args[])
		{
		 new Thread()
		{
		 public void run()
		{
		 System.out.println("task one");
		 }
		 }.start();
		 new Thread()
		 {
		 public void run()
		{
		 System.out.println("task two");
		 }
		 }.start();
		 
		}*/
	//PROGRAM-4:
	
		public static void main(String args[])
		{
		 Runnable r1=new Runnable()
		 {
		 public void run()
		{
		 System.out.println("task one");
		 }
		 };
		 Runnable r2=new Runnable()
		 {
		 public void run()
		{
		 System.out.println("task two");
		 }
		 };
		 
		 Thread t1=new Thread(r1);
		 Thread t2=new Thread(r2);
		 t1.start();
		 t2.start();
		}

}
