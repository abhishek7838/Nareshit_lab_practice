package march24;

public class Employee
{
	private String name;
	private int empID;
	private double empSalary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public Employee(String name, int empID, double empSalary) {
		super();
		this.name = name;
		this.empID = empID;
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empID=" + empID + ", empSalary=" + empSalary + "]";
	}
	

}
