package nit.feb27;

public class Costmer 
{
	private String name;
	private int id;
	public Costmer(String name , int id)
	{
	this.name=name;
	this.id=id;
	}
	public void setId(int id) //setter 
	{
	this.id=id;
	}
	public int getId() //getter
	{
	return id;
	}
	}
