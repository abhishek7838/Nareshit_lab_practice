package areaofSqandANGmarch27;

public class Ractangle extends Shape
{
	private int length;
	
	Ractangle(int a,int b)
	{
		super(a);
		this.length=b;
	}
	public int areaOfRactangle()
	{
		int a=getX();
		int b=getLength();
		int area=a*b;
		return area;
	}
	public int getLength() {
		return length;
	}
	

}
