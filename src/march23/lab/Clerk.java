package march23.lab;

public class Clerk extends Employee
{
	private ManagerType type;
	private int speed;
	private int accuracy;
	public ManagerType getmanger()
	{
		return type;
	}
	public void setManger(ManagerType clerk)
	{
		this.type=clerk;
	}
	public int getSpeed()
	{
		return speed;
	}
	public void setSpeed(int speed)
	{
		this.speed=speed;
	}
	public int getAccuracy()
	{
		return accuracy;
	}
	public void setAccuracy(int accuracy)
	{
		this.accuracy=accuracy;
	}
	public void setSalary(double sal)
	{
		if(speed>70&&accuracy>80)
		{
		  super.setSalary(sal+1000);
		
		}
		else
			System.out.println("Salary : "+sal);
		
	}
	public Clerk(ManagerType type)
	{
		
	}

	
}
