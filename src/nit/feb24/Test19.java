package nit.feb24;

public class Test19 
{
	int x;
	int y;
	void m1(Test t){
	System.out.println("\t t:"+t);
	t=new Test();
	System.out.println("\t t:"+t);
	}
	public static void main(String[] args)
	{
	Test t1=new Test();
	Test t2=new Test();
	System.out.println("t2:"+t2);
	t1.m1(t2);
	System.out.println("t2:"+t2);
	}

}
