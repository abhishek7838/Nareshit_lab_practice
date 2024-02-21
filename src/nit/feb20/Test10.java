package nit.feb20;

public class Test10 
{
	static
	 {
	System.out.println("Static Block");
	}
	public static void m1() 
	 {
	System.out.println("m1 static method");
	}
	public static void main(String []args)
	 {
	Test10.m1();
	 }
}
