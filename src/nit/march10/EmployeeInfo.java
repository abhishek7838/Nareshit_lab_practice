package nit.march10;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
public class EmployeeInfo 
{
	private int employeeId;
	private String employeeName;
	private Date dateOfJoning;
	

	public EmployeeInfo(int employeeId, String employeeName, Date dateOfJoning) {
		
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.dateOfJoning = dateOfJoning;
	}
	
	@Override
	public String toString() {
		return "EmployeeInfo [employeeId=" + employeeId + ", employeeName=" + employeeName + ", dateOfJoning="
				+ dateOfJoning + "]";
	}

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size :");
		int size=sc.nextInt();
		EmployeeInfo []e = new EmployeeInfo[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter employee Id : ");
			int id=sc.nextInt();
			System.out.println("enter Employee Name : ");
			String name=sc.next();
			Date d=new Date();
			e[i]=new EmployeeInfo(id,name,d);
		}
		for(EmployeeInfo x:e)
		{
		System.out.println(x);
		}
		

	}

}
