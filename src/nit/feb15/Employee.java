package nit.feb15;

public class Employee {
	private int EmpNumber ;
	private String EmpName;
	Employee(int num,String name)
	{
		this.EmpNumber=num;
		this.EmpName=name;
	}
	public int getEmpNumber() {
		return EmpNumber;
	}
	
	public String getEmpName() {
		return EmpName;
	}
	
		
	

}
