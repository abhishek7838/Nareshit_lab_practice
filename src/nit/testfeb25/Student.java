package nit.testfeb25;

public class Student 
{
	private int studentId;
	private String studentName;
	private int marks;
	private char grade;
	
	public Student(int studentid, String studentname, int mark)
	{
		
		studentId = studentid;
		studentName = studentname;
		marks = mark;
	}
	public void caclulateGrade()
	{
		if(marks>90)
			grade='A';
		if(marks>80 && marks<=90)
			grade='B';
		if(marks>70 && marks<=80)
			grade ='C';
		if(marks>60 && marks<=70)
			grade='D';
		if(marks<=60)
			grade='E';
	}
	String displayDetails()
	{
		return "name="+studentName+","+"StudentId="+studentId+","+"marks="+marks+","+"Grade="+grade;
	}

}
