package march23.lab;

public class Employee 
{
	private String eName;
	private int empID;
	private double empSalary;
	public String getName()
	{
		return eName;
	}
     public void setName(String name)
     {
    	 this.eName=name;
     }
     public int getId()
 	{
 		return empID;
 	}
      public void setID(int id)
      {
     	 this.empID=id;
      }
      public double getSalary()
  	{
  		return empSalary;
  	}
       public void setSalary(double salary)
       {
      	 this.empSalary=salary;
       }
       public Employee ()
       {
    	   
       }
       public Employee(String name,int id,double sal)
       {
    	   
       }
     
}
