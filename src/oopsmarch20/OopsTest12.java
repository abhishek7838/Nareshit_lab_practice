package oopsmarch20;

public class OopsTest12 
{
	static String studentName;
	static float studentfee;
	static void set(String name ,float fee)
	{
		studentName=name;
		studentfee=fee;
	}
	static void get()
	{
		System.out.println(studentName+" "+studentfee);
	}

	public static void main(String[] args) 
	{
		OopsTest12.set("NareshIt",500);
		OopsTest12.get();
		

	}

}
