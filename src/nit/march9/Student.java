package nit.march9;

import java.util.*;
public class Student 
{
	private int studentId;
	private String studentName;
	Student(int id,String name)
	{
		this.studentId=id;
		this.studentName=name;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr a size of Student :");
		int size=sc.nextInt();
		Student st[]=new Student[size];
		for(int i=0;i<st.length;i++)
		{
			System.out.println("eneer a Student Id : ");
			int sid=sc.nextInt();
			System.out.println("Enter a Student Name : ");
			String sname=sc.next();
//			sname=sc.nextLine();
			st[i]=new Student(sid,sname);
			
		}
		System.out.println(Arrays.toString(st));
		
		

	}

}
