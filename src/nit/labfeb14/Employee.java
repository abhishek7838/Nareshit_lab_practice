package nit.labfeb14;

import java.util.Scanner;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double salary;
	public Employee(int employeeId, String employeeName, double salary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}
	public static Employee getEmployeeObject()
	{
		Scanner a=new Scanner(System.in);
		System.out.println("enter a employeeId :");
		int Id=a.nextInt();	
		System.out.println("enter EmpName :");
		String empName=a.next();
		System.out.println("enter EmpSalary :");
		double sal=a.nextDouble();
		Employee e1=new Employee(Id,empName,sal);
		a.close();
		return e1;
		
		
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary + "]";
	}
	
	

}
