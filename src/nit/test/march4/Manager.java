package nit.test.march4;

public class Manager 
{
	private int managerId;
	
	public Manager()
	{
		 this.managerId=34;;
			
		Employee obj=new Employee(this);
		
	}
	public void display()
	{
		System.out.println("Manager Id :"+managerId);
	}

}
