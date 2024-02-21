package march23.lab;

public class Maneger extends Employee
{
	private ManagerType type;

	public ManagerType getManager()
	{
		return type;
	}
	public void setManager(ManagerType mng)
	{
		this.type=mng;
	}
	public void setSalary(double salry)
	{
		switch(type)
		{
		case HR:
			super.setSalary(salry+10000); break;
		case SALES:
			super.setSalary(salry+10000); break;
			default :
				System.out.println("Invalid selection");
		}
	}
	public Maneger()
	{
		
	}
	public Maneger(String name,int iD,double salry)
	{
		
	}
	

}
