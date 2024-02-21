package nit.feb20;

public class Test11 
{
	static int x=10;
	static int y=20;
	static
	 {
	System.out.println("---Test11 static2 called---");
	System.out.println("X : "+x);
	System.out.println("y : "+y);
	}
	public static void m1()
	 {
	System.out.println("X : "+x);
	System.out.println("y : "+y);
	 }
	 public static void main(String[] args)
	  {
	 m1();
	 }
	 static 
	  {
	 System.out.println("---Test11 static1 called---");
	 System.out.println("X : "+x);
	 System.out.println("y : "+y);
	  }
}
