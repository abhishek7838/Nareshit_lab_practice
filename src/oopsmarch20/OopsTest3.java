package oopsmarch20;

public class OopsTest3 
{
	private String name;
	public String getName()
	{
		return name;
	}
	public void setName(String sname)
	{
		this.name=sname;
	}
	public String toString()
	{
		return this.name;
	}

	public static void main(String[] args) 
	{
		OopsTest3 nit=new OopsTest3();
		nit.setName("NareshIt");
		System.out.println(nit);
		

	}

}
