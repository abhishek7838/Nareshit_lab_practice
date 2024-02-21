package nit.march3;

public class ClassB //haja relation
{
	private ClassA ab;
	ClassB(ClassA ab)
	{
		this.ab=ab;
	}
	void display()
	{
	ab.show();
	}
	

}
