package nit.feb15;

public class Manager {
	private int Mangerid;
	private String ManagerName;
	
	
	public Manager(Employee e) {//e=e1
		super();
		Mangerid = e.getEmpNumber();
		ManagerName = e.getEmpName();
	}


	@Override
	public String toString() {
		return "Manager [Mangerid=" + Mangerid + ", ManagerName=" + ManagerName + "]";
	}
	



}
