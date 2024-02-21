package oopsmarch20;

public class OopsTest1 
{
	private String name;
	int a;
	public OopsTest1(String sName)
	{
		this.name=sName;	
	}
	void meth(int b)
	{
		this.a=b;
		System.out.println(a);
	}

	public static void main(String[] args) 
	{
		OopsTest1 nit=new OopsTest1("Nareshit");
		nit.meth(6);
		System.out.println(nit);
		
		

	}

}
