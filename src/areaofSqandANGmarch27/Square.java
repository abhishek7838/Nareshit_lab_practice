package areaofSqandANGmarch27;

public class Square extends Shape
{
	Square(int a)
	{
	   super(a);
	}
	public int  areaOfSquare()
	{
		int side = getX();
       return side*side;
	}
	

}
