package day56may;

interface NIT1
{
	int square(int x);
	default int add(int a,int b)
	{
		return a+b;
	}
	default int sub(int a,int b)
	{
		return a-b;
	}
	default int mult(int a,int b)
	{
		return a*b;
	}
	default int divide(int a,int b)
	{
		return a/b;
	}
}
public class Example8 implements NIT1
{
	public int square(int y)
	{
		return y*y;
	}

	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		
		Example8 ex=new Example8();
		int add=ex.add(a, b);
		int squar=ex.square(b);
		int div=ex.divide(a, b);
		int mul=ex.mult(a, b);
		int sub=ex.sub(a, b);
		System.out.println(add+" "+div+" "+mul+" "+sub);
		NIT1 nit=val->val*val;
		System.out.println("Square: "+nit.square(2));
	
	}

}
