package oopsConceptmarch21;

public class ClassA19 
{
	static int var1=20,var2;
	public ClassA19(int var)
	{
		this.var1=var;
	}
	public void method1() {
		this.var2=this.var2+1;
		ClassA19.var1=ClassA19.var1-1;
	}


}
