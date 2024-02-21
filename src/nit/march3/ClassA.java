package nit.march3;

public class ClassA 
{
	private int data=15;
	  
	public void show()
	{
		System.out.println("Instance Vriable :"+data);
	}
	 
	public  ClassA()
	 {
		 ClassB abc=new ClassB(this);
				 abc.display();
	 }

}
