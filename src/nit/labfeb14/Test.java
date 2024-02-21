package nit.labfeb14;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("HOW MANY WANTS OBJ");
		int obj=sc.nextInt();
		for(int i=1;i<=obj;i++)
		{
			Employee e=Employee.getEmployeeObject();
			System.out.println(e);
		}
		sc.close();
	}

}
