package oopsmarch20;

public class NitOops {

	public static void main(String[] args) 
	{
		OopsTest8 a = new OopsTest8();
		OopsTest8 a1 = new OopsTest8();
		a = a1;
		Class x = a.getClass();
		Class x1 = a1.getClass();
		System.out.println(x==x1);
		

	}

}
