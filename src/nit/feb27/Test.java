package nit.feb27;

public class Test 
{
	public static void main(String[] args) 
	{
	int val=100;
	Costmer c = new Costmer("Ravi",2);
	m1(c);
	//GC
	System.out.println(c.getId());
	}
	public static void m1(Costmer c)
	{
	c.setId(5);
	c = new Costmer("Rahul",7);
	c.setId(9);
	System.out.println(c.getId());
	}
}
