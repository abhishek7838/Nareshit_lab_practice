package march24;

public class Clerk extends Employee
{
	private int speed;
	private int accuracy;

	public Clerk(String name, int empID, double empSalary)
	{
		super(name, empID, empSalary);	
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}

	public Clerk(String name, int empID, double empSalary, int speed, int accuracy)
    {
		super(name, empID, empSalary);
		this.speed = speed;
		this.accuracy = accuracy;
		this.setEmpSalary(empSalary);
	}
	public void setSalary(double salary)
	{
		boolean amt=true;
		if(amt&&this.speed>70&&this.accuracy>80) 
		{
			super.setEmpSalary(salary+1000);
		}
		else
			super.setEmpSalary(salary);
	}

	@Override
	public String toString() {
		return super.toString()+"Clerk [speed=" + speed + ", accuracy=" + accuracy + "]";
	}
	
	

}
