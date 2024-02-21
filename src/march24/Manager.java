package march24;

public class Manager extends Employee
{
	private ManagerType type;

	public Manager(String name, int empID, double empSalary) 
	{
		super(name, empID, empSalary);	
	}

	public ManagerType getType() {
		return type;
	}

	public void setType(ManagerType type) {
		this.type = type;
	}

	public Manager(String name, int empID, double empSalary, ManagerType type) 
	{
		super(name, empID, empSalary);
		this.type = type;
		this.setEmpSalary(empSalary);
	}
	public void setEmpSalary(double empSalary)
	{
        if(this.type==ManagerType.HR)
        {
        	super.setEmpSalary(empSalary+10000);
        }
        else if(this.type==ManagerType.SALAES)
        {
        	super.setEmpSalary(empSalary+5000);
        }
	}

	@Override
	public String toString() {
		return super.toString();
	}
	

}
