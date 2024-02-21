package march24;
import java.util.*;
public class EmployeeTester {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Emp Name : ");
		String name=sc.next();
		System.out.println("Enetr Emp Id : ");
		int id=sc.nextInt();
		System.out.println("Enetr emp Salary : ");
		
		double salary=sc.nextDouble();
		System.out.println("Enter emp Post : ");
		String post=sc.next();
		ManagerType role=null;
		if(ManagerType.HR==ManagerType.valueOf(post.trim()))
		{
			role=ManagerType.HR;
		}
		else if(ManagerType.SALAES==ManagerType.valueOf(post.trim()))
		{
			role=ManagerType.SALAES;
		}
		else
			System.out.println("invalid selection Please Choose HR or SALAES: ");
		
		Manager m1=new Manager(name,id,salary,role);
		System.out.println(m1);
		System.out.println("Enter a Speed :");
		int speed=sc.nextInt();
		System.out.println("enetr a ACCURACY : ");
		int accuracy=sc.nextInt();
		Clerk c1=new Clerk(name,id,salary,speed,accuracy);
		System.out.println(c1);
		
      sc.close();
	}

}
