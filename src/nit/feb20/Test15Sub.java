package nit.feb20;

public class Test15Sub extends Test15Super
{
	
	static int x =20;
	static
	 {
	System.out.println("Test15Sub : static called");
	}
	static void m2()
	 {
	m1();
	System.out.println("Test15Sub : m2()");
	}
	public static void main(String[] args)
	{
		m2();
		}
	 
}
