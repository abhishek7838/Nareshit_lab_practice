package nit.march8;

import java.util.Arrays;
import java.util.Scanner;
public class StudentMarks 
{
	
	public float studentMrks(int []marks)
	{
		float avrg;
		int total=0;
		for(int i=0;i<marks.length;i++)
		{
		 total+=marks[i];
		}
		System.out.println("Total of marks : "+total);
		System.out.println("Student subject of marks :"+Arrays.toString(marks));
		avrg=(float)total/marks.length;
		return avrg;
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);		
		System.out.println("enter the size for the array");
		int [] sub=new int[sc.nextInt()];
		System.out.println("Enter a number of Subject :");
		
		for(int i=0;i<sub.length;i++)
		{
			 sub[i]= sc.nextInt();
		}
		StudentMarks sm=new StudentMarks();
		float result=sm.studentMrks(sub);
		System.out.println("the avg is :"+result);
		sc.close();

	}

}
