package collectionExampleComparable;

public class ClassA 
{
	private int empId;
	private String empName;
	private double empSalary;
	public ClassA(int empId, String empName, double empSalary)
	{
		
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {
		return empId + " " + empName + " " + empSalary ;
	}
	public Integer getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public Double getEmpSalary() {
		return empSalary;
	}
	
	

}
